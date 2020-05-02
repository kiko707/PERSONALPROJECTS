package ATMPIN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
//Action Listener Class
//Author: Francisco Fernandez
public class AL implements ActionListener
{	
	public void actionPerformed(ActionEvent e) 
	{	
		String s =  e.getActionCommand();
		
		switch(s)
		{
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
						if (ATM.z.length() <4) //makes sure pin entered is only 4 or less numbers
						{
							if(ATM.newNumber)	//if its the first number it gets set first
							{//newNumber is then set to false that way the next numbers are added to the first or current #'s
								ATM.tf.setText(s);
								ATM.newNumber = false;
								System.out.println(s);
							}
							else
							{
								ATM.u = new String (ATM.tf.getPassword());// We get the current password and put it in a String object
								ATM.tf.setText(ATM.u+s); //We then added the next number to it
							}
							ATM.z += s;	//adding every number to the string z	
						}
						break;
			
			case "OK":
						if(ATM.z.equals(ATM.pinNumber)) //Checks if the pin number entered matches pinNumber
						{
							//Displays the "you are logged in" webpage
							JOptionPane.showMessageDialog(ATM.WF, "You are now logged in.");
							System.exit(0);//exits program
						}
						else
						{//if the pin doesnt match then you have to try again
							ATM.tf.setText("");
							JOptionPane.showMessageDialog(ATM.WF, "Wrong PIN. Try Again");
							ATM.newNumber = true;
							//System.out.println(z);
							ATM.z = ""; //wrong pin entry is erased
						}
						break;

			case "DEL":	
						if(s.equals("DEL"))
						{					
							if(!ATM.z.equals(""))	//the last number entered is deleted
							{
								ATM.z = ATM.z.substring(0,ATM.z.length()-1);
							}
							
							//if the DEL button is pushed when nothing has been entered then nothing happens
							if(ATM.z.length()==0)
							{
								ATM.tf.setText("");
							}	
						}
						ATM.tf.setText(ATM.z);
		}
	}

}
