package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTest extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField addresstxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest frame = new TableTest();
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
	public TableTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(32, 43, 89, 25);
		contentPane.add(lblNewLabel);
		
		nametxt = new JTextField();
		nametxt.setBounds(131, 43, 117, 26);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(288, 44, 82, 31);
		contentPane.add(lblNewLabel_1);
		
		addresstxt = new JTextField();
		addresstxt.setBounds(380, 47, 129, 25);
		contentPane.add(addresstxt);
		addresstxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Collage");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(555, 52, 82, 25);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton malerbt = new JRadioButton("Male");
		buttonGroup.add(malerbt);
		malerbt.setBounds(89, 119, 62, 21);
		contentPane.add(malerbt);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(27, 121, 56, 19);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton femalerbt = new JRadioButton("Female");
		buttonGroup.add(femalerbt);
		femalerbt.setBounds(167, 118, 111, 23);
		contentPane.add(femalerbt);
		
		JCheckBox checkbox = new JCheckBox("Agree");
		checkbox.setBounds(382, 118, 99, 23);
		contentPane.add(checkbox);
		
		JComboBox college = new JComboBox();
		college.setModel(new DefaultComboBoxModel(new String[] {"---------Select--------", "NCC", "ISMT", "ABC", "XYZ"}));
		college.setBounds(660, 48, 165, 22);
		contentPane.add(college);
		
		JButton addbtn = new JButton("ADD");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name = nametxt.getText();
			String addr = addresstxt.getText();
			String clz = college.getSelectedItem().toString();
			String gender;
			
			if(malerbt.isSelected()) {
				gender = "male";
			}else {
				
				gender = "Female";
			}
			String agr;
			if(checkbox.isSelected()) {
				agr = "Yes";
				
			}else {
				agr = "No";
			}
			
			// ============= Set data in jtable ===========
			
			DefaultTableModel tabel = (DefaultTableModel) table.getModel();
			tabel.addRow(new Object[] {name,addr ,clz,gender,agr});
			
			
			
			}
		});
		addbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addbtn.setBounds(626, 107, 185, 60);
		contentPane.add(addbtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 200, 893, 324);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "Collage", "Gender", "Agree"
				}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		
	}
}
