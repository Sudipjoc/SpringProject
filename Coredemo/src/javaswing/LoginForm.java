package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 887, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 95, 853, 392);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel labelusername = new JLabel("Username :");
		labelusername.setFont(new Font("Times New Roman", Font.BOLD, 30));
		labelusername.setBounds(33, 46, 188, 46);
		panel.add(labelusername);
		
		JLabel labelpwd = new JLabel("Password :");
		labelpwd.setFont(new Font("Times New Roman", Font.BOLD, 30));
		labelpwd.setBounds(35, 128, 165, 46);
		panel.add(labelpwd);
		
		txtusername = new JTextField();
		txtusername.setBounds(231, 56, 318, 38);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		txtpwd = new JPasswordField();
		txtpwd.setBounds(231, 138, 318, 38);
		panel.add(txtpwd);
		
		JCheckBox showpwd = new JCheckBox("Show Password");
		showpwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showpwd.isSelected()) {
					txtpwd.setEchoChar((char)0);
				}else {
					txtpwd.setEchoChar('*');
				}
			}
		});
		showpwd.setBounds(207, 211, 195, 23);
		panel.add(showpwd);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//login form validation
				if(txtusername.getText().isBlank()) {
					JOptionPane.showMessageDialog(txtusername, "Username is required");
					return;
				}
				
				if(txtpwd.getText().isBlank()) {
					JOptionPane.showMessageDialog(txtpwd, "Password is required");
					return;
					
				}
				
				String username = txtusername.getText();
				String pwd = txtpwd.getText();
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","12345");
					
					String sql = "select *from user where username = '"+username+"' and password = '"+pwd+"' ";
					Statement stm = con.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "login sucess");
						new HomePage().setVisible(true);
					dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "login unsucess");
				}
							
				} catch (Exception e1) {
					
				}
				
//				
//				if(username.equals("Hari") && pwd.equals("1234")) {
//					JOptionPane.showMessageDialog(null, "login sucess");
//					new HomePage().setVisible(true);
//					dispose();
//					
//				 } else {
//					JOptionPane.showMessageDialog(null,"login unsucess");
//				}
		}
			
		});
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnlogin.setBounds(250, 273, 152, 51);
		panel.add(btnlogin);
		
		JButton btnSignup = new JButton("Sign Up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new SignUp().setVisible(true);
			}
		});
		btnSignup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSignup.setBounds(456, 273, 174, 46);
		panel.add(btnSignup);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(260, 11, 426, 73);
		contentPane.add(lblNewLabel);
	}
}
