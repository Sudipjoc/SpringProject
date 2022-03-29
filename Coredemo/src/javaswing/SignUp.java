package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtemail;
	private JTextField txtuname;
	private JTextField txtpno;
	private JPasswordField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtname = new JTextField();
		txtname.setBounds(136, 105, 221, 41);
		contentPane.add(txtname);
		txtname.setColumns(10);

		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(697, 105, 164, 41);
		contentPane.add(txtemail);

		txtuname = new JTextField();
		txtuname.setColumns(10);
		txtuname.setBounds(136, 211, 221, 41);
		contentPane.add(txtuname);

		txtpno = new JTextField();
		txtpno.setColumns(10);
		txtpno.setBounds(697, 211, 164, 41);
		contentPane.add(txtpno);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 105, 104, 49);
		contentPane.add(lblNewLabel);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(479, 97, 104, 49);
		contentPane.add(lblEmail);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(10, 211, 104, 49);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(10, 291, 104, 49);
		contentPane.add(lblPassword);

		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(479, 211, 139, 49);
		contentPane.add(lblPhoneNumber);

		txtPwd = new JPasswordField();
		txtPwd.setBounds(136, 291, 221, 49);
		contentPane.add(txtPwd);

		JButton btnsignup = new JButton("SignUp");
		btnsignup.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String nn = txtname.getText();
				String phn = txtpno.getText();
				String pasword = txtpno.getText();
				String Email = txtemail.getText();
				String un = txtuname.getText();

				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datastore", "root",
							"12345");

					String sql = "insert *from user where username = '" + un + "' , phone number = '" + phn
							+ "', Name ='" + nn + "' , E-mail ='" + Email + "' and password = '" + pasword + "' ";
					Statement stm = con.createStatement();
					ResultSet rs = stm.executeQuery(sql);

					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Sign Up sucessful");
						new HomePage().setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "SignUp unsucessful");
					}

				} catch (Exception e1) {

				}

			}
		});
		btnsignup.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnsignup.setBounds(294, 399, 150, 57);
		contentPane.add(btnsignup);

		JButton btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btncancel, "Do you want to cancel? Y/N");

				dispose();

			}
		});
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		btncancel.setBounds(567, 399, 150, 57);
		contentPane.add(btncancel);

		JLabel lblNewLabel_1 = new JLabel("Sign Up page");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(25, 11, 443, 66);
		contentPane.add(lblNewLabel_1);
	}
}
