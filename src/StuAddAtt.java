import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class StuAddAtt extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField sid;
	private JTextField day1;
	private JTextField day2;
	private JTextField Y;
	private JComboBox<String> m;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StuAddAtt dialog = new StuAddAtt();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StuAddAtt() {
		setBounds(100, 100, 438, 379);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 427, 50);
		panel.setBackground(SystemColor.textHighlight);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attendance\r\n");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(120, 5, 186, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Id");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(47, 80, 120, 30);
		contentPanel.add(lblNewLabel_1);
		
		sid = new JTextField();
		sid.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		sid.setBounds(199, 80, 200, 30);
		contentPanel.add(sid);
		sid.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Working Day");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(47, 203, 120, 30);
		contentPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Present Day");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(47, 244, 120, 30);
		contentPanel.add(lblNewLabel_1_1_1);
		
		day1 = new JTextField();
		day1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		day1.setColumns(10);
		day1.setBounds(199, 203, 200, 30);
		contentPanel.add(day1);
		
		day2 = new JTextField();
		day2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		day2.setColumns(10);
		day2.setBounds(199, 244, 200, 30);
		contentPanel.add(day2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(day1.getText().isEmpty() || day2.getText().isEmpty() ||Y.getText().isEmpty()||sid.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Every feild must be Filed");
				} 
				else{
					String a = sid.getText();
					String b = Y.getText();
					String mo = (String) m.getSelectedItem();
					String d = day1.getText();
					String p = day2.getText();
					int b1 =Integer.parseInt(p);
					int b2 =Integer.parseInt(d);
					Float c = (float) ((b1*100)/b2);
					String a3 = Float.toString(c);
					
					try {
						Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
						System.out.println("Connected Successfully");
						
						PreparedStatement pst = connection.prepareStatement("insert into Attendance values(?,?,?,?,?,?,?)");
						
						pst.setString(1, a);
						pst.setString(2, b);
						pst.setString(3, mo);
						pst.setString(4, d);
						pst.setString(5, p);
						pst.setString(6, a3);
						pst.setString(7, a);
						
						
						pst.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Inserted Successfully");
						setVisible(false);
						
					}catch(Exception er) {
						JOptionPane.showMessageDialog(null, er);
					}
					
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(141, 300, 100, 30);
		contentPanel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(47, 121, 120, 30);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Month");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(47, 162, 120, 30);
		contentPanel.add(lblNewLabel_3);
		
		Y = new JTextField();
		Y.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Y.setBounds(199, 121, 200, 30);
		contentPanel.add(Y);
		Y.setColumns(10);
		
		m = new JComboBox<String>();
		m.setModel(new DefaultComboBoxModel<String>(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		m.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		m.setBounds(199, 162, 200, 30);
		contentPanel.add(m);
	}
}
