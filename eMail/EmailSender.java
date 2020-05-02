package eMail;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//Author: Francisco Fernandez
public class EmailSender 
{
	static JFrame ES;
	static Container contentPane;
	static JPanel top,bottom,a,b,c,d,e,f,g;
	static JLabel logo, from, to, sub, server, usrN, passW, message;
	static JTextArea ta;
	static JTextField fr,t,subj, u,pass;
	static JComboBox<String> CB1;
	static String[] s = {"Google", "Yahoo", "AOL","Outlook","iCloud"};
	static JButton send;
	
	public static void main(String[] args) 
	{
		EmailSender es = new EmailSender();
		ES = new JFrame("GMAIL");
		ES.setForeground(Color.WHITE);
		contentPane = ES.getContentPane();
		contentPane.setLayout(new GridLayout
				(2,1));
		es.panels();
		
		ES.pack();
		ES.setResizable(false);
		ES.setSize(350,350);
		ES.setVisible(true);
		ES.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void panels()
	{
		top = new JPanel(new GridLayout(5,1));
				
		a = new JPanel(new GridLayout());
		a.setBackground(Color.BLACK);
		logo = new JLabel("GMAIL", JLabel.CENTER);
		logo.setForeground(Color.WHITE);
		a.add(logo);
		top.add(a);
		
		b = new JPanel(new GridLayout());
		b.setBackground(Color.BLACK);
		from = new JLabel("From:");
		from.setForeground(Color.WHITE);
		fr = new JTextField(40);
		fr.setBackground(Color.BLACK);
		fr.setForeground(Color.WHITE);
		b.add(from);
		b.add(fr);
		top.add(b);
		
		c = new JPanel(new GridLayout());
		c.setBackground(Color.BLACK);
		to = new JLabel("To:");
		to.setForeground(Color.WHITE);
		t = new JTextField(40);
		t.setBackground(Color.BLACK);
		t.setForeground(Color.WHITE);
		c.add(to);
		c.add(t);
		top.add(c);
		
		d = new JPanel(new GridLayout());
		d.setBackground(Color.BLACK);
		sub = new JLabel("Subject:");
		sub.setForeground(Color.WHITE);
		subj = new JTextField(40);
		subj.setBackground(Color.BLACK);
		subj.setForeground(Color.WHITE);
		d.add(sub);
		d.add(subj);
		top.add(d);
		
		e = new JPanel(new GridLayout());
		e.setBackground(Color.BLACK);
		server = new JLabel("Server:");
		server.setForeground(Color.WHITE);
		CB1 = new JComboBox<String>(s);
		CB1.setBackground(Color.BLACK);
		CB1.setForeground(Color.WHITE);
		e.add(server);
		e.add(CB1);
		top.add(e);
		
		bottom = new JPanel();
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.Y_AXIS));
		
		f = new JPanel(new BorderLayout());
		f.setBackground(Color.BLACK);
		message = new JLabel("Message:");
		message.setForeground(Color.WHITE);
		ta = new JTextArea(40,40);
		ta.setBackground(Color.BLACK);
		ta.setForeground(Color.WHITE);
		f.add(message, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		bottom.add(f);
		
		g = new JPanel(new BorderLayout());
		g.setBackground(Color.BLACK);
		send = new JButton("Send Email");
		send.setBackground(Color.BLACK);
		send.setForeground(Color.WHITE);
		send.addActionListener(new AL());
		g.add(send, BorderLayout.CENTER);
		bottom.add(g);
				
		contentPane.add(top);
		contentPane.add(bottom);
	}

}
