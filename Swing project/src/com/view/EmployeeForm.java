package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField FNametxt;
	private JTextField LNametxt;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JPanel panel;
	private JLabel lblNewLabel_15;
	private JTextField Agetxt;
	private JTextField Countrytxt;
	private JTextField Statetxt;
	private JTextField Citytxt;
	private JTextField Salarytxt;
	private JTextField CmpNametxt;
	private JTextField Departmenttxt;
	private JRadioButton Malebtn;
	private JRadioButton Femalebtn;
	private JButton Addbtn;
	private JButton Updatebtn;
	private JButton Deletebtn;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton Uploadbtn;
	private JPanel panel_3;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel Image;
	private JComboBox jcbox;
	private JDateChooser DOB;
	private JDateChooser JoinDate;
	private JButton Savebtn;
	private JRadioButton Otherbtn;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField Phonetxt;
	private JTextField Emailtxt;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JTextField textField;
	private JLabel lblNewLabel_2_2_1;
	private String imageName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setTitle("Employee Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_2());
		contentPane.add(getPanel_3());
		displayData();
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setBounds(10, 49, 85, 23);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Last Name");
			lblNewLabel_2.setBounds(253, 52, 85, 23);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblNewLabel_2;
	}

	private JTextField getFNametxt() {
		if (FNametxt == null) {
			FNametxt = new JTextField();
			FNametxt.setBounds(133, 50, 96, 19);
			FNametxt.setColumns(10);
		}
		return FNametxt;
	}

	private JTextField getLNametxt() {
		if (LNametxt == null) {
			LNametxt = new JTextField();
			LNametxt.setBounds(348, 54, 96, 19);
			LNametxt.setColumns(10);
		}
		return LNametxt;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Age");
			lblNewLabel_3.setBounds(10, 93, 71, 17);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_3;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Post");
			lblNewLabel_4.setBounds(10, 206, 45, 13);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_4;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Department");
			lblNewLabel_5.setBounds(253, 255, 79, 13);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_5;
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Salary");
			lblNewLabel_6.setBounds(253, 206, 45, 13);
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_6;
	}

	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Gender");
			lblNewLabel_7.setBounds(253, 97, 45, 13);
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_7;
	}

	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Date of Birth");
			lblNewLabel_8.setBounds(10, 303, 108, 29);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_8;
	}

	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Company Name");
			lblNewLabel_9.setBounds(10, 255, 108, 13);
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_9;
	}

	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Join Date");
			lblNewLabel_10.setBounds(253, 312, 71, 19);
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_10;
	}

	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("Country");
			lblNewLabel_11.setBounds(10, 138, 87, 13);
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_11;
	}

	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("State");
			lblNewLabel_12.setBounds(253, 171, 45, 13);
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_12;
	}

	private JLabel getLblNewLabel_13() {
		if (lblNewLabel_13 == null) {
			lblNewLabel_13 = new JLabel("City");
			lblNewLabel_13.setBounds(10, 171, 45, 13);
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblNewLabel_13;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(10, 11, 733, 424);
			panel.setLayout(null);
			panel.add(getLblNewLabel_15());
			panel.add(getLblNewLabel_7());
			panel.add(getLblNewLabel_11());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_5());
			panel.add(getLblNewLabel_6());
			panel.add(getPanel_1());
			panel.add(getLblNewLabel_10());
			panel.add(getLblNewLabel_12());
			panel.add(getLblNewLabel_8());
			panel.add(getLblNewLabel_9());
			panel.add(getLblNewLabel_13());
			panel.add(getAgetxt());
			panel.add(getLblNewLabel_2());
			panel.add(getLNametxt());
			panel.add(getFNametxt());
			panel.add(getLblNewLabel_1());
			panel.add(getCountrytxt());
			panel.add(getStatetxt());
			panel.add(getCitytxt());
			panel.add(getSalarytxt());
			panel.add(getCmpNametxt());
			panel.add(getDepartmenttxt());
			panel.add(getMalebtn());
			panel.add(getFemalebtn());
			panel.add(getAddbtn());
			panel.add(getUpdatebtn());
			panel.add(getDeletebtn());
			panel.add(getJcbox());
			panel.add(getDOB());
			panel.add(getJoinDate());
			panel.add(getSavebtn());
			panel.add(getOtherbtn());
			panel.add(getLblNewLabel_3());
			panel.add(getPhonetxt());
			panel.add(getEmailtxt());
			panel.add(getLblNewLabel_2_1());
			panel.add(getLblNewLabel_2_2());
			panel.add(getTextField());
			panel.add(getLblNewLabel_2_2_1());
		}
		return panel;
	}

	private JLabel getLblNewLabel_15() {
		if (lblNewLabel_15 == null) {
			lblNewLabel_15 = new JLabel("Personal Details");
			lblNewLabel_15.setFont(new Font("Eras Bold ITC", Font.PLAIN, 14));
			lblNewLabel_15.setBounds(10, 10, 134, 29);
		}
		return lblNewLabel_15;
	}

	private JTextField getAgetxt() {
		if (Agetxt == null) {
			Agetxt = new JTextField();
			Agetxt.setBounds(133, 91, 96, 19);
			Agetxt.setColumns(10);
		}
		return Agetxt;
	}

	private JTextField getCountrytxt() {
		if (Countrytxt == null) {
			Countrytxt = new JTextField();
			Countrytxt.setBounds(133, 132, 96, 19);
			Countrytxt.setColumns(10);
		}
		return Countrytxt;
	}

	private JTextField getStatetxt() {
		if (Statetxt == null) {
			Statetxt = new JTextField();
			Statetxt.setBounds(347, 170, 96, 19);
			Statetxt.setColumns(10);
		}
		return Statetxt;
	}

	private JTextField getCitytxt() {
		if (Citytxt == null) {
			Citytxt = new JTextField();
			Citytxt.setBounds(133, 165, 96, 19);
			Citytxt.setColumns(10);
		}
		return Citytxt;
	}

	private JTextField getSalarytxt() {
		if (Salarytxt == null) {
			Salarytxt = new JTextField();
			Salarytxt.setBounds(347, 205, 96, 19);
			Salarytxt.setColumns(10);
		}
		return Salarytxt;
	}

	private JTextField getCmpNametxt() {
		if (CmpNametxt == null) {
			CmpNametxt = new JTextField();
			CmpNametxt.setBounds(128, 254, 96, 19);
			CmpNametxt.setColumns(10);
		}
		return CmpNametxt;
	}

	private JTextField getDepartmenttxt() {
		if (Departmenttxt == null) {
			Departmenttxt = new JTextField();
			Departmenttxt.setBounds(347, 254, 96, 19);
			Departmenttxt.setColumns(10);
		}
		return Departmenttxt;
	}

	private JRadioButton getMalebtn() {
		if (Malebtn == null) {
			Malebtn = new JRadioButton("Male");
			buttonGroup.add(Malebtn);
			Malebtn.setBounds(333, 98, 71, 15);
		}
		return Malebtn;
	}

	private JRadioButton getFemalebtn() {
		if (Femalebtn == null) {
			Femalebtn = new JRadioButton("Female");
			buttonGroup.add(Femalebtn);
			Femalebtn.setBounds(406, 98, 71, 15);
		}
		return Femalebtn;
	}

	private JButton getAddbtn() {
		if (Addbtn == null) {
			Addbtn = new JButton("Add");
			Addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Employee empl = new Employee();
					empl.setFname(FNametxt.getText());
					empl.setLname(LNametxt.getText());
					empl.setAge(Integer.parseInt(Agetxt.getText()));
					empl.setCity(Citytxt.getText());
					empl.setCompanyName(CmpNametxt.getText());
					empl.setDepartment(Departmenttxt.getText());
					empl.setDob(new Date(DOB.getDate().getTime()));
					empl.setEmail(Emailtxt.getText());
					empl.setJoindate(new Date(JoinDate.getDate().getTime()));
					empl.setPhone(Phonetxt.getText());
					empl.setImage(Image.getText());
					empl.setPost(jcbox.getSelectedItem().toString());
					empl.setSalary(Integer.parseInt(Salarytxt.getText()));
					empl.setState(Statetxt.getText());
					empl.setCountry(Countrytxt.getText());

					if (Malebtn.isSelected()) {
						empl.setGender("Male");
					} else if (Femalebtn.isSelected()) {
						empl.setGender("Female");

					} else {
						empl.setGender("Other");

					}

					EmployeeService es = new EmployeeServiceImpl();
					boolean result = es.addEmployee(empl);

					if (result) {
						JOptionPane.showMessageDialog(null, "added Sucess");
						displayData();
					} else {
						JOptionPane.showMessageDialog(null, "failed");
					}

				}

			});
			Addbtn.setBounds(162, 368, 85, 21);
		}
		return Addbtn;
	}

	private JButton getUpdatebtn() {
		if (Updatebtn == null) {
			Updatebtn = new JButton("Update");
			Updatebtn.setBounds(273, 368, 85, 21);
		}
		return Updatebtn;
	}

	private JButton getDeletebtn() {
		if (Deletebtn == null) {
			Deletebtn = new JButton("Delete");
			Deletebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "please, Select any row");
						return;

					}
					int selectedRow = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(selectedRow, 0);

					EmployeeService es = new EmployeeServiceImpl();
					if (es.deleteEmployee(id)) {
						JOptionPane.showMessageDialog(null, "sucessfully deleted");
						displayData();
					} else {
						JOptionPane.showMessageDialog(null, "Unsucessfull");
					}
				}

			});
			Deletebtn.setBounds(376, 368, 85, 21);
		}
		return Deletebtn;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 10, 10);
		}
		return panel_1;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBounds(753, 21, 297, 212);
			panel_2.setLayout(null);
			panel_2.add(getUploadbtn());
			panel_2.add(getImage());
		}
		return panel_2;
	}

	private JButton getUploadbtn() {
		if (Uploadbtn == null) {
			Uploadbtn = new JButton("Upload");
			Uploadbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

//					JFileChooser jf =new JFileChooser();
//					jf.showOpenDialog(null);
//					File image = jf.getSelectedFile();
//					Image.setIcon(new ImageIcon(new ImageIcon(image.getAbsolutePath().getImage().getScaledInstance(Image.getWidth(),Image.getHeight(),DO_NOTHING_ON_CLOSE))));
//					
//					imageName = image.getName();

				}
			});
			Uploadbtn.setBounds(187, 60, 85, 21);
		}
		return Uploadbtn;
	}

	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBounds(21, 448, 1068, 241);
			panel_3.setLayout(null);
			panel_3.add(getScrollPane_1());
		}
		return panel_3;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 1048, 219);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "ID", "FirstName", "LastName", "Age", "Gender", "Company", "Post", "Department",
							"Salary", "DOB", "Join Date", "State", "City", "Phone", "Email", "state" }));
		}
		return table;
	}

	private JLabel getImage() {
		if (Image == null) {
			Image = new JLabel("Image");
			Image.setForeground(Color.LIGHT_GRAY);
			Image.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			Image.setBounds(10, 23, 133, 178);
		}
		return Image;
	}

	private JComboBox getJcbox() {
		if (jcbox == null) {
			jcbox = new JComboBox();
			jcbox.setModel(new DefaultComboBoxModel(
					new String[] { "------Select--------", "CEO", "Manager", "Sub-Manager", "HR", "Emoployee" }));
			jcbox.setBounds(133, 203, 96, 16);
		}
		return jcbox;
	}

	private JDateChooser getDOB() {
		if (DOB == null) {
			DOB = new JDateChooser();
			DOB.setBounds(121, 312, 96, 19);
		}
		return DOB;
	}

	private JDateChooser getJoinDate() {
		if (JoinDate == null) {
			JoinDate = new JDateChooser();
			JoinDate.setBounds(347, 312, 96, 19);
		}
		return JoinDate;
	}

	private JButton getSavebtn() {
		if (Savebtn == null) {
			Savebtn = new JButton("Save");
			Savebtn.setBounds(50, 367, 85, 21);
		}
		return Savebtn;
	}

	private JRadioButton getOtherbtn() {
		if (Otherbtn == null) {
			Otherbtn = new JRadioButton("other");
			buttonGroup.add(Otherbtn);
			Otherbtn.setBounds(479, 98, 96, 15);
		}
		return Otherbtn;
	}

	private JTextField getPhonetxt() {
		if (Phonetxt == null) {
			Phonetxt = new JTextField();
			Phonetxt.setColumns(10);
			Phonetxt.setBounds(347, 132, 96, 19);
		}
		return Phonetxt;
	}

	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setColumns(10);
			Emailtxt.setBounds(567, 54, 96, 19);
		}
		return Emailtxt;
	}

	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Phone No");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2_1.setBounds(253, 128, 85, 23);
		}
		return lblNewLabel_2_1;
	}

	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("E-mail");
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2_2.setBounds(472, 52, 85, 23);
		}
		return lblNewLabel_2_2;

	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String searchData = textField.getText().trim();
					EmployeeService es = new EmployeeServiceImpl();
					es.searchEmployee(searchData);
					List<Employee> empList = es.searchEmployee(searchData);

					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0); // re-set table data

					for (Employee emp : empList) {
						tmodel.addRow(new Object[] { emp.getId(), emp.getFname(), emp.getLname(), emp.getAge(),
								emp.getGender(), emp.getCompanyName(), emp.getPost(), emp.getDepartment(),
								emp.getSalary(), emp.getSalary(), emp.getDob(), emp.getJoindate(), emp.getState(),
								emp.getCity(), emp.getPhone(), emp.getEmail(), emp.getState() });

					}

				}
			});
			textField.setColumns(10);
			textField.setBounds(608, 313, 96, 19);
		}
		return textField;
	}

	// displaying data in table
	private void displayData() {
		EmployeeService es = new EmployeeServiceImpl();
		List<Employee> empList = es.getAllEmployee();

		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0); // re-set table data

		for (Employee emp : empList) {
			tmodel.addRow(new Object[] { emp.getId(), emp.getFname(), emp.getLname(), emp.getAge(), emp.getGender(),
					emp.getCompanyName(), emp.getPost(), emp.getDepartment(), emp.getSalary(), emp.getSalary(),
					emp.getDob(), emp.getJoindate(), emp.getState(), emp.getCity(), emp.getPhone(), emp.getEmail(),
					emp.getState() });

		}

	}

	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2_1 == null) {
			lblNewLabel_2_2_1 = new JLabel("Search Data");
			lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2_2_1.setBounds(501, 311, 85, 23);
		}
		return lblNewLabel_2_2_1;
	}
}
