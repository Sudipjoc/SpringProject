package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;

public class IndexPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexPage frame = new IndexPage();
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
	public IndexPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 604);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginForm().setVisible(true);
			}
		});
		mnNewMenu.add(mntmOpen);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Close");
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenuBar menuBar_2 = new JMenuBar();
		mnNewMenu.add(menuBar_2);

		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Search");
		mnNewMenu_1.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Install");
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_2 = new JMenu("Run");
		menuBar.add(mnNewMenu_2);

		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu_2.add(menuBar_1);

		JMenu mnNewMenu_3 = new JMenu("Run As");
		mnNewMenu_2.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_4 = new JMenu("New menu");
		mnNewMenu_2.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setBounds(206, 89, 439, 323);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Upload");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jf = new JFileChooser();
				jf.showOpenDialog(null);
				File image = jf.getSelectedFile();

				long imagesize = image.length() / 1024;
				if (imagesize > 200) {
					JOptionPane.showInternalMessageDialog(null, "max file is 200 kb");
					return;
				}
				String imgEXT = image.getName().split("\\.")[1];

				if (!imgEXT.equalsIgnoreCase("jpg")) {
					lblNewLabel.setIcon(new ImageIcon(new ImageIcon(image.getAbsolutePath()).getImage()
							.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), DO_NOTHING_ON_CLOSE)));
				} else {
					JOptionPane.showInternalMessageDialog(null, "Image should be in JPG");
				}
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(image.getAbsolutePath()).getImage()
						.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), DO_NOTHING_ON_CLOSE)));

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(277, 11, 215, 28);
		contentPane.add(btnNewButton);
	}
}
