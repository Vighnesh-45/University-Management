import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class AddCourse extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField co;
	private JTextField cn;
	private JTextField sn;
	private JTextField no;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddCourse dialog = new AddCourse();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddCourse() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setBounds(100, 100, 450, 450);
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
		
		JLabel lblNewLabel = new JLabel("Add Course");
		lblNewLabel.setBounds(117, 5, 200, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(co.getText().isEmpty()||cn.getText().isEmpty()||sn.getText().isEmpty()||no.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Every Feild Must Be Filled");
				}
				else {
				String a = co.getText();
				String b = cn.getText();
				String c = sn.getText();
				String d = no.getText();
				
				try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
				System.out.println("Connected Successfully");
				
				PreparedStatement pst = connection.prepareStatement("insert into Course values(?,?,?,?)");
				
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
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(73, 338, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(273, 338, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Course Code");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(36, 188, 120, 20);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Course Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(36, 218, 120, 20);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Short Name");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(36, 248, 120, 20);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("No. of Semester");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(36, 278, 146, 20);
		contentPanel.add(lblNewLabel_4);
		
		co = new JTextField();
		co.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		co.setBounds(192, 188, 200, 20);
		contentPanel.add(co);
		co.setColumns(10);
		
		cn = new JTextField();
		cn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cn.setBounds(192, 218, 200, 20);
		contentPanel.add(cn);
		cn.setColumns(10);
		
		sn = new JTextField();
		sn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		sn.setBounds(192, 248, 200, 20);
		contentPanel.add(sn);
		sn.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(AddCourse.class.getResource("/IMAGE/subject-icon-5 (2).png")));
		lblNewLabel_5.setBounds(167, 55, 100, 100);
		contentPanel.add(lblNewLabel_5);
		
		no = new JTextField();
		no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		no.setBounds(192, 278, 200, 20);
		contentPanel.add(no);
		no.setColumns(10);
	}
}
