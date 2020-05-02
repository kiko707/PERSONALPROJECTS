package eMail;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
//Author: Francisco Fernandez
public class AL implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(EmailSender.fr.getText().equals(""))
		{
			JOptionPane.showMessageDialog(EmailSender.ES,"Please Enter A Valid Email Address To Send From!");
			return;
		}
		
		if(EmailSender.t.getText().equals(""))
		{
			JOptionPane.showMessageDialog(EmailSender.ES, "Please Enter A Valid Email Address To Send To!");
			return;
		}
		
		if(EmailSender.subj.getText().contentEquals(""))
		{
			int b = JOptionPane.showConfirmDialog(EmailSender.ES, "Are you sure you want to send this without a subject?");
			
			if(b==0)
				JOptionPane.showMessageDialog(EmailSender.ES, "Email Sent");
		}
		
		
		int a = JOptionPane.showConfirmDialog(EmailSender.ES, "Are you sure you want to send?");
		if(a==0)// If yes button is pressed a is 0
		JOptionPane.showMessageDialog(EmailSender.ES, "Email Sent");
		
		
	}

}
