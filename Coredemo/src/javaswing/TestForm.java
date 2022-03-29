package javaswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestForm {
	public static void main(String[] args) {

		JFrame form = new JFrame();

		form.setSize(600, 400);
		form.setTitle("Test form");
		form.setLayout(null);

		// create JLable

		JLabel jl = new JLabel("Welcome");
		// jl.setSize(100, 20);
		//jl.setBounds(x,y,w,h);
		jl.setBounds(120, 50, 100, 20);
		
		JLabel a = new JLabel("UserName");
		a.setBounds(70, 40, 80, 10);
		form.add(a);
		
		JLabel b = new JLabel("Password");
		a.setBounds(150, 80, 100, 20);
		form.add(b);
		
		JTextField j = new JTextField();
		j.setBounds(250, 60, 100, 20);
		form.add(j);
		
		JPasswordField jp = new JPasswordField();
		jp.setBounds(250, 80, 100, 20);
		form.add(jp);
		
		JButton jb = new JButton("Login");
		jb.setBounds(250, 100, 100, 20);
		form.add(jb);
		

		form.add(jl);

		form.setVisible(true);

	}

}
