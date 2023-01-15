import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField slog;
	private JPasswordField spass;
	private JTextField flog;
	private JTextField clog;
	private JTextField alog;
	private JPasswordField fpass;
	private JPasswordField cpass;
	private JPasswordField apass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
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
	public LOGIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 1366, 250);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblNewLabel.setBounds(583, 100, 200, 50);
		panel.add(lblNewLabel);

		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HOMEPAGE home = new HOMEPAGE();
				home.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(SystemColor.textHighlight);
		btnNewButton_4.setBounds(1200, 170, 100, 50);
		panel.add(btnNewButton_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setBounds(448, 275, 454, 425);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.BLACK);
		tabbedPane.setBackground(SystemColor.textHighlight);
		tabbedPane.setFont(new Font("Times New Roman", Font.BOLD, 16));
		tabbedPane.setBounds(0, 0, 454, 425);
		panel_1.add(tabbedPane);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.text);
		panel_2.setBackground(SystemColor.inactiveCaptionText);
		tabbedPane.addTab("Student Login", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(LOGIN.class.getResource("/IMAGE/images__15_-removebg-preview.png")));
		lblNewLabel_1.setBounds(174, 25, 100, 100);
		panel_2.add(lblNewLabel_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.textHighlight);
		panel_6.setBounds(0, 0, 449, 150);
		panel_2.add(panel_6);

		JLabel lblNewLabel_2 = new JLabel("Login Id");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(124, 170, 100, 25);
		panel_2.add(lblNewLabel_2);

		slog = new JTextField();
		slog.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		slog.setBounds(124, 200, 200, 30);
		panel_2.add(slog);
		slog.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(124, 240, 200, 25);
		panel_2.add(lblNewLabel_3);

		spass = new JPasswordField();
		spass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		spass.setBounds(124, 270, 200, 30);
		panel_2.add(spass);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
							"H@rSHiTR24");
					System.out.println("Connected Successfully");

					PreparedStatement pst = connection
							.prepareStatement("select * from Student where Student_Id=? and Student_Id=?");
					pst.setString(1, slog.getText());
					pst.setString(2, spass.getText());

					ResultSet rs = pst.executeQuery();

					int count = 0;
					while (rs.next()) {
						count = count + 1;
					}

					if (count == 1) {
						String id = slog.getText();
						STUDENTPAGE a = new STUDENTPAGE(id);
						a.setVisible(true); 
						setVisible(false);
						
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate entery found");
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect LoginId and Password");
						setVisible(false);
						LOGIN c = new LOGIN();
						c.setVisible(true);
					}
					
				} catch (Exception er) {
					System.out.println(er);
				}

			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(174, 340, 100, 30);
		panel_2.add(btnNewButton);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					spass.setEchoChar((char) 0);
				} else {
					spass.setEchoChar('*');

				}
			}
		});
		chckbxNewCheckBox.setForeground(SystemColor.text);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxNewCheckBox.setBackground(SystemColor.inactiveCaptionText);
		chckbxNewCheckBox.setBounds(124, 310, 150, 15);
		panel_2.add(chckbxNewCheckBox);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionText);
		tabbedPane.addTab("Faculty Login", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.textHighlight);
		panel_7.setBounds(0, 0, 449, 150);
		panel_3.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(LOGIN.class.getResource("/IMAGE/images__14_-removebg-preview.png")));
		lblNewLabel_4.setBounds(174, 25, 100, 100);
		panel_7.add(lblNewLabel_4);

		JLabel lblNewLabel_7 = new JLabel("Login Id");
		lblNewLabel_7.setForeground(SystemColor.text);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(124, 170, 100, 25);
		panel_3.add(lblNewLabel_7);

		flog = new JTextField();
		flog.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		flog.setBounds(124, 200, 200, 30);
		panel_3.add(flog);
		flog.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Password");
		lblNewLabel_10.setForeground(SystemColor.text);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(124, 240, 100, 25);
		panel_3.add(lblNewLabel_10);

		fpass = new JPasswordField();
		fpass.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		fpass.setBounds(124, 270, 200, 30);
		panel_3.add(fpass);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Show Password");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_1.isSelected()) {
					fpass.setEchoChar((char) 0);
				} else {
					fpass.setEchoChar('*');

				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setForeground(SystemColor.text);
		chckbxNewCheckBox_1.setBackground(SystemColor.inactiveCaptionText);
		chckbxNewCheckBox_1.setBounds(124, 310, 150, 15);
		panel_3.add(chckbxNewCheckBox_1);

		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
						"H@rSHiTR24");
				System.out.println("Connected Successfully");

				PreparedStatement pst = connection
						.prepareStatement("select * from Faculty where Faculty_id=? and Faculty_id=?");
				pst.setString(1, flog.getText());
				pst.setString(2, fpass.getText());

				ResultSet rs = pst.executeQuery();

				int count = 0;
				while (rs.next()) {
					count = count + 1;
				}

				if (count == 1) {
					String id = flog.getText();
					Faculty a = new Faculty(id);
					a.setVisible(true); 
					setVisible(false);
					
				} else if (count > 1) {
					JOptionPane.showMessageDialog(null, "Duplicate entery found");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect LoginId and Password");
					setVisible(false);
					LOGIN c = new LOGIN();
					c.setVisible(true);
				}
				
			} catch (Exception er) {
				System.out.println(er);
			}

			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.setBounds(174, 340, 100, 30);
		panel_3.add(btnNewButton_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionText);
		tabbedPane.addTab("College Login", null, panel_4, null);
		panel_4.setLayout(null);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.textHighlight);
		panel_8.setBounds(0, 0, 449, 150);
		panel_4.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(LOGIN.class.getResource("/IMAGE/images__2_-removebg-preview.png")));
		lblNewLabel_5.setBounds(174, 25, 100, 100);
		panel_8.add(lblNewLabel_5);

		JLabel lblNewLabel_8 = new JLabel("Login Id");
		lblNewLabel_8.setForeground(SystemColor.text);
		lblNewLabel_8.setBackground(SystemColor.text);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(124, 170, 100, 25);
		panel_4.add(lblNewLabel_8);

		clog = new JTextField();
		clog.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		clog.setBounds(124, 200, 200, 30);
		panel_4.add(clog);
		clog.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Password");
		lblNewLabel_11.setForeground(SystemColor.text);
		lblNewLabel_11.setBackground(SystemColor.text);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(124, 240, 100, 25);
		panel_4.add(lblNewLabel_11);

		cpass = new JPasswordField();
		cpass.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cpass.setBounds(124, 270, 200, 30);
		panel_4.add(cpass);

		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
							"H@rSHiTR24");
					System.out.println("Connected Successfully");

					PreparedStatement pst = connection
							.prepareStatement("select * from College where College_Id=? and College_Id=?");
					pst.setString(1, clog.getText());
					pst.setString(2, cpass.getText());

					ResultSet rs = pst.executeQuery();

					int count = 0;
					while (rs.next()) {
						count = count + 1;
					}

					if (count == 1) {
						String id = clog.getText();
						CollegePage a = new CollegePage(id);
						a.setVisible(true); 
						setVisible(false);
						
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate entery found");
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect LoginId and Password");
						setVisible(false);
						LOGIN c = new LOGIN();
						c.setVisible(true);
					}
					
				} catch (Exception er) {
					System.out.println(er);
				}
				
			}
		});
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_2.setBounds(174, 340, 100, 30);
		panel_4.add(btnNewButton_2);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Show Password");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_2.isSelected()) {
					cpass.setEchoChar((char) 0);
				}
			}
		});
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxNewCheckBox_2.setBackground(SystemColor.inactiveCaptionText);
		chckbxNewCheckBox_2.setBounds(124, 310, 150, 15);
		panel_4.add(chckbxNewCheckBox_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.inactiveCaptionText);
		tabbedPane.addTab("Admin Login", null, panel_5, null);
		panel_5.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(SystemColor.textHighlight);
		panel_9.setBounds(0, 0, 449, 150);
		panel_5.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(LOGIN.class.getResource("/IMAGE/customer-login-icon-17 (3).png")));
		lblNewLabel_6.setBounds(174, 25, 100, 100);
		panel_9.add(lblNewLabel_6);

		JLabel lblNewLabel_9 = new JLabel("Login Id");
		lblNewLabel_9.setForeground(SystemColor.text);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(124, 170, 100, 25);
		panel_5.add(lblNewLabel_9);

		alog = new JTextField();
		alog.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		alog.setBounds(124, 200, 200, 30);
		panel_5.add(alog);
		alog.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Password");
		lblNewLabel_12.setForeground(SystemColor.text);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(124, 240, 100, 25);
		panel_5.add(lblNewLabel_12);

		apass = new JPasswordField();
		apass.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		apass.setBounds(124, 270, 200, 30);
		panel_5.add(apass);

		JButton btnNewButton_3 = new JButton("Login");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
						"H@rSHiTR24");
				System.out.println("Connected Successfully");

				PreparedStatement pst = connection
						.prepareStatement("select * from Admin where LoginId=? and Password=?");
				pst.setString(1, alog.getText());
				pst.setString(2, apass.getText());

				ResultSet rs = pst.executeQuery();

				int count = 0;
				while (rs.next()) {
					count = count + 1;
				}

				if (count == 1) {
					ADMINPAGE a = new ADMINPAGE();
					a.setVisible(true);
					setVisible(false);
					
				} else if (count > 1) {
					JOptionPane.showMessageDialog(null, "Duplicate entery found");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect LoginId and Password");
					setVisible(false);
					LOGIN h = new LOGIN();
					h.setVisible(true);
				}
				
			} catch (Exception er) {
				System.out.println(er);
			}

			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBounds(174, 340, 100, 30);
		panel_5.add(btnNewButton_3);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Show Password");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_3.isSelected()) {
					apass.setEchoChar((char) 0);
				} else {
					apass.setEchoChar('*');

				}

			}
		});
		chckbxNewCheckBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxNewCheckBox_3.setForeground(Color.WHITE);
		chckbxNewCheckBox_3.setBackground(SystemColor.inactiveCaptionText);
		chckbxNewCheckBox_3.setBounds(124, 310, 150, 15);
		panel_5.add(chckbxNewCheckBox_3);
	}
}
