package SwingJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtuname;
	private JPasswordField txtpfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(91, 134, 158, 52);
		contentPane.add(lblNewLabel);
		
		txtuname = new JTextField();
		txtuname.setBounds(282, 146, 197, 37);
		contentPane.add(txtuname);
		txtuname.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBackground(Color.GRAY);
		lblPassword.setBounds(91, 208, 158, 52);
		contentPane.add(lblPassword);
		
		txtpfield = new JPasswordField();
		txtpfield.setBounds(282, 209, 197, 37);
		contentPane.add(txtpfield);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sd = txtuname.getText();
				String pd = txtpfield.getText();
				if(sd.equals("Hari") && pd.equals("1234")) {
					JOptionPane.showMessageDialog(null, "login sucess");
					
				}else {
					JOptionPane.showMessageDialog(null, "login fail");
					
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(251, 309, 124, 52);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnCancel.setBounds(459, 309, 124, 52);
		contentPane.add(btnCancel);
	}
}
