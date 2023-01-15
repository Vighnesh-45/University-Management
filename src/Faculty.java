import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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

public class Faculty extends JFrame {

	private JPanel contentPane;
	private JLabel id1;
	private JLabel cnam;
	private JLabel nam;
	private JLabel lnam;
	private JLabel fana;
	private JLabel mona;
	private JLabel mon; 
	private JLabel qu;
	private JLabel ex;
	private JLabel su;
	private JLabel gen;
	private JLabel aad;
	private JLabel sta;
	private JLabel ct;
	
	String f_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Info(String s){
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
			
			PreparedStatement pst = connection.prepareStatement("select * from Faculty Where Faculty_Id="+s);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				id1.setText("     "+rs.getString("Faculty_id"));
				cnam.setText("     "+rs.getString("College_Name"));
				nam.setText("     "+rs.getString("First_Name"));
				lnam.setText("     "+rs.getString("Last_Name"));
				fana.setText("     "+rs.getString("Father_Name"));
				mona.setText("     "+rs.getString("Mother_Name"));
				gen.setText("     "+rs.getString("Gender"));
				qu.setText("     "+rs.getString("Qualification"));
				aad.setText("     "+rs.getString("AadharNO"));
				sta.setText("     "+rs.getString("Stae"));
				ct.setText("     "+rs.getString("City"));
				ex.setText("     "+rs.getString("Experiance"));
				su.setText("     "+rs.getString("Subject"));
				mon.setText("     "+rs.getString("MobileNo"));
				
				f_id = rs.getString("Faculty_Id");
				
				
			}
			
			
			
		}catch(Exception er) {
			JOptionPane.showMessageDialog(null, er);
		}
	}
	
	
	public Faculty(String id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 220, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 20, 200, 30);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(10, 81, 200, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Attendance");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Facatt at = new Facatt(f_id);
				at.setVisible(true);
			}
		});
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(10, 136, 200, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton(" Add Attendance");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuAddAtt att = new StuAddAtt();
				att.setVisible(true);
			}
		});
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setBounds(10, 193, 200, 50);
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
		btnNewButton_7.setBounds(10, 249, 200, 50);
		panel.add(btnNewButton_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 75, 220, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFocusable(false);
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(220, 0, 1146, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Faculty.class.getResource("/IMAGE/images__14_-removebg-preview (1).png")));
		lblNewLabel.setBounds(903, 50, 150, 150);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Profile ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_2.setBounds(100, 102, 175, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(778, 30, 302, 45);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("   ID");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(287, 264, 200, 30);
		lblNewLabel_4.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("   Last Name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_5.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_5.setBounds(287, 354, 200, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("   Father Name");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_6.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_6.setBounds(287, 384, 200, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("   Qualification");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_7.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_7.setBounds(287, 474, 200, 30);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("   Mother Name");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_8.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_8.setBounds(287, 414, 200, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("   Experiance");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_9.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_9.setBounds(287, 504, 200, 30);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("   Mobile No.");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_10.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_10.setBounds(287, 444, 200, 30);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("   Subject");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_11.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_11.setBounds(287, 534, 200, 30);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("   Gender");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_12.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_12.setBounds(287, 564, 200, 30);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("   College Name");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_13.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_13.setBounds(287, 294, 200, 30);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("   Name");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_14.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_14.setBounds(287, 324, 200, 30);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("   Aadhaar No.");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_15.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_15.setBounds(287, 594, 200, 30);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("   State");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_16.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_16.setBounds(287, 624, 200, 30);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("   City");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_17.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_17.setBounds(287, 654, 200, 30);
		contentPane.add(lblNewLabel_17);
		
		id1 = new JLabel("");
		id1.setBorder(new LineBorder(Color.BLACK));
		id1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		id1.setBounds(487, 264, 800, 30);
		contentPane.add(id1);
		
		cnam = new JLabel("");
		cnam.setBorder(new LineBorder(Color.BLACK));
		cnam.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		cnam.setBounds(487, 294, 800, 30);
		contentPane.add(cnam);
		
		nam = new JLabel("");
		nam.setBorder(new LineBorder(Color.BLACK));
		nam.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		nam.setBounds(487, 324, 800, 30);
		contentPane.add(nam);
		
		lnam = new JLabel("");
		lnam.setBorder(new LineBorder(Color.BLACK));
		lnam.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lnam.setBounds(487, 354, 800, 30);
		contentPane.add(lnam);
		
		fana = new JLabel("");
		fana.setBorder(new LineBorder(Color.BLACK));
		fana.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		fana.setBounds(487, 384, 800, 30);
		contentPane.add(fana);
		
		mona = new JLabel("");
		mona.setBorder(new LineBorder(Color.BLACK));
		mona.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		mona.setBounds(487, 414, 800, 30);
		contentPane.add(mona);
		
		mon = new JLabel("");
		mon.setBorder(new LineBorder(Color.BLACK));
		mon.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		mon.setBounds(487, 444, 800, 30);
		contentPane.add(mon);
		
		qu = new JLabel("");
		qu.setBorder(new LineBorder(Color.BLACK));
		qu.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		qu.setBounds(487, 474, 800, 30);
		contentPane.add(qu);
		
		ex = new JLabel("");
		ex.setBorder(new LineBorder(Color.BLACK));
		ex.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		ex.setBounds(487, 504, 800, 30);
		contentPane.add(ex);
		
		su = new JLabel("");
		su.setBorder(new LineBorder(Color.BLACK));
		su.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		su.setBounds(487, 534, 800, 30);
		contentPane.add(su);
		
		gen = new JLabel("");
		gen.setBorder(new LineBorder(Color.BLACK));
		gen.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		gen.setBounds(487, 564, 800, 30);
		contentPane.add(gen);
		
		aad = new JLabel("");
		aad.setBorder(new LineBorder(Color.BLACK));
		aad.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		aad.setBounds(487, 594, 800, 30);
		contentPane.add(aad);
		
		sta = new JLabel("");
		sta.setBorder(new LineBorder(Color.BLACK));
		sta.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		sta.setBounds(487, 624, 800, 30);
		contentPane.add(sta);
		
		ct = new JLabel(" ");
		ct.setBorder(new LineBorder(Color.BLACK));
		ct.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		ct.setBounds(487, 654, 800, 30);
		contentPane.add(ct);
		
		Info(id);
		
	}
}
