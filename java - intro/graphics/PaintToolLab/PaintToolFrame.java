/*******************************************************************************
 *
 *    Name: 
 *    Date: 
 *    Filename: PaintToolFrame.java
 *    Description: This is a special Frame that acts as a point tool.
 *
 *******************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.colorchooser.*;
import javax.swing.event.*;


public class PaintToolFrame extends JFrame
{
      //This Panel will contain the editting.
      private DrawingPanel draw_panel;
      
      //These are the components used to change the drawing shape, fill type,
      //    and color.
      private JRadioButton outline;
      private JRadioButton fill;
      private JRadioButton fill_and_outline;
      
      //We need to double up on the ColorChoosers since we have two different colors to choose
      private DefaultColorSelectionModel outlineColorPicker;
      private DefaultColorSelectionModel fillColorPicker;
      private ColorChoicePanel currentOutlineChoice;
      private ColorChoicePanel currentFillChoice;
      private JColorChooser outline_color_panel;
      private JColorChooser fill_color_panel;
      private JDialog outlineColorDialog;
      private JDialog fillColorDialog;
      
      //These buttons will be used to choose a rectangle or an ellipse.
      private JButton rectangle_button;
      private JButton ellipse_button;
      //These buttons will be used to open the choose color dialog boxes.
      private JButton choose_outline_color;
      private JButton choose_fill_color;
            
      /*
       * This is the constructor for our PaintToolFrame
       */
      public PaintToolFrame(String name)
      {
            //The keyword super simply sends name to the constructor of
            //  JFrame.
            super(name);
            
            //Construct the DrawingPanel
            draw_panel = new DrawingPanel();
            
            //Add the DrawingPanel to the Frame
            add(draw_panel, BorderLayout.CENTER);
            
            //Call the method below to add all the extra components
            createControlPane();
            
            createColorDialogs();
            
            //Create and set the menu bar
            JMenuBar menu_bar = new JMenuBar();
            setJMenuBar(menu_bar);
            
            //Call the methods to add the File menu to the menu bar 
            menu_bar.add(createFileMenu());
            
            pack();
            
      }//end constructor
      
      
      /*
       * The following method creates the control panel to change the font.
       */
      public void createControlPane()
      {
            //Create the four panels that control the font change
            JPanel shapeChoicePanel = createShapeChoice();
            JPanel fillChoicePanel = createFillChoice();
            JPanel colorChoicePanel = createChooseColorButtons();
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(3,1));
            controlPanel.add(shapeChoicePanel);
            controlPanel.add(fillChoicePanel);
            controlPanel.add(colorChoicePanel);
            
            //Add the panels to the content pane
            getContentPane().add(controlPanel, BorderLayout.SOUTH);
      }
      
      
      /*
       * The following method creates the file menu
       * postcondition: returns the JMenu for the file menu.
       */
      public JMenu createFileMenu()
      {
            JMenu menu = new JMenu(new String("File"));
            menu.add(createFileResetItem());
            menu.add(createFileExitItem());
            return menu;
      }//end createFileMenu method
      
      
      /*
       * The following method creates the file menu item to reset the screen
       * postcondition: returns the JMenuItem for the file menu item "Reset".
       */
      public JMenuItem createFileResetItem()
      {
            JMenuItem item = new JMenuItem(new String("Reset"));
            class MenuItemListener implements ActionListener
            {
                  public void actionPerformed(ActionEvent event)
                  {
                        int num_shapes = draw_panel.getNumShapes();
                        
                        for (int i = 0; i< num_shapes; i++)
                        {
                              draw_panel.removeShape();
                        }
                        
                        repaint();
                  }
            }
            ActionListener listener = new MenuItemListener();
            item.addActionListener(listener);
            return item;
      }//end createFileResetItem method
      
      
      /*
       * The following method creates the file menu item to quit the program
       * postcondition: returns the JMenuItem for the file menu item "Exit".
       */
      public JMenuItem createFileExitItem()
      {
            JMenuItem item = new JMenuItem(new String("Exit"));
            class MenuItemListener implements ActionListener
            {
                  public void actionPerformed(ActionEvent event)
                  {
                        System.exit(0);
                  }
            }
            ActionListener listener = new MenuItemListener();
            item.addActionListener(listener);
            return item;
      }//end createFileExitItem method
      
      
      /*
       * The following method creates the color chooser dialog boxes
       */
      public void createColorDialogs()
      {
            outlineColorDialog = new JDialog(this,new String("Choose a color"),true);
            fillColorDialog = new JDialog(this,new String("Choose a color"),true);
            outlineColorDialog.getContentPane().add(createOutlineColorChoicePanel(), BorderLayout.CENTER);
            fillColorDialog.getContentPane().add(createFillColorChoicePanel(), BorderLayout.CENTER);
            
            JButton outlineOkButton = new JButton("OK");
            JButton fillOkButton = new JButton("OK");
            
            //This class is used to create a special ActionListener for
            //    the ok button
            class OutlineButtonListener implements ActionListener
            {
                  /*
                   * This method is called whenever the ok button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        currentOutlineChoice.changeColor(outline_color_panel.getColor());
                        currentOutlineChoice.repaint();
                        draw_panel.changeOutlineColor(outline_color_panel.getColor());
                        outlineColorDialog.hide();
                  }//end actionPerformed method
            }
            
            //This class is used to create a special ActionListener for
            //    the ok button
            class FillButtonListener implements ActionListener
            {
                  /*
                   * This method is called whenever the ok button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        currentFillChoice.changeColor(fill_color_panel.getColor());
                        currentFillChoice.repaint();
                        draw_panel.changeFillColor(fill_color_panel.getColor());
                        fillColorDialog.hide();
                  }//end actionPerformed method
            }
            
            ActionListener outlineListener = new OutlineButtonListener();
            ActionListener fillListener = new FillButtonListener();
            
            outlineOkButton.addActionListener(outlineListener);
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel outlineButtonPanel = new JPanel();
            outlineButtonPanel.add(outlineOkButton);
            
            //Add the button panel to the content pane of the outlineColorDialog
            outlineColorDialog.getContentPane().add(outlineButtonPanel, BorderLayout.SOUTH);
            outlineColorDialog.pack();
            
            fillOkButton.addActionListener(fillListener);
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel fillButtonPanel = new JPanel();
            fillButtonPanel.add(fillOkButton);
            
            //Add the button panel to the content pane of the outlineColorDialog
            fillColorDialog.getContentPane().add(fillButtonPanel, BorderLayout.SOUTH);
            fillColorDialog.pack();
            
            
      }//end createColorDialogs method
      
      
      /*
       * The following method creates the radio buttons to choose the
       *         fill type.
       * postcondition: returns the panel containing the radio buttons.
       */
      public JPanel createFillChoice()
      {
            outline = new JRadioButton(new String("Outline"));
            fill = new JRadioButton(new String("Fill"));
            fill_and_outline = new JRadioButton(new String("Fill and Outline"));
            fill_and_outline.setSelected(true);
            
            class RadioButtonListener implements ActionListener
            {
                  public void actionPerformed(ActionEvent e)
                  {
                        char type;
                        
                        if (e.getActionCommand().equals("Outline"))
                        {
                              draw_panel.setFillType('o');
                        }
                        else if (e.getActionCommand().equals("Fill"))
                        {
                              draw_panel.setFillType('f');
                        }
                        else if (e.getActionCommand().equals("Fill and Outline"))
                        {
                              draw_panel.setFillType('b');
                        }
                        
                  }//end actionPerformed method
                  
            }//end RadioButtonListener class
            ActionListener listener = new RadioButtonListener();
            outline.addActionListener(listener);
            fill.addActionListener(listener);
            fill_and_outline.addActionListener(listener);
            
            //add radio buttons to a button group
            
            ButtonGroup group = new ButtonGroup();
            group.add(outline);
            group.add(fill);
            group.add(fill_and_outline);
            
            JPanel panel = new JPanel();
            panel.add(outline);
            panel.add(fill);
            panel.add(fill_and_outline);
            panel.setBorder
                  (new TitledBorder(new EtchedBorder(),new String("Size")));
            
            return panel;
      }//end createFillChoice method
      
      
      /*
       * The following method creates the buttons to choose a rectangle or an ellipse.
       * postcondition: returns the panel containing the textfield and button.
       */
      public JPanel createShapeChoice()
      {
            rectangle_button = new JButton(new String("Rectangle"));
            ellipse_button = new JButton(new String("Ellipse"));
            
            //This class is used to create a special ActionListener for the buttons
            class ButtonListener implements ActionListener
            {
                  /*
                   * This method is called when a button is clicked
                   */
                  public void actionPerformed(ActionEvent e)
                  {
                        if(e.getActionCommand().equals("Rectangle"))
                        {
                              draw_panel.setRectangle();
                        }
                        else if(e.getActionCommand().equals("Ellipse"))
                        {
                              draw_panel.setEllipse();
                        }
                        
                  }//end actionPerformed method
                  
            }//end ButtonListener class
            ActionListener listener = new ButtonListener();
            rectangle_button.addActionListener(listener);
            ellipse_button.addActionListener(listener);
            
            JPanel panel = new JPanel();
            
            panel.add(rectangle_button);
            panel.add(ellipse_button);
            
            return panel;
      }//end createShapeChoice method

       /*
       * The following method creates the outline color picker.
       */
      public JColorChooser createOutlineColorChoicePanel()
      {
            outlineColorPicker = new DefaultColorSelectionModel(Color.BLACK);
            
            //This class is used to create a special ActionListener 
            // for the ColorSelectionModel.
            class OutlineColorChangeListener implements ChangeListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void stateChanged(ChangeEvent event)
                  {
                        currentOutlineChoice.changeColor(outline_color_panel.getColor());
                        currentOutlineChoice.repaint();
                  }//end actionPerformed method
            }
            ChangeListener listener = new OutlineColorChangeListener();
            outlineColorPicker.addChangeListener(listener);
            outline_color_panel = new JColorChooser(outlineColorPicker);
            
            return outline_color_panel;
      }//end createComboBox method
      
      
      /*
       * The following method creates the fill color picker.
       */
      public JColorChooser createFillColorChoicePanel()
      {
            fillColorPicker = new DefaultColorSelectionModel(Color.BLACK);
            
            //This class is used to create a special ActionListener 
            // for the ColorSelectionModel.
            class FillColorChangeListener implements ChangeListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void stateChanged(ChangeEvent event)
                  {
                        currentFillChoice.changeColor(fill_color_panel.getColor());
                        currentFillChoice.repaint();
                  }//end actionPerformed method
            }
            ChangeListener listener = new FillColorChangeListener();
            fillColorPicker.addChangeListener(listener);
            fill_color_panel = new JColorChooser(fillColorPicker);
            
            return fill_color_panel;
      }//end createComboBox method
      
     
      /*
       */
      public JPanel createChooseColorButtons()
      {
            currentOutlineChoice = new ColorChoicePanel();
            currentFillChoice = new ColorChoicePanel();
            
            choose_outline_color = new JButton(new String("Choose Outline Color..."));
            choose_fill_color = new JButton(new String("Choose Fill Color..."));
            
            //This class is used to create a special ActionListener for this menu item
            class OutlineButtonListener implements ActionListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        outlineColorDialog.show();
                  }//end actionPerformed method
            }
            
            //This class is used to create a special ActionListener for this menu item
            class FillButtonListener implements ActionListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        fillColorDialog.show();
                  }//end actionPerformed method
            }
            ActionListener outline_listener = new OutlineButtonListener();
            choose_outline_color.addActionListener(outline_listener);
            ActionListener fill_listener = new FillButtonListener();
            choose_fill_color.addActionListener(fill_listener);
            
            JPanel panel = new JPanel();
            
            panel.add(currentOutlineChoice);
            panel.add(choose_outline_color);
            panel.add(currentFillChoice);
            panel.add(choose_fill_color);
            
            return panel;
      }//end createChooseColorButtons method
      
}//end PaintToolFrame class