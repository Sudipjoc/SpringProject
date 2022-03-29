package SwingJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtemail;
	private JTextField txtpno;
	private JTextField txtaddr;
	private JRadioButton Other;
	private JTextField txtusername;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JDateChooser dateChooser;
	private JLabel ulabel;
	private JButton btnNewButton;
	private JDateChooser dateChooser1;
	private JButton btnAdd;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1201, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Adding Employee");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 50));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(47, 11, 424, 71);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Employee Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(30, 129, 178, 44);
		contentPane.add(lblNewLabel_1);

		nametxt = new JTextField();
		nametxt.setBounds(239, 133, 266, 44);
		contentPane.add(nametxt);
		nametxt.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Email :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(30, 196, 178, 44);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Phone Number :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(30, 272, 178, 44);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Address :");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(30, 345, 178, 44);
		contentPane.add(lblNewLabel_1_2_1);

		JRadioButton Male = new JRadioButton("Male");
		buttonGroup.add(Male);
		Male.setBounds(104, 419, 111, 23);
		contentPane.add(Male);

		JRadioButton Female = new JRadioButton("Female");
		buttonGroup.add(Female);
		Female.setBounds(227, 419, 73, 23);
		contentPane.add(Female);

		JLabel lblNewLabel_2 = new JLabel("Sex");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 411, 44, 37);
		contentPane.add(lblNewLabel_2);

		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(239, 196, 266, 44);
		contentPane.add(txtemail);

		txtpno = new JTextField();
		txtpno.setColumns(10);
		txtpno.setBounds(239, 272, 266, 44);
		contentPane.add(txtpno);

		txtaddr = new JTextField();
		txtaddr.setColumns(10);
		txtaddr.setBounds(239, 345, 266, 44);
		contentPane.add(txtaddr);
		contentPane.add(getOther());
		contentPane.add(getTxtusername());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getDateChooser());
		contentPane.add(getUlabel());
		contentPane.add(getBtnNewButton());

		JLabel lblNewLabel_1_4_1 = new JLabel("Join Date :");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(30, 465, 178, 44);
		contentPane.add(lblNewLabel_1_4_1);
		contentPane.add(getDateChooser1());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnCancel());
	}

	private JRadioButton getOther() {
		if (Other == null) {
			Other = new JRadioButton("Other");
			buttonGroup.add(Other);
			Other.setBounds(327, 419, 73, 23);
		}
		return Other;
	}

	private JTextField getTxtusername() {
		if (txtusername == null) {
			txtusername = new JTextField();
			txtusername.setColumns(10);
			txtusername.setBounds(835, 313, 266, 44);
		}
		return txtusername;
	}

	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Username");
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_1_3.setBounds(590, 313, 178, 44);
		}
		return lblNewLabel_1_3;
	}

	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Date of birth :");
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_1_4.setBounds(590, 381, 178, 44);
		}
		return lblNewLabel_1_4;
	}

	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(835, 395, 133, 23);
		}
		return dateChooser;
	}

	private JLabel getUlabel() {
		if (ulabel == null) {
			ulabel = new JLabel("");
			ulabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			ulabel.setBounds(600, 58, 168, 195);
		}
		return ulabel;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Upload");
			btnNewButton.setForeground(new Color(51, 0, 204));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton.setBounds(835, 91, 144, 55);
		}
		return btnNewButton;
	}

	private JDateChooser getDateChooser1() {
		if (dateChooser1 == null) {
			dateChooser1 = new JDateChooser();
			dateChooser1.setBounds(239, 477, 133, 23);
		}
		return dateChooser1;
	}

	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("ADD ");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Employee empl = new Employee();
					empl.setEmployeeName(nametxt.getText());
					empl.setUsername(txtusername.getText());
					empl.setAddress(txtaddr.getText());
					empl.setPhonenumber(txtpno.getText());
					empl.setEmail(txtemail.getText());
					empl.setDateofBirth(new Date(dateChooser.getDate().getTime()));
					empl.setJoinDate((java.sql.Date) new Date(dateChooser1.getDate().getTime()));

//					if (Male.isSelected()) {
//						empl.setSex("Male");
//					} else if (Female.isSelected()) {
//						empl.setSex("Female");
//
//					} else {
//						empl.setSex("Other");
//
//					}

					EmployeeService es = new EmployeeServiceImpl();
					boolean result = es.addEmployee(empl);

					if (result) {
						JOptionPane.showMessageDialog(null, "added Sucess");

					} else {
						JOptionPane.showMessageDialog(null, "added Unsucess");

					}

				}
			});
			btnAdd.setForeground(Color.GRAY);
			btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAdd.setBounds(742, 567, 144, 55);
		}
		return btnAdd;
	}

	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					JOptionPane.showMessageDialog(null, "Do you want to exit?");
					dispose();
				}
			});

			btnCancel.setForeground(Color.GRAY);
			btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnCancel.setBounds(495, 567, 144, 55);
		}
		return btnCancel;
	}
}
