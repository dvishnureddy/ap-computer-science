/*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*
 *
 *    Name: Mr. Kevin Dietzler
 *    Date: 5/1/07
 *    Filename: ChoiceFrameDietzler.java
 *    Description: This is a special Frame with text editing functionality.
 *                This version has more than the original ChoiceFrame
 *
 GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.colorchooser.*;
import javax.swing.event.*;

public class ChoiceFrameDietzler extends JFrame
{
      //This label will be used to draw the desired text on the screen.
      private JLabel sampleField;
      
      //These variables store the font name, size and style that will be
      //  changed throughout the program.
      private String fontName;
      private int fontSize;
      private int fontStyle;
      private Color fontColor;
      private int fontAlignment;
      
      //These are the components used to change the value of the font name
      //  size and style.
      private JCheckBox italicCheckBox;
      private JCheckBox boldCheckBox;

      //THE FOLLOWING CONTROL THE ALIGNMENT OF THE TEXT
      private JRadioButton leftAlignButton;
      private JRadioButton rightAlignButton;

      private JComboBox sizeCombo;
      private JComboBox facenameCombo;
      private JTextField textField;
      private DefaultColorSelectionModel colorPicker;
      private ColorChoicePanel currentChoice;
      private JColorChooser color_panel;
      private JDialog colorDialog;
      
      private JButton update;
      private JButton choose_color;
      
      private JPanel fieldPanel;
      private JPanel centerPanel;
            
      //These font-size values do not change and can be used throughout the
      //  program.
      private static final String SMALLEST = new String("8");
      private static final String SMALL = new String("10");
      private static final String SMALL_MEDIUM = new String("12");
      private static final String MEDIUM = new String("14");
      private static final String MEDIUM_LARGE = new String("18");
      private static final String LARGE = new String("24");
      private static final String LARGEST = new String("36");
      private static final String HUGE = new String("72");
      private static final String WOW = new String("255");
      
      private static final int ALIGN_LEFT = -1;
      private static final int ALIGN_CENTER = 0;
      private static final int ALIGN_RIGHT = 1;
      
      /*
       * This is the constructor for our ChoiceFrame
       */
      public ChoiceFrameDietzler(String name)
      {
            //The keyword super simply sends name to the constructor of
            //  JFrame.
            super(name);
            
            fieldPanel = new JPanel ();
            fieldPanel.setLayout (new BorderLayout());
           
            //Construct the text
            sampleField = new JLabel(new String("Big Java"));
            fieldPanel.add (sampleField, BorderLayout.WEST);
           
            //Add the text to the main panel
            getContentPane().add(fieldPanel, BorderLayout.CENTER);
            
            //Call the method below to add all the components and menu
            //  to the frame
            createControlPane();
            
            //Create and set the menu bar
            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);
            
            //Call the methods to add two menus (file and font) to the menu bar 
            menuBar.add(createFileMenu());
            menuBar.add(createFontMenu());
            
            createColorDialog();
            
            //Call the method to re-draw the label
            setSampleFont();
            
      }
      
      
      /*
       * The following method resets the window to its original status.
       */
      public void init()
      {
            sampleField.setText(new String("Big Java"));
            textField.setText(new String("Big Java"));
            
            facenameCombo.setSelectedIndex(0);
            sizeCombo.setSelectedIndex(2);
            
            italicCheckBox.setSelected(false);
            boldCheckBox.setSelected(false);
            
            leftAlignButton.setSelected(true);
            
            fontColor = Color.BLACK;
            
            setSampleFont();
      }//end init method
      
      
      /*
       * The following method creates the control panel to change the font.
       */
      public void createControlPane()
      {
            //Create the four panels that control the font change
            JPanel facenamePanel = createFacenameComboBox();
            JPanel styleGroupPanel = createStyleCheckBoxes();
            JPanel alignGroupPanel = createAlignButtons();
            JPanel sizeGroupPanel = createSizeComboBox();
            JPanel colorPickerPanel = createChooseColorButton();
            JPanel textUpdatePanel = createUpdateButton();
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(6,1));
            controlPanel.add(facenamePanel);
            controlPanel.add(sizeGroupPanel);
            controlPanel.add(styleGroupPanel);
            controlPanel.add(alignGroupPanel);
            controlPanel.add(colorPickerPanel);
            controlPanel.add(textUpdatePanel);
            
            //Add the panels to the content pane
            getContentPane().add(controlPanel, BorderLayout.SOUTH);
      }
      
      
      /*
       * The following method creates the color chooser dialog box
       */
      public void createColorDialog()
      {
            colorDialog = new JDialog(this,new String("Choose a color"),true);
            colorDialog.getContentPane().add(createColorPicker(), BorderLayout.CENTER);
      
            JButton okButton = new JButton("OK");
            
            //This class is used to create a special ActionListener for
            //    the ok button
            class ButtonListener implements ActionListener
            {
                  /*
                   * This method is called whenever the ok button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        currentChoice.changeColor(color_panel.getColor());
                        currentChoice.repaint();
                        fontColor=color_panel.getColor();
                        colorDialog.hide();
                  }//end actionPerformed method
            }
            ActionListener listener = new ButtonListener();
            okButton.addActionListener(listener);
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel buttonPanel = new JPanel();
            
            buttonPanel.add(okButton);
            
            //Add the button panel to the content pane of the ColorDialogue
            colorDialog.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            
            colorDialog.pack();
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
       * The following method creates the font menu
       * postcondition: returns the JMenu for the font menu.
       */
      public JMenu createFontMenu()
      {
            JMenu menu = new JMenu(new String("Font"));
            menu.add(createFontNameMenu());
            menu.add(createFontSizeMenu());
            menu.add(createFontStyleMenu());
            return menu;
      }//end createFontMenu method
      
      
      /*
       * The following method creates the submenu to choose a font name
       * postcondition: returns the JMenu for the font name submenu.
       */
      public JMenu createFontNameMenu()
      {
           //YOU MUST ALTER THESE BASED ON YOUR SYSTEM
            JMenu menu = new JMenu(new String("Name"));
            menu.add(createFontNameItem(new String("Serif")));
            menu.add(createFontNameItem(new String("Times")));
            menu.add(createFontNameItem(new String("Agent Orange")));
            menu.add(createFontNameItem(new String("Aldo's Nova")));
            menu.add(createFontNameItem(new String("American Typewriter")));
            menu.add(createFontNameItem(new String("American Typewriter Condensed")));
            menu.add(createFontNameItem(new String("American Typewriter Light")));
            menu.add(createFontNameItem(new String("Andale Mono")));
            menu.add(createFontNameItem(new String("AntsyPants")));
            menu.add(createFontNameItem(new String("Apple Chancery")));
            menu.add(createFontNameItem(new String("Arial")));
            menu.add(createFontNameItem(new String("Arial Black")));
            menu.add(createFontNameItem(new String("Arial Narrow")));
            menu.add(createFontNameItem(new String("Aristocrat LET")));
            menu.add(createFontNameItem(new String("AstigamaTizm")));
            menu.add(createFontNameItem(new String("BASEHEAD")));
            menu.add(createFontNameItem(new String("Baskerville")));
            menu.add(createFontNameItem(new String("BellBottom")));
            menu.add(createFontNameItem(new String("Bertram LET")));
            menu.add(createFontNameItem(new String("BiauKai")));
            menu.add(createFontNameItem(new String("Bickley Script LET")));
            menu.add(createFontNameItem(new String("Bite me")));
            menu.add(createFontNameItem(new String("Bizarro")));
            menu.add(createFontNameItem(new String("Bodoni Ornaments ITC TT")));
            menu.add(createFontNameItem(new String("Calaveras")));
            menu.add(createFontNameItem(new String("Capitals")));
            menu.add(createFontNameItem(new String("Century Gothic")));
            menu.add(createFontNameItem(new String("Chalkboard")));
            menu.add(createFontNameItem(new String("Charcoal")));
            menu.add(createFontNameItem(new String("Chicago")));
            menu.add(createFontNameItem(new String("Cochin")));
            menu.add(createFontNameItem(new String("Comic Sans MS")));
            menu.add(createFontNameItem(new String("Copperplate")));
            menu.add(createFontNameItem(new String("Courier")));
            menu.add(createFontNameItem(new String("Courier New")));
            menu.add(createFontNameItem(new String("Curlz MT")));
            menu.add(createFontNameItem(new String("Didot")));
            menu.add(createFontNameItem(new String("Edwardian Script ITC")));
            menu.add(createFontNameItem(new String("Fang Song")));
            menu.add(createFontNameItem(new String("Fortuna Dot")));
            menu.add(createFontNameItem(new String("Futura")));
            menu.add(createFontNameItem(new String("Gadget")));
            menu.add(createFontNameItem(new String("Geeza Pro")));
            menu.add(createFontNameItem(new String("Geneva")));
            menu.add(createFontNameItem(new String("Georgia")));
            menu.add(createFontNameItem(new String("Gill Sans")));
            menu.add(createFontNameItem(new String("Gringo Nights")));
            menu.add(createFontNameItem(new String("Hei")));
            menu.add(createFontNameItem(new String("Helvetica")));
            menu.add(createFontNameItem(new String("Herculanum")));
            menu.add(createFontNameItem(new String("Hypmotizin")));
            menu.add(createFontNameItem(new String("Impact")));
            menu.add(createFontNameItem(new String("Jokerman LET")));
            menu.add(createFontNameItem(new String("MadisonSquare")));
            menu.add(createFontNameItem(new String("MammaGamma")));
            menu.add(createFontNameItem(new String("Mathmos Original")));
            menu.add(createFontNameItem(new String("MammaGamma")));
            menu.add(createFontNameItem(new String("Marker Felt")));
            menu.add(createFontNameItem(new String("MassiveHeadache3")));
            menu.add(createFontNameItem(new String("Parry Hotter")));
            return menu;
      }//end createFontNameMenu method
      
      
      /*
       * The following method creates the submenu to choose a font size
       * postcondition: returns the JMenu for the font size submenu.
       */
      public JMenu createFontSizeMenu()
      {
            JMenu menu = new JMenu(new String("Size"));
            menu.add(createFontSizeItem(SMALLEST));
            menu.add(createFontSizeItem(SMALL));
            menu.add(createFontSizeItem(SMALL_MEDIUM));
            menu.add(createFontSizeItem(MEDIUM));
            menu.add(createFontSizeItem(MEDIUM_LARGE));
            menu.add(createFontSizeItem(LARGE));
            menu.add(createFontSizeItem(LARGEST));
            menu.add(createFontSizeItem(HUGE));
            menu.add(createFontSizeItem(WOW));
            return menu;
      }//end createFontSizeMenu method
      
      
      /*
       * The following method creates the submenu to choose a font style
       * postcondition: returns the JMenu for the font style submenu.
       */
      public JMenu createFontStyleMenu()
      {
            JMenu menu = new JMenu(new String("Style"));
            menu.add(createFontStyleItem(new String("Plain")));
            menu.add(createFontStyleItem(new String("Italic")));
            menu.add(createFontStyleItem(new String("Bold")));
            menu.add(createFontStyleItem(new String("Bold Italic")));
            return menu;
      }//end createFontStyleMenu method
      
      
      /*
       * The following method creates the file menu item to reset all the
       *     values
       * postcondition: returns the JMenuItem for the file menu item "Reset".
       */
      public JMenuItem createFileResetItem()
      {
            JMenuItem item = new JMenuItem(new String("Reset"));
            class MenuItemListener implements ActionListener
            {
                  public void actionPerformed(ActionEvent event)
                  {
                        init();
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
       * The following method creates the font menu item to choose a font
       *     name.
       * postcondition: returns the JMenuItem for the font menu item for
       *     the font name.
       */
      public JMenuItem createFontNameItem(String name)
      {
            JMenuItem item = new JMenuItem(name);
            
            //This class is used to create a special ActionListener for this menu item
            class MenuItemListener implements ActionListener
            {
                  private String name;
                  
                  public MenuItemListener(String n)
                  {
                        name = n;
                  }
                  
                  public void actionPerformed(ActionEvent event)
                  {
                        //Set the font of the text field
                        fontName = name;
                        sampleField.setFont(new Font(fontName, fontStyle, fontSize));
                        sampleField.repaint();
                        
                        pack();
   
                  }
            }
            ActionListener listener = new MenuItemListener(name);
            item.addActionListener(listener);
            return item;
      }//end createFontNameItem method
      
      
      /*
       * The following method creates the font menu item to choose a font
       *     size.
       * postcondition: returns the JMenuItem for the font menu item for
       *     the font size.
       */
      public JMenuItem createFontSizeItem(String size)
      {
            JMenuItem item = new JMenuItem(size);
            
            //This class is used to create a special ActionListener for this menu item
            class MenuItemListener implements ActionListener
            {
                  private String size;
                  
                  public MenuItemListener(String s)
                  {
                        size = s;
                  }
                  
                  public void actionPerformed(ActionEvent event)
                  {
                        //Set the size of the font
//                        if(size.equals("Small"))
//                              fontSize = SMALL;
//                        else if(size.equals("Medium"))
//                              fontSize = MEDIUM;
//                        else if(size.equals("Large"))
//                              fontSize = LARGE;
                        
                        fontSize = Integer.parseInt(size);
                        
                        sampleField.setFont(new Font(fontName, fontStyle, fontSize));
                        sampleField.repaint();
                        
                        pack();
   
                  }
            }
            ActionListener listener = new MenuItemListener(size);
            item.addActionListener(listener);
            return item;
      }//end createFontSizeItem method
      
      
      /*
       * The following method creates the font menu item to choose a font
       *     style.
       * postcondition: returns the JMenuItem for the font menu item for
       *     the font style.
       */
      public JMenuItem createFontStyleItem(String style)
      {
            JMenuItem item = new JMenuItem(style);
            
            //This class is used to create a special ActionListener for this menu item
            class MenuItemListener implements ActionListener
            {
                  private String style;
                  
                  public MenuItemListener(String s)
                  {
                        style = s;
                  }
                  
                  public void actionPerformed(ActionEvent event)
                  {
                        //Set the size of the font
                        if(style.equals("Plain"))
                              fontStyle = Font.PLAIN;
                        else if(style.equals("Italic"))
                              fontStyle = Font.ITALIC;
                        else if(style.equals("Bold"))
                              fontStyle = Font.BOLD;
                        else if(style.equals("Bold Italic"))
                              fontStyle = Font.ITALIC|Font.BOLD;
                        
                        sampleField.setFont(new Font(fontName, fontStyle, fontSize));
                        sampleField.repaint();
                        
                        pack();
   
                  }
            }
            ActionListener listener = new MenuItemListener(style);
            item.addActionListener(listener);
            return item;
      }//end createFontStyleItem method
      
      
      /*
       * The following method creates the combo box with font style choices
       * postcondition: returns the panel containing the combo box.
       */
      public JPanel createFacenameComboBox()
      {
           //YOU MUST ALTER THESE BASED ON YOUR SYSTEM.
            facenameCombo = new JComboBox();
            facenameCombo.addItem(new String("Times"));
            facenameCombo.addItem(new String("Agent Orange"));
            facenameCombo.addItem(new String("Aldo's Nova"));
            facenameCombo.addItem(new String("American Typewriter"));
            facenameCombo.addItem(new String("American Typewriter Condensed"));
            facenameCombo.addItem(new String("American Typewriter Light"));
            facenameCombo.addItem(new String("Andale Mono"));
            facenameCombo.addItem(new String("AntsyPants"));
            facenameCombo.addItem(new String("Apple Chancery"));
            facenameCombo.addItem(new String("Arial"));
            facenameCombo.addItem(new String("Arial Black"));
            facenameCombo.addItem(new String("Arial Narrow"));
            facenameCombo.addItem(new String("Aristocrat LET"));
            facenameCombo.addItem(new String("AstigamaTizm"));
            facenameCombo.addItem(new String("BASEHEAD"));
            facenameCombo.addItem(new String("Baskerville"));
            facenameCombo.addItem(new String("BellBottom"));
            facenameCombo.addItem(new String("Bertram LET"));
            facenameCombo.addItem(new String("BiauKai"));
            facenameCombo.addItem(new String("Bickley Script LET"));
            facenameCombo.addItem(new String("Bite me"));
            facenameCombo.addItem(new String("Bizarro"));
            facenameCombo.addItem(new String("Bodoni Ornaments ITC TT"));
            facenameCombo.addItem(new String("Calaveras"));
            facenameCombo.addItem(new String("Capitals"));
            facenameCombo.addItem(new String("Century Gothic"));
            facenameCombo.addItem(new String("Chalkboard"));
            facenameCombo.addItem(new String("Charcoal"));
            facenameCombo.addItem(new String("Chicago"));
            facenameCombo.addItem(new String("Cochin"));
            facenameCombo.addItem(new String("Comic Sans MS"));
            facenameCombo.addItem(new String("Copperplate"));
            facenameCombo.addItem(new String("Courier"));
            facenameCombo.addItem(new String("Courier New"));
            facenameCombo.addItem(new String("Curlz MT"));
            facenameCombo.addItem(new String("Didot"));
            facenameCombo.addItem(new String("Edwardian Script ITC"));
            facenameCombo.addItem(new String("Fang Song"));
            facenameCombo.addItem(new String("Fortuna Dot"));
            facenameCombo.addItem(new String("Futura"));
            facenameCombo.addItem(new String("Gadget"));
            facenameCombo.addItem(new String("Geeza Pro"));
            facenameCombo.addItem(new String("Geneva"));
            facenameCombo.addItem(new String("Georgia"));
            facenameCombo.addItem(new String("Gill Sans"));
            facenameCombo.addItem(new String("Gringo Nights"));
            facenameCombo.addItem(new String("Hei"));
            facenameCombo.addItem(new String("Helvetica"));
            facenameCombo.addItem(new String("Herculanum"));
            facenameCombo.addItem(new String("Hypmotizin"));
            facenameCombo.addItem(new String("Impact"));
            facenameCombo.addItem(new String("Jokerman LET"));
            facenameCombo.addItem(new String("MadisonSquare"));
            facenameCombo.addItem(new String("MammaGamma"));
            facenameCombo.addItem(new String("Mathmos Original"));
            facenameCombo.addItem(new String("MammaGamma"));
            facenameCombo.addItem(new String("Marker Felt"));
            facenameCombo.addItem(new String("MassiveHeadache3"));
            facenameCombo.addItem(new String("Parry Hotter"));
            facenameCombo.setEditable(true);
            //facenameCombo.addActionListener(this);
            
            JPanel panel = new JPanel();
            panel.add(facenameCombo);
            panel.setBorder
                  (new TitledBorder(new EtchedBorder(), "Font Name"));
            
            return panel;
      }//end createComboBox method
      
      
      /*
       * The following method creates the check boxes for selection bold and
       *     italic styles
       * postcondition: returns the panel containing the facename check box.
       */
      public JPanel createStyleCheckBoxes()
      {
            italicCheckBox = new JCheckBox(new String("Italic"));
            //italicCheckBox.addActionListener(this);
                  
            boldCheckBox = new JCheckBox(new String("Bold"));
            //boldCheckBox.addActionListener(this);
            
            JPanel panel = new JPanel();
            panel.add(italicCheckBox);
            panel.add(boldCheckBox);
            panel.setBorder
                  (new TitledBorder(new EtchedBorder(), "Style"));
            
            return panel;
      }//end createCheckBoxes method
      
      
      /*
       * The following method creates the combo box with font size choices
       * postcondition: returns the panel containing the size combo box.
       */
      public JPanel createSizeComboBox()
      {
            sizeCombo = new JComboBox();
            sizeCombo.addItem(SMALLEST);
            sizeCombo.addItem(SMALL);
            sizeCombo.addItem(SMALL_MEDIUM);
            sizeCombo.addItem(MEDIUM);
            sizeCombo.addItem(MEDIUM_LARGE);
            sizeCombo.addItem(LARGE);
            sizeCombo.addItem(LARGEST);
            sizeCombo.addItem(HUGE);
            sizeCombo.addItem(WOW);
            sizeCombo.setEditable(true);
            //facenameCombo.addActionListener(this);
            sizeCombo.setSelectedIndex(2);
            
            JPanel panel = new JPanel();
            panel.add(sizeCombo);
            panel.setBorder
                  (new TitledBorder(new EtchedBorder(), "Font Name"));
            
            return panel;
      }//end createComboBox method
      

      /*
       * The following method creates the check boxes for selection bold and
       *     italic styles
       * postcondition: returns the panel containing the check boxes.
       */
      public JPanel createAlignButtons()
      {
            leftAlignButton = new JRadioButton(new String("Left"));
            //smallButton.addActionListener(this);
            
            //centerAlignButton = new JRadioButton(new String("Center"));
            //mediumButton.addActionListener(this);
            
            rightAlignButton = new JRadioButton(new String("Right"));
            //largeButton.addActionListener(this);
            
            leftAlignButton.setSelected(true);
            
            //This class is used to create a special ActionListener for the align radio buttons
            class AlignListener implements ActionListener
            {
                  /*
                   * This method is called when the update button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        //Call the method to change the text on the screen.
                        setSampleFont();
                  }//end actionPerformed method
            }
            ActionListener listener = new AlignListener();
            leftAlignButton.addActionListener (listener);
            //centerAlignButton.addActionListener (listener);
            rightAlignButton.addActionListener (listener);
            
            ButtonGroup group = new ButtonGroup();
            group.add(leftAlignButton);
            //group.add(centerAlignButton);
            group.add(rightAlignButton);
            
            JPanel panel = new JPanel();
            panel.add(leftAlignButton);
            //panel.add(centerAlignButton);
            panel.add(rightAlignButton);
            panel.setBorder
                  (new TitledBorder(new EtchedBorder(),new String("Alignment")));
            
            return panel;
      }//end createAlignButtons method
      
      
      /*
       * The following method creates the color picker.
       */
      public JColorChooser createColorPicker()
      {
            colorPicker = new DefaultColorSelectionModel(Color.BLACK);
            
            //This class is used to create a special ActionListener 
            // for the ColorSelectionModel.
            class ColorChangeListener implements ChangeListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void stateChanged(ChangeEvent event)
                  {
                        currentChoice.changeColor(color_panel.getColor());
                        currentChoice.repaint();
                  }//end actionPerformed method
            }
            ChangeListener listener = new ColorChangeListener();
            colorPicker.addChangeListener(listener);
            color_panel = new JColorChooser(colorPicker);
            
            return color_panel;
      }//end createComboBox method
      
      
      /*
       * The following method creates the textfield to change the text
       *     and the button to update the label.
       * postcondition: returns the panel containing the textfield and button.
       */
      public JPanel createChooseColorButton()
      {
            currentChoice = new ColorChoicePanel();
            
            choose_color = new JButton(new String("Choose Font Color..."));
            
            //This class is used to create a special ActionListener for this menu item
            class ButtonListener implements ActionListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        colorDialog.show();
                  }//end actionPerformed method
            }
            ActionListener listener = new ButtonListener();
            choose_color.addActionListener(listener);
            
            JPanel panel = new JPanel();
            
            panel.add(currentChoice);
            panel.add(choose_color);
            
            return panel;
      }//end createColorPickerButton method
      
      
      /*
       * The following method creates the textfield to change the text
       *     and the button to update the label.
       * postcondition: returns the panel containing the textfield and button.
       */
      public JPanel createUpdateButton()
      {
            JLabel textLabel = new JLabel(new String("Change text to: "));
            
            textField = new JTextField(new String("Big Java"), 20);
            textField.setFont(new Font(("Times"),Font.PLAIN,12));
            textField.setSelectedTextColor (Color.WHITE);
            textField.setSelectionColor (Color.RED);
            update = new JButton(new String("Update"));
            update.setDefaultCapable(true);
            
            //This class is used to create a special ActionListener for this menu item
            class ButtonListener implements ActionListener
            {
                  /*
                   * This method is called when the update button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        //Call the method to change the text on the screen.
                        setSampleFont();
                  }//end actionPerformed method
            }
            ActionListener listener = new ButtonListener();
            update.addActionListener(listener);
            
            JPanel panel = new JPanel();
            
            panel.add(textLabel);
            panel.add(textField);
            panel.add(update);
            
            return panel;
      }//end createUpdateButton method
      
      
      /*
       * Gets the user choice for font, style and size and redraws the text
       *     accordingly.
       */
      public void setSampleFont()
      {
            //Get the font name from the JComboBox
            fontName = (String)facenameCombo.getSelectedItem();
            
            sampleField.setText(textField.getText());

            //Get the font style from the JCheckBoxes
            fontStyle=0;
            if(italicCheckBox.isSelected())
                  fontStyle+=Font.ITALIC;
            if(boldCheckBox.isSelected())
                  fontStyle+=Font.BOLD;
            
            //Get the font size
            fontSize=0;
            
            fontSize = Integer.parseInt((String)sizeCombo.getSelectedItem());
           
            if(leftAlignButton.isSelected())
                 fontAlignment=ALIGN_LEFT;
            //else if(centerAlignButton.isSelected())
            //      fontAlignment=ALIGN_CENTER;
            else if(rightAlignButton.isSelected())
                  fontAlignment=ALIGN_RIGHT;
            
            //Set the font of the text field
            sampleField.setFont(new Font(fontName, fontStyle, fontSize));
            sampleField.setForeground(fontColor);
            if (fontAlignment == ALIGN_LEFT)
                 fieldPanel.add (sampleField, BorderLayout.WEST);
            else if (fontAlignment == ALIGN_RIGHT)
                 fieldPanel.add (sampleField, BorderLayout.EAST);
            
            sampleField.repaint();
            
            pack();
            
      }//end setSampleFont method
      
}//end ChoiceFrameExtras class