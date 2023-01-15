
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
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.border.TitledBorder;

public class CollegePage extends JFrame {

	private JPanel contentPane;
	private JLabel id1;
	private JLabel cnam;
	private JLabel ct;
	private JLabel ty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CollegePage frame = new CollegePage(null);
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
			
			PreparedStatement pst = connection.prepareStatement("select * from College Where College_Id="+s);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				id1.setText("     "+rs.getString("College_Id"));
				cnam.setText("     "+rs.getString("Collage_Name"));
				ct.setText("     "+rs.getString("City"));
				ty.setText("     "+rs.getString("Type"));
				
			}
			
				
			
		}catch(Exception er) {
			
		}
	}
	
	public CollegePage(String id) {
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
		
		JButton btnNewButton_5 = new JButton(" Add Attendance");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacAtteAdd att = new FacAtteAdd();
				att.setVisible(true);
			}
		});
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.setBounds(10, 136, 200, 50);
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
		btnNewButton_7.setBounds(10, 191, 200, 50);
		panel.add(btnNewButton_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 75, 220, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setFocusable(false);
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(220, 0, 1146, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CollegePage.class.getResource("/IMAGE/images__2_-removebg-preview (2).png")));
		lblNewLabel.setBounds(903, 50, 150, 150);
		panel_1.add(lblNewLabel);

		
		JLabel lblNewLabel_4 = new JLabel("   ID");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(365, 383, 300, 50);
		lblNewLabel_4.setBorder(new LineBorder(Color.BLACK));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("   Type");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_5.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_5.setBounds(365, 483, 300, 50);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_13 = new JLabel("   College Name");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_13.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_13.setBounds(365, 433, 300, 50);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("   City");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_14.setBorder(new LineBorder(Color.BLACK));
		lblNewLabel_14.setBounds(365, 533, 300, 50);
		contentPane.add(lblNewLabel_14);
		
		id1 = new JLabel("");
		id1.setBorder(new LineBorder(Color.BLACK));
		id1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		id1.setBounds(665, 383, 600, 50);
		contentPane.add(id1);
		
		cnam = new JLabel("");
		cnam.setBorder(new LineBorder(Color.BLACK));
		cnam.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		cnam.setBounds(665, 433, 600, 50);
		contentPane.add(cnam);
		
		ct = new JLabel("");
		ct.setBorder(new LineBorder(Color.BLACK));
		ct.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		ct.setBounds(665, 533, 600, 50);
		contentPane.add(ct);
		
		ty = new JLabel("");
		ty.setBorder(new LineBorder(Color.BLACK));
		ty.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		ty.setBounds(665, 483, 600, 50);
		contentPane.add(ty);
		
		Info(id);
		
	}
}
