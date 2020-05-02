package ATMPIN;
import javax.swing.*;
import java.awt.*;
//Author: Francisco Fernandez
//ATM Pin Entry
public class ATM 
{
   static JFrame WF;
   static Container contentPane;
   static JLabel label;
   static JPasswordField tf;
   static JButton button0, button1, button2, button3, button4, button5, button6, button7, button8,button9,buttonD,buttonOK;
   static JPanel a,b,c,d,e,f, account;
   static boolean newNumber = true;
   static String z = "";
   static String u = "";
   static String pinNumber = "7810";
 
   public static void main(String[] args)
   {
	  WF = new JFrame("Wells Fargo Bank");
      label = new JLabel("ATM PIN ENTRY", JLabel.CENTER);
      label.setForeground(Color.YELLOW);
      WF.getContentPane().add(label);
      contentPane = WF.getContentPane();
      contentPane.setBackground(Color.red);
      contentPane.setLayout(new GridLayout(6,1)); 
      
      addButton();
      addToCP();
         
      addToAL();
      enterKey();
      setColorPanel();
      setColorButtons();
     
     WF.setSize(300,300);
     WF.pack();
     WF.setResizable(false);
     tf.setHorizontalAlignment(JTextField.RIGHT);
     WF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     WF.setVisible(true); 
   }
   
   public static void setColorButtons()
   {	//setting the color for the buttons
	   button0.setBackground(Color.RED);
	   button0.setForeground(Color.YELLOW);
	   button1.setBackground(Color.RED);
	   button1.setForeground(Color.YELLOW);
	   button2.setBackground(Color.RED);
	   button2.setForeground(Color.YELLOW);
	   button3.setBackground(Color.RED);
	   button3.setForeground(Color.YELLOW);
	   button4.setBackground(Color.RED);
	   button4.setForeground(Color.YELLOW);
	   button5.setBackground(Color.RED);
	   button5.setForeground(Color.YELLOW);
	   button6.setBackground(Color.RED);
	   button6.setForeground(Color.YELLOW);
	   button7.setBackground(Color.RED);
	   button7.setForeground(Color.YELLOW);
	   button8.setBackground(Color.RED);
	   button8.setForeground(Color.YELLOW);
	   button9.setBackground(Color.RED);
	   button9.setForeground(Color.YELLOW);
	   buttonD.setBackground(Color.RED);
	   buttonD.setForeground(Color.YELLOW);
	   buttonOK.setBackground(Color.RED);
	   buttonOK.setForeground(Color.YELLOW);
   }
   
   public static void setColorPanel()
   {	//setting the colors for the panels	
	   b.setBackground(Color.RED);
	   c.setBackground(Color.RED);
	   d.setBackground(Color.RED);
	   e.setBackground(Color.RED);
	   f.setBackground(Color.RED);
	  
	   tf.setBackground(Color.RED); //setting the color for the password field
   }
   
   private static void addButton() 
   {
	  //Creating a textField for the Pin Entry then adding it to panel b
	  // JPassword helps hide the pin when it is being entered
	  tf = new JPasswordField(15);
	  b = new JPanel();
	  b.add(tf);
	  tf.setEditable(false);
	  
	  //Creating the layouts for each panel for the buttons  
      c = new JPanel(new GridLayout(1,3));
      d = new JPanel(new GridLayout(1,3));
      e = new JPanel(new GridLayout(1,3));
      f = new JPanel(new GridLayout(1,3));
      
      //Creating each button that will be added to panels
      button0 = new JButton(String.format("%1d",0));
      button1 = new JButton(String.format("%1d",1));
      button2 = new JButton(String.format("%1d",2));
      button3 = new JButton(String.format("%1d",3));
      button4 = new JButton(String.format("%1d",4));
      button5 = new JButton(String.format("%1d",5));
      button6 = new JButton(String.format("%1d",6));
      button7 = new JButton(String.format("%1d",7));
      button8 = new JButton(String.format("%1d",8));
      button9 = new JButton(String.format("%1d",9));
      buttonD = new JButton("DEL");
      buttonOK = new JButton("OK");
      
      //adding the buttons to their panels
      c.add(button1);
      c.add(button2);
      c.add(button3);
      d.add(button4);
      d.add(button5);
      d.add(button6);
      e.add(button7);
      e.add(button8);
      e.add(button9);
      f.add(buttonD);
      f.add(button0);
      f.add(buttonOK);
   }
   
   private static void addToCP()
   {
	  //Adding every panel to the ContentPane 
      contentPane.add(b);
      contentPane.add(c);
      contentPane.add(d);
      contentPane.add(e);
      contentPane.add(f);
   }
   
   private static void addToAL()	//Adding all the buttons to the Action Listener class AL   
   {								// that way they work
	   button0.addActionListener(new AL());
	   button1.addActionListener(new AL());
	   button2.addActionListener(new AL());
	   button3.addActionListener(new AL());
	   button4.addActionListener(new AL());
	   button5.addActionListener(new AL());
	   button6.addActionListener(new AL());
	   button7.addActionListener(new AL());
	   button8.addActionListener(new AL());
	   button9.addActionListener(new AL()); 
	   buttonOK.addActionListener(new AL());
	   buttonD.addActionListener(new AL()); 
   }
   
   public static void enterKey() //Makes the Enter Key work for button OK
   {
	   WF.getRootPane().setDefaultButton(buttonOK);
   }

}