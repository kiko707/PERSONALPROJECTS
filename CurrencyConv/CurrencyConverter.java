package CurrencyConv;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//Currency Converter
//Author: Francisco Fernandez
public class CurrencyConverter 
{
	 static JFrame CC;
	 static JLabel l, input, amount, output, convert;
	 static Container contentPane;
	 static JPanel a,b,c,d,e,f,g,h;
	 static JButton conv, clr;
	 static JTextField inpCur, total;
	 static String [] cur = {"Euro", "Peso", "Canadian Dollar", "US Dollar"}; 
	 static ActionListener al; 
	 static JComboBox<String> CB1, CB2;

	public static void main(String[] args)
	{
		CurrencyConverter C = new CurrencyConverter();
		CC = new JFrame("World Currency");
		contentPane = CC.getContentPane();
		l = new JLabel("Currency Converter", JLabel.CENTER);
		a = new JPanel();
		a.add(l);
		contentPane.setLayout(new GridLayout(7,1));
		contentPane.add(a);
		C.panels();
		C.addToCP();
		
		CC.setResizable(false);
		CC.setSize(700,300);
		CC.pack();
		CC.setVisible(true);
		CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void addToCP() //adds all the panels to the contentPane
	{
		contentPane.add(b);
		contentPane.add(c);
		contentPane.add(d);
		contentPane.add(e);
		contentPane.add(f);
		contentPane.add(g);
	}
	
	public void panels() 
	{	
		b = new JPanel(new GridLayout());
		input = new JLabel("Select the input currency: ", JLabel.LEFT);
		b.add(input); //add label input to panel b
		CB1 = new JComboBox<String>(cur);//The first combo box is initialized
		CB1.setSelectedIndex(0);  //Sets the input index to Euro because Ero is at index 0
		b.add(CB1); //Combo Box is added to panel b
		
		c = new JPanel(new GridLayout());
		amount = new JLabel("Enter the Amount: ", JLabel.LEFT);
		c.add(amount);	//add amount label to panel c
		inpCur = new JTextField("",20); //create textfield to enter amount 
		c.add(inpCur);	//add textfield to panel c
		inpCur.addActionListener(new AL()); //add textField to action listener
		
		d = new JPanel(new GridLayout());
		output = new JLabel("Select the output currency: ", JLabel.LEFT);
		d.add(output); //adds output label to panel b
		CB2 = new JComboBox<String>(cur); // The second combo box is created
		CB2.setSelectedIndex(1);  //Sets the output index to Peso because Peso is at index 1
		d.add(CB2); // adds combo box to panel d
		
		e = new JPanel(new GridLayout());
		conv = new JButton("Convert"); //Creates the button Convert
		e.add(conv); //adds the button to the panel e
		conv.addActionListener(new AL());//adds the button to the action listener AL
		
		f = new JPanel(new GridLayout());
		convert = new JLabel("Converted Amount: ", JLabel.CENTER);
		f.add(convert);//adds the convert amount label to panel f
		total = new JTextField("",20);//Creates textField for total
		total.setEditable(false);
		f.add(total);//adds the total textfield to the panel
			
		g = new JPanel(new GridLayout()); //creates panel with gridlayout
		clr = new JButton("Clear");//creates Clear button
		g.add(clr);//adds the button to panel g
		clr.addActionListener(new AL()); //adds the button to ActionListener AL		
	}

}