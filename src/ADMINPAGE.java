import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class ADMINPAGE extends JFrame {

	private JPanel contentPane;
	private JLabel clgco;
	private JLabel faco;
	private JLabel sto;
	private JLabel lblNewLabel_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADMINPAGE frame = new ADMINPAGE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void count() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
			String q = "select count(College_Id) from College";
			PreparedStatement pst = connection.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				clgco.setText(rs.getString("count(College_Id)"));
			}
			
			String q1 = "select count(Faculty_Id) from Faculty";
			PreparedStatement pst1 = connection.prepareStatement(q1);
			ResultSet rs1 = pst1.executeQuery();
			if(rs1.next()) {
				faco.setText(rs1.getString("count(Faculty_Id)"));
			}
			
			String q2 = "select count(Student_Id) from Student";
			PreparedStatement pst2 = connection.prepareStatement(q2);
			ResultSet rs2 = pst2.executeQuery();
			if(rs2.next()) {
				sto.setText(rs2.getString("count(Student_Id)"));
			}
			
			String q3 = "select count(Code) from Course";
			PreparedStatement pst3 = connection.prepareStatement(q3);
			ResultSet rs3 = pst3.executeQuery();
			if(rs3.next()) {
				lblNewLabel_13.setText(rs3.getString("count(Code)"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	public ADMINPAGE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(ADMINPAGE.class.getResource("/IMAGE/images__15_-removebg-preview (2).png")));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(800, 280, 150, 150);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(ADMINPAGE.class.getResource("/IMAGE/subject-icon-5.png")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(1050, 280, 150, 150);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ADMINPAGE.class.getResource("/IMAGE/images__14_-removebg-preview (1).png")));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(550, 280, 150, 150);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(ADMINPAGE.class.getResource("/IMAGE/images__2_-removebg-preview (2).png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(300, 280, 150, 150);
		contentPane.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 220, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ADMINPAGE.class.getResource("/IMAGE/customer-login-icon-17.png")));
		lblNewLabel.setBounds(10, 10, 50, 50);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Admin");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(70, 20, 100, 30);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ADMINPAGE a = new ADMINPAGE();
				a.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(10, 81, 200, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADEdit ed = new ADEdit();
				ed.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(10, 136, 200, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add College");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCollege c = new AddCollege();
				c.setVisible(true);
			}
		});
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(10, 193, 200, 50);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add Faculty");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADAFaculty f = new ADAFaculty();
				f.setVisible(true);
			}
		});
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(10, 249, 200, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Student");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADAddstu s = new ADAddstu();
				s.setVisible(true);
			}
		});
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setBounds(10, 305, 200, 50);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Add Course");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AddCourse co = new  AddCourse();
				 co.setVisible(true);
			}
		});
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setBounds(10, 361, 200, 50);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("Logout");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to log out","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					LOGIN l = new LOGIN();
					l.setVisible(true);
					setVisible(false);
				}
				
				
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.setBounds(10, 417, 200, 50);
		panel.add(btnNewButton_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 75, 220, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFocusable(false);
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(220, 0, 1146, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Home");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_2.setBounds(100, 100, 120, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome Admin");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(778, 30, 302, 45);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(ADMINPAGE.class.getResource("/IMAGE/customer-login-icon-17 (2).png")));
		lblNewLabel_4.setBounds(854, 103, 150, 150);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_9 = new JLabel("College");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(300, 450, 150, 30);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Faculty");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(550, 450, 150, 30);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Student");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(800, 450, 150, 30);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Course");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(1050, 450, 150, 30);
		contentPane.add(lblNewLabel_12);
		
		clgco = new JLabel("");
		clgco.setHorizontalAlignment(SwingConstants.CENTER);
		clgco.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		clgco.setBounds(350, 490, 50, 30);
		contentPane.add(clgco);
		
		faco = new JLabel("");
		faco.setHorizontalAlignment(SwingConstants.CENTER);
		faco.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		faco.setBounds(600, 490, 50, 30);
		contentPane.add(faco);
		
		sto = new JLabel("");
		sto.setHorizontalAlignment(SwingConstants.CENTER);
		sto.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		sto.setBounds(850, 490, 50, 30);
		contentPane.add(sto);
	
		
		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(1100, 491, 50, 30);
		contentPane.add(lblNewLabel_13);
		
		count();
		
	}
}
