package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Employee;
import com.services.EmployeeService;
import com.services.EmployeeServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JButton btnNewButton;
	private JTextField fnametxt;
	private JTextField middlenametxt;
	private JTextField lnametxt;
	private JTextField emailtxt;
	private JTextField addrtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddView frame = new AddView();
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
	public AddView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1083, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 0, 1069, 689);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_3());
			panel.add(getLblNewLabel_1_4());
			panel.add(getBtnNewButton());
			panel.add(getFnametxt());
			panel.add(getMiddlenametxt());
			panel.add(getLnametxt());
			panel.add(getEmailtxt());
			panel.add(getAddrtxt());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Add Employee");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNewLabel.setBounds(427, 0, 271, 43);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(10, 64, 89, 32);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Last Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(10, 127, 89, 32);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Middle Name");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(323, 64, 108, 32);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Address");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_3.setBounds(10, 195, 89, 32);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Email");
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_4.setBounds(323, 127, 89, 32);
		}
		return lblNewLabel_1_4;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Employee empl = new Employee();
					empl.setFname(fnametxt.getText());
					empl.setMiddlename(middlenametxt.getText());
					empl.setLname(lnametxt.getText());
					empl.setEmail(emailtxt.getText());
					empl.setAddress(addrtxt.getText());
					
					EmployeeService conn = new EmployeeServiceImpl();
					boolean result = conn.addEmployee(empl) ;
					if(result) {
						JOptionPane.showMessageDialog(null, "add Sucessful");
					}else {
						JOptionPane.showMessageDialog(null, "Failed");
					
					}
				}
			});
			btnNewButton.setBounds(528, 392, 216, 62);
		}
		return btnNewButton;
	}
	private JTextField getFnametxt() {
		if (fnametxt == null) {
			fnametxt = new JTextField();
			fnametxt.setBounds(109, 72, 139, 20);
			fnametxt.setColumns(10);
		}
		return fnametxt;
	}
	private JTextField getMiddlenametxt() {
		if (middlenametxt == null) {
			middlenametxt = new JTextField();
			middlenametxt.setColumns(10);
			middlenametxt.setBounds(425, 72, 139, 20);
		}
		return middlenametxt;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
			lnametxt.setColumns(10);
			lnametxt.setBounds(109, 135, 139, 20);
		}
		return lnametxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setColumns(10);
			emailtxt.setBounds(425, 135, 139, 20);
		}
		return emailtxt;
	}
	private JTextField getAddrtxt() {
		if (addrtxt == null) {
			addrtxt = new JTextField();
			addrtxt.setColumns(10);
			addrtxt.setBounds(109, 203, 139, 20);
		}
		return addrtxt;
	}
}
