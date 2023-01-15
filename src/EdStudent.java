import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class EdStudent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EdStudent dialog = new EdStudent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EdStudent() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setBounds(300, 10, 500, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 485, 50);
		panel.setBackground(SystemColor.textHighlight);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit");
		lblNewLabel.setBounds(142, 5, 200, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(50, 189, 120, 20);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(50, 219, 120, 20);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father Name");
		lblNewLabel_3.setBounds(50, 249, 120, 20);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No");
		lblNewLabel_4.setBounds(50, 309, 120, 20);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(220, 189, 200, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_1.setBounds(220, 219, 200, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_2.setBounds(220, 249, 200, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_3.setBounds(220, 309, 200, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Last Qualification");
		lblNewLabel_6.setBounds(50, 339, 150, 20);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		contentPanel.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_1.setBounds(220, 339, 200, 20);
		contentPanel.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("Marks Obtain");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(50, 369, 120, 20);
		contentPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Out off");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(50, 399, 120, 20);
		contentPanel.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_4.setBounds(220, 369, 200, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_5.setBounds(220, 399, 200, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Date of Birth");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(50, 429, 160, 20);
		contentPanel.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_6.setBounds(220, 429, 200, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gender");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(50, 459, 120, 20);
		contentPanel.add(lblNewLabel_10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFocusable(false);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setBounds(220, 459, 109, 23);
		contentPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFocusable(false);
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setBounds(335, 459, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_11 = new JLabel("Aadhar No.");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(50, 489, 120, 20);
		contentPanel.add(lblNewLabel_11);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_7.setBounds(220, 489, 200, 20);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Motther Name");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(50, 279, 120, 20);
		contentPanel.add(lblNewLabel_12);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_8.setBounds(220, 279, 200, 20);
		contentPanel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("State ");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(50, 519, 120, 20);
		contentPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("City");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_15.setBounds(50, 549, 120, 20);
		contentPanel.add(lblNewLabel_15);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_9.setBounds(220, 519, 200, 20);
		contentPanel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_10.setBounds(220, 549, 200, 20);
		contentPanel.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(105, 591, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(305, 591, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon(EdStudent.class.getResource("/IMAGE/images__15_-removebg-preview.png")));
		lblNewLabel_16.setBounds(192, 55, 100, 100);
		contentPanel.add(lblNewLabel_16);
	}
}
