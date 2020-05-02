package CurrencyConv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
//ActionListener for CurrencyConverter
//Author: Francisco Fernandez
public class AL implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) throws NumberFormatException
	{
		String s = e.getActionCommand();
		String inputTextBox = CurrencyConverter.inpCur.getText();
		// TODO Auto-generated method stub
		double a,c=0;
		
		//Makes sure a number amount is entered without any spaces in between
		if(inputTextBox.contains(" "))
		{
			JOptionPane.showMessageDialog(CurrencyConverter.CC,"Please Enter An Amount To Be Converted");
		}
		else
		{	//Here  we check from which currency we are converting from and which currency to convert to
			try
			{
				a = (double)Double.parseDouble(inputTextBox);
			//Here we converting from Euro's to Mexican Peso's
			//the Zero index is set to Euro's and the First index is set to Peso's
			if(CurrencyConverter.CB1.getSelectedIndex()==0 && CurrencyConverter.CB2.getSelectedIndex()==1)
			{
				c= a*26.66;
			}
			//Here we converting from Euro's to Canadian Dollar's
			if(CurrencyConverter.CB1.getSelectedIndex()==0 && CurrencyConverter.CB2.getSelectedIndex()==2)
			{
				c= a*1.52;
			}
			//Here we converting from Euro's to US Dollar's, the rest of the if statements follow the same logic
			if(CurrencyConverter.CB1.getSelectedIndex()==0 && CurrencyConverter.CB2.getSelectedIndex()==3)
			{
				c= a*1.08;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==1 && CurrencyConverter.CB2.getSelectedIndex()==0)
			{
				c= a*0.037;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==1 && CurrencyConverter.CB2.getSelectedIndex()==2)
			{
				c= a*0.057;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==1 && CurrencyConverter.CB2.getSelectedIndex()==3)
			{
				c= a*0.04;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==2 && CurrencyConverter.CB2.getSelectedIndex()==0)
			{
				c= a*0.66;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==2 && CurrencyConverter.CB2.getSelectedIndex()==1)
			{
				c= a*17.58;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==2 && CurrencyConverter.CB2.getSelectedIndex()==3)
			{
				c= a*0.71;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==3 && CurrencyConverter.CB2.getSelectedIndex()==0)
			{
				c= a*0.93;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==3 && CurrencyConverter.CB2.getSelectedIndex()==1)
			{
				c= a*24.77;
			}
			if(CurrencyConverter.CB1.getSelectedIndex()==3 && CurrencyConverter.CB2.getSelectedIndex()==2)
			{
				c= a*1.41;
			}
			if(CurrencyConverter.CB1.getSelectedIndex() == CurrencyConverter.CB2.getSelectedIndex())
			{
				c = a*1.0;
			}
			}catch(NumberFormatException q)
			{
				JOptionPane.showMessageDialog(CurrencyConverter.CC, "Entered Amount Is Not Valid");
			}
			CurrencyConverter.total.setText(String.format("%.2f",c)); 
	  }		
		if(s.equals("Clear"))
		{
			CurrencyConverter.total.setText("");
			CurrencyConverter.inpCur.setText("");
		}
	}
		
}


