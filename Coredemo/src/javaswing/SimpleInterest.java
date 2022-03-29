package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleInterest extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrinciple;
	private JTextField txtTime;
	private JTextField txtRate;
	private JTextField txtAmount;
	private JTextField txtSI;
	private JLabel lblSimpleInterest;
	private JLabel lblAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleInterest frame = new SimpleInterest();
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
	public SimpleInterest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 386, 847, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtAmount = new JTextField();
		txtAmount.setForeground(Color.LIGHT_GRAY);
		txtAmount.setFont(new Font("Tahoma", Font.PLAIN, 42));
		txtAmount.setBounds(615, 25, 205, 57);
		panel.add(txtAmount);
		txtAmount.setColumns(10);
		
		txtSI = new JTextField();
		txtSI.setBounds(180, 38, 177, 57);
		panel.add(txtSI);
		txtSI.setColumns(10);
		
		lblSimpleInterest = new JLabel("Simple Interest");
		lblSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblSimpleInterest.setBounds(10, 35, 108, 41);
		panel.add(lblSimpleInterest);
		
		lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblAmount.setBounds(449, 41, 113, 41);
		panel.add(lblAmount);
		
		txtPrinciple = new JTextField();
		txtPrinciple.setBounds(457, 34, 352, 54);
		contentPane.add(txtPrinciple);
		txtPrinciple.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setBounds(457, 124, 352, 54);
		contentPane.add(txtTime);
		txtTime.setColumns(10);
		
		txtRate = new JTextField();
		txtRate.setBounds(457, 224, 352, 54);
		contentPane.add(txtRate);
		txtRate.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Principle :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(24, 34, 249, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblTime = new JLabel("Time :");
		lblTime.setForeground(Color.BLACK);
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTime.setBounds(24, 124, 249, 54);
		contentPane.add(lblTime);
		
		JLabel lblRate = new JLabel("Rate :");
		lblRate.setForeground(Color.BLACK);
		lblRate.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblRate.setBounds(24, 224, 249, 54);
		contentPane.add(lblRate);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double P = Integer.parseInt(txtPrinciple.getText());
				double T = IntergerParse(txtTime.getText());
				double R = IntergerParse(txtRate.getText());
				double SI = (P*T*R)/100;
				txtSI.setText(""+SI);
				double a = SI+P;
				
				txtAmount.setText(""+a);
				
				
				
			}

			private int IntergerParse(String text) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		btnNewButton.setBounds(24, 318, 191, 59);
		contentPane.add(btnNewButton);
	}
}
