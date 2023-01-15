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
import java.util.Random;
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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ADAddstu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fn;
	private JTextField ln;
	private JTextField fatn;
	private JTextField mno;
	private JTextField mar;
	private JTextField out;
	private JTextField dob;
	private JTextField aad;
	private JTextField mn;
	private JTextField sta;
	private JTextField ct;
	private JComboBox<String> clg;
	private JComboBox<String> qua;
	private JComboBox<String> cou;
	private JLabel lblNewLabel_18;
	private JTextField textField;
	private JTextField ge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ADAddstu dialog = new ADAddstu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Random ran = new Random();
	long f = (ran.nextLong() % 9000L) + 1000L;
	long first = Math.abs(f);
	
	
	public void fillCombobox() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
			String q = "select * from College";
			PreparedStatement pst = connection.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				clg.addItem(rs.getString("Collage_Name"));
			}
		}catch(Exception er) {
			System.out.println(er);
		}
	}
	
	public void fillCombobox1() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
			String q = "select * from Course";
			PreparedStatement pst = connection.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				cou.addItem(rs.getString("Course_Name"));
			}
		}catch(Exception er) {
			System.out.println(er);
		}
	}
	
	public ADAddstu() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setBounds(300, 10, 500, 750);
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
		
		JLabel lblNewLabel = new JLabel("Add Student");
		lblNewLabel.setBounds(142, 5, 200, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(49, 266, 120, 20);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(49, 296, 120, 20);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father Name");
		lblNewLabel_3.setBounds(49, 326, 120, 20);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No");
		lblNewLabel_4.setBounds(49, 386, 120, 20);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_4);
		
		cou = new JComboBox<String>();
		cou.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cou.setBounds(219, 206, 200, 20);
		contentPanel.add(cou);
		
		JLabel lblNewLabel_5 = new JLabel("Select Course");
		lblNewLabel_5.setBounds(49, 206, 120, 20);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_5);
		
		fn = new JTextField();
		fn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		fn.setBounds(219, 266, 200, 20);
		contentPanel.add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ln.setBounds(219, 296, 200, 20);
		contentPanel.add(ln);
		ln.setColumns(10);
		
		fatn = new JTextField();
		fatn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		fatn.setBounds(219, 326, 200, 20);
		contentPanel.add(fatn);
		fatn.setColumns(10);
		
		mno = new JTextField();
		mno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			String  mon = mno.getText();
			int length = mon.length();
			char c = e.getKeyChar();
			
			if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
				if(length<10) {
					mno.setEditable(true);
				}
				else {
					mno.setEditable(false);
				}
			}
			else {
				if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE ) {
					mno.setEditable(true);
				}
				else {
					mno.setEditable(false);
				}
			}
			}
		});
		mno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mno.setBounds(219, 386, 200, 20);
		contentPanel.add(mno);
		mno.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Last Qualification");
		lblNewLabel_6.setBounds(49, 416, 150, 20);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		contentPanel.add(lblNewLabel_6);
		
		qua = new JComboBox<String>();
		qua.setModel(new DefaultComboBoxModel<String>(new String[] {"SSC", "HSC", "DIPLOMA"}));
		qua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		qua.setBounds(219, 416, 200, 20);
		contentPanel.add(qua);
		
		JLabel lblNewLabel_7 = new JLabel("Marks Obtain");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(49, 446, 120, 20);
		contentPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Out off");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(49, 476, 120, 20);
		contentPanel.add(lblNewLabel_8);
		
		mar = new JTextField();
		mar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mar.setBounds(219, 446, 200, 20);
		contentPanel.add(mar);
		mar.setColumns(10);
		
		out = new JTextField();
		out.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		out.setBounds(219, 476, 200, 20);
		contentPanel.add(out);
		out.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Date of Birth");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(49, 506, 160, 20);
		contentPanel.add(lblNewLabel_9);
		
		dob = new JTextField();
		dob.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		dob.setBounds(219, 506, 200, 20);
		contentPanel.add(dob);
		dob.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gender");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(49, 536, 120, 20);
		contentPanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Aadhar No.");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(49, 566, 120, 20);
		contentPanel.add(lblNewLabel_11);
		
		aad = new JTextField();
		aad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String  mon = aad.getText();
				int length = mon.length();
				char c = e.getKeyChar();
				
				if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					if(length<12) {
						aad.setEditable(true);
					}
					else {
						aad.setEditable(false);
					}
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE ) {
						aad.setEditable(true);
					}
					else {
						aad.setEditable(false);
					}
				}
			}
		});
		aad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		aad.setBounds(219, 566, 200, 20);
		contentPanel.add(aad);
		aad.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Motther Name");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(49, 356, 120, 20);
		contentPanel.add(lblNewLabel_12);
		
		mn = new JTextField();
		mn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mn.setBounds(219, 356, 200, 20);
		contentPanel.add(mn);
		mn.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Semester");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(49, 236, 120, 20);
		contentPanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13 = new JLabel("State ");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(49, 596, 120, 20);
		contentPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("City");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_15.setBounds(49, 626, 120, 20);
		contentPanel.add(lblNewLabel_15);
		
		sta = new JTextField();
		sta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		sta.setBounds(219, 596, 200, 20);
		contentPanel.add(sta);
		sta.setColumns(10);
		
		ct = new JTextField();
		ct.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ct.setBounds(219, 626, 200, 20);
		contentPanel.add(ct);
		ct.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(textField.getText().isEmpty()||fn.getText().isEmpty()||ln.getText().isEmpty()||
					fatn.getText().isEmpty()||mn.getText().isEmpty()||mno.getText().isEmpty()||
					mar.getText().isEmpty()||out.getText().isEmpty()||dob.getText().isEmpty()||
					aad.getText().isEmpty()||sta.getText().isEmpty()||ct.getText().isEmpty()||ge.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Every Feild Must Be Filled");
			}else {
				String a = lblNewLabel_18.getText();
				String b = (String) clg.getSelectedItem();
				String c = (String) cou.getSelectedItem();
				String d = textField.getText();
				String f = fn.getText();
				String g = ln.getText();
				String h = fatn.getText();
				String i = mn.getText();
				String j = mno.getText();
				String k = (String) qua.getSelectedItem();
				String l = mar.getText();
				String m = out.getText();
				String n = dob.getText();
				String o = aad.getText();
				String p = sta.getText();
				String q = ct.getText();
				String gen = ge.getText();
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
					System.out.println("Connected Successfully");
					
					PreparedStatement pst = connection.prepareStatement("insert into Student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					pst.setString(1, a);
					pst.setString(2, b);
					pst.setString(3, c);
					pst.setString(4, d);
					pst.setString(5, f);
					pst.setString(6, g);
					pst.setString(7, h);
					pst.setString(8, i);
					pst.setString(9, j);
					pst.setString(10,k);
					pst.setString(11, l);
					pst.setString(12, m);
					pst.setString(13, n);
					pst.setString(14, gen);
					pst.setString(15, o);
					pst.setString(16, p);
					pst.setString(17, q);
					
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
		btnNewButton.setBounds(104, 667, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(304, 667, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon(ADAddstu.class.getResource("/IMAGE/images__15_-removebg-preview.png")));
		lblNewLabel_16.setBounds(192, 55, 100, 100);
		contentPanel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Select College");
		lblNewLabel_17.setForeground(Color.WHITE);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_17.setBounds(49, 179, 120, 20);
		contentPanel.add(lblNewLabel_17);
		
		clg = new JComboBox<String>();
		clg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		clg.setBounds(219, 179, 200, 20);
		contentPanel.add(clg);
		
		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setText("120"+first);
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setBounds(10, 56, 100, 20);
		contentPanel.add(lblNewLabel_18);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(219, 236, 200, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		ge = new JTextField();
		ge.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ge.setBounds(219, 536, 200, 20);
		contentPanel.add(ge);
		ge.setColumns(10);
		
		fillCombobox();
		fillCombobox1();
	}
}
