ackage jdatagraph;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class jDataGUI
  extends JFrame
{
  public jDataFileManager fileManager = new jDataFileManager();
  public File graphDataFile;
  private JButton jButton1;
  private JButton jButton2;
  private JCheckBox jCheckBox1;
  private JCheckBox jCheckBox2;
  private JCheckBox jCheckBox3;
  private JComboBox<String> jComboBox1;
  private JComboBox<String> jComboBox2;
  private JComboBox<String> jComboBox3;
  private JComboBox<String> jComboBox4;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JSlider jSlider2;
  private JTextField jTextField1;
  private JTextField jTextField2;
  private JTextField jTextField3;
  
  public jDataGUI()
  {
    try
    {
      UIManager.setLookAndFeel(
        UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception localException) {}
    initComponents();
  }
  
  public int[] stringToColor(String color)
  {
    if (color.equals("Red")) {
      return new int[] { 255, 0, 0 };
    }
    if (color.equals("Green")) {
      return new int[] { 0, 255, 0 };
    }
    if (color.equals("Blue")) {
      return new int[] { 0, 0, 255 };
    }
    if (color.equals("Cyan")) {
      return new int[] { 0, 255, 255 };
    }
    if (color.equals("Yellow")) {
      return new int[] { 255, 255, 0 };
    }
    if (color.equals("Megenta")) {
      return new int[] { 255, 0, 255 };
    }
    if (color.equals("White")) {
      return new int[] { 255, 255, 255 };
    }
    if (color.equals("Black")) {
      return new int[] { 0, 0, 0 };
    }
    return new int[] { 255, 255, 255 };
  }
  
  public int typeToMode(String type)
  {
    if (type.equals("Line")) {
      return 1;
    }
    if (type.equals("Point")) {
      return 2;
    }
    if (type.equals("Bar")) {
      return 3;
    }
    return 0;
  }
  
  private void initComponents()
  {
    this.jLabel1 = new JLabel();
    this.jButton1 = new JButton();
    this.jTextField1 = new JTextField();
    this.jLabel2 = new JLabel();
    this.jComboBox1 = new JComboBox();
    this.jComboBox2 = new JComboBox();
    this.jLabel3 = new JLabel();
    this.jButton2 = new JButton();
    this.jLabel4 = new JLabel();
    this.jComboBox3 = new JComboBox();
    this.jCheckBox1 = new JCheckBox();
    this.jCheckBox2 = new JCheckBox();
    this.jSlider2 = new JSlider();
    this.jLabel6 = new JLabel();
    this.jLabel5 = new JLabel();
    this.jTextField2 = new JTextField();
    this.jLabel7 = new JLabel();
    this.jTextField3 = new JTextField();
    this.jCheckBox3 = new JCheckBox();
    this.jComboBox4 = new JComboBox();
    
    setDefaultCloseOperation(3);
    setTitle("JDataGraph");
    
    this.jLabel1.setText("Data File");
    
    this.jButton1.setText("Choose");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        jDataGUI.this.jButton1ActionPerformed(evt);
      }
    });
    this.jTextField1.setEditable(false);
    
    this.jLabel2.setText("Graph Type");
    
    this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Line", "Point", "Bar" }));
    
    this.jComboBox2.setModel(new DefaultComboBoxModel(new String[] { "Red", "Yellow", "Green", "Blue", "Cyan", "Megenta", "Black", "White" }));
    
    this.jLabel3.setText("Graph Color");
    
    this.jButton2.setText("Graph");
    this.jButton2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        jDataGUI.this.jButton2ActionPerformed(evt);
      }
    });
    this.jLabel4.setText("Background");
    
    this.jComboBox3.setModel(new DefaultComboBoxModel(new String[] { "Red", "Yellow", "Green", "Blue", "Cyan", "Megenta", "Black", "White" }));
    this.jComboBox3.setSelectedItem("Black");
    this.jComboBox3.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        jDataGUI.this.jComboBox3ItemStateChanged(evt);
      }
    });
    this.jComboBox3.addInputMethodListener(new InputMethodListener()
    {
      public void caretPositionChanged(InputMethodEvent evt)
      {
        jDataGUI.this.jComboBox3CaretPositionChanged(evt);
      }
      
      public void inputMethodTextChanged(InputMethodEvent evt) {}
    });
    this.jComboBox3.addPropertyChangeListener(new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent evt)
      {
        jDataGUI.this.jComboBox3PropertyChange(evt);
      }
    });
    this.jCheckBox1.setText("Smooth Line");
    this.jCheckBox1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        jDataGUI.this.jCheckBox1ActionPerformed(evt);
      }
    });
    this.jCheckBox2.setText("Invert");
    this.jCheckBox2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        jDataGUI.this.jCheckBox2ActionPerformed(evt);
      }
    });
    this.jSlider2.setMajorTickSpacing(10);
    this.jSlider2.setMaximum(40);
    this.jSlider2.setMinorTickSpacing(1);
    this.jSlider2.setValue(1);
    this.jSlider2.addChangeListener(new ChangeListener()
    {
      public void stateChanged(ChangeEvent evt)
      {
        jDataGUI.this.jSlider2StateChanged(evt);
      }
    });
    this.jSlider2.addPropertyChangeListener(new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent evt)
      {
        jDataGUI.this.jSlider2PropertyChange(evt);
      }
    });
    this.jLabel6.setText("Scale:1");
    
    this.jLabel5.setText("Width");
    
    this.jTextField2.setText("800");
    
    this.jLabel7.setText("Height");
    
    this.jTextField3.setText("600");
    
    this.jCheckBox3.setText("Draw Grid");
    this.jCheckBox3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        jDataGUI.this.jCheckBox3ActionPerformed(evt);
      }
    });
    this.jComboBox4.setModel(new DefaultComboBoxModel(new String[] { "Red", "Yellow", "Green", "Blue", "Cyan", "Megenta", "Black", "White" }));
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jLabel1)
      .addGap(18, 18, 18)
      .addComponent(this.jTextField1)
      .addGap(18, 18, 18)
      .addComponent(this.jButton1))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jLabel4)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jComboBox3, -2, -1, -2))
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jLabel2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jComboBox1, 0, 68, 32767)))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel5)
      .addComponent(this.jLabel7))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 25, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jTextField2, -2, 46, -2)
      .addComponent(this.jTextField3, -2, 46, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jLabel3)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jComboBox2, -2, -1, -2))
      .addGroup(layout.createSequentialGroup()
      .addGap(15, 15, 15)
      .addComponent(this.jCheckBox2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jCheckBox1))))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addComponent(this.jCheckBox3)
      .addGap(18, 18, 18)
      .addComponent(this.jComboBox4, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jButton2, -2, 67, -2))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addComponent(this.jLabel6)
      .addGap(10, 10, 10)
      .addComponent(this.jSlider2, -1, -1, 32767)))
      .addContainerGap()));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel1)
      .addComponent(this.jTextField1, -2, -1, -2)
      .addComponent(this.jButton1))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel2)
      .addComponent(this.jComboBox1, -2, -1, -2)
      .addComponent(this.jLabel3)
      .addComponent(this.jComboBox2, -2, -1, -2)
      .addComponent(this.jLabel5)
      .addComponent(this.jTextField2, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel4)
      .addComponent(this.jComboBox3, -2, -1, -2)
      .addComponent(this.jCheckBox1)
      .addComponent(this.jCheckBox2))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jTextField3, -2, -1, -2)
      .addComponent(this.jLabel7)))
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(15, 15, 15)
      .addComponent(this.jLabel6))
      .addGroup(layout.createSequentialGroup()
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jSlider2, -2, -1, -2)))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jButton2)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jCheckBox3)
      .addComponent(this.jComboBox4, -2, -1, -2)))
      .addContainerGap(-1, 32767)));
    
    pack();
  }
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    this.graphDataFile = this.fileManager.loadGraphDataFile();
    this.jTextField1.setText(this.graphDataFile.getAbsolutePath());
  }
  
  private void jComboBox3PropertyChange(PropertyChangeEvent evt) {}
  
  private void jComboBox3CaretPositionChanged(InputMethodEvent evt) {}
  
  private void jComboBox3ItemStateChanged(ItemEvent evt)
  {
    if (this.jComboBox3.getSelectedItem() == this.jComboBox2.getSelectedItem()) {
      JOptionPane.showMessageDialog(this, "The graph and background are the same color");
    }
  }
  
  private void jCheckBox2ActionPerformed(ActionEvent evt) {}
  
  private void jSlider2PropertyChange(PropertyChangeEvent evt) {}
  
  private void jSlider2StateChanged(ChangeEvent evt)
  {
    this.jLabel6.setText("Scale:" + Integer.toString(this.jSlider2.getValue()));
  }
  
  private void jButton2ActionPerformed(ActionEvent evt)
  {
    try
    {
      jDataWindow w = new jDataWindow(Integer.parseInt(this.jTextField2.getText()), Integer.parseInt(this.jTextField3.getText()), this.jSlider2.getValue(), new float[] { 0.0F, 0.0F });
      w.plotPointsAsData(this.fileManager.readLines(this.graphDataFile.getAbsolutePath()), stringToColor(this.jComboBox3.getSelectedItem().toString()), stringToColor(this.jComboBox2.getSelectedItem().toString()), stringToColor(this.jComboBox4.getSelectedItem().toString()), typeToMode(this.jComboBox1.getSelectedItem().toString()), this.jCheckBox1.isSelected(), this.jCheckBox3.isSelected());
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  private void jCheckBox1ActionPerformed(ActionEvent evt) {}
  
  private void jCheckBox3ActionPerformed(ActionEvent evt) {}
  
  public static void main(String[] args)
  {
    try
    {
      for (UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(jDataGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(jDataGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(jDataGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(jDataGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new jDataGUI().setVisible(true);
      }
    });
  }
}
