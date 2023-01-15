import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Adminlogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Adminlogin dialog = new Adminlogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Adminlogin() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 151, 262);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Adminlogin.class.getResource("/IMAGE/customer-login-icon-17 (3).png")));
		lblNewLabel.setBounds(25, 81, 100, 100);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Login Id");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(180, 40, 120, 20);
		contentPanel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(180, 70, 150, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(180, 100, 120, 20);
		contentPanel.add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		passwordField.setBounds(180, 130, 150, 20);
		contentPanel.add(passwordField);

		JButton Log = new JButton("Login");
		Log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
							"H@rSHiTR24");
					System.out.println("Connected Successfully");

					PreparedStatement pst = connection
							.prepareStatement("select * from Admin where LoginId=? and Password=?");
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());

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
						Adminlogin h = new Adminlogin();
						h.setVisible(true);
					}
					
				} catch (Exception er) {
					System.out.println(er);
				}
			}
		});
		Log.setFocusable(false);
		Log.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Log.setBounds(180, 189, 89, 23);
		contentPanel.add(Log);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				HOMEPAGE h = new HOMEPAGE();
				h.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(300, 189, 89, 23);
		contentPanel.add(btnNewButton_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					passwordField.setEchoChar('*');

				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox.setBounds(180, 150, 133, 23);
		contentPanel.add(chckbxNewCheckBox);
	}
}
