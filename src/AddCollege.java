import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCollege extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField name;
	private JTextField city;
	private JComboBox type;
	private JLabel lblNewLabel_6;
	private JTextField textField;
	private JTextField t;
	
	public static void main(String[] args) {
		try {
			AddCollege dialog = new AddCollege();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Random ran = new Random();
	long f = (ran.nextLong() % 9000L) + 1000L;
	long first = Math.abs(f);
	
	
	public AddCollege() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 50);
		panel.setBackground(SystemColor.textHighlight);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add College");
		lblNewLabel.setBounds(117, 5, 200, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JButton sub = new JButton("Submit");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()||name.getText().isEmpty()||city.getText().isEmpty()||t.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Every Feild Must Be Filled");
				}
				else {
				String a = textField.getText();
				String b = name.getText();
				String c = city.getText();
				String d = t.getText();
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
					System.out.println("Connected Successfully");
					
					PreparedStatement pst = connection.prepareStatement("insert into College values(?,?,?,?)");
					
					pst.setString(1, a);
					pst.setString(2, b);
					pst.setString(3, c);
					pst.setString(4, d);
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Inserted Successfully");
					setVisible(false);
					
				}catch(Exception er) {
					System.out.println(er);
				}
				 }
			}
		});
		sub.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		sub.setFocusable(false);
		sub.setBounds(73, 305, 89, 23);
		contentPanel.add(sub);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(273, 305, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("College Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(36, 184, 120, 20);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("City");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(36, 214, 120, 20);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Type");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(36, 244, 120, 20);
		contentPanel.add(lblNewLabel_4);
		
		name = new JTextField();
		name.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		name.setBounds(192, 185, 200, 20);
		contentPanel.add(name);
		name.setColumns(10);
		
		city = new JTextField();
		city.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		city.setBounds(192, 215, 200, 20);
		contentPanel.add(city);
		city.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(AddCollege.class.getResource("/IMAGE/images__2_-removebg-preview.png")));
		lblNewLabel_5.setBounds(167, 50, 100, 100);
		contentPanel.add(lblNewLabel_5);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setText("3"+first);
		textField.setBounds(192, 154, 200, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		t = new JTextField();
		t.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		t.setBounds(192, 245, 200, 20);
		contentPanel.add(t);
		t.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("College id");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(36, 160, 120, 20);
		contentPanel.add(lblNewLabel_1);
		
		
	}
}
