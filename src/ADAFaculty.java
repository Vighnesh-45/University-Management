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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ADAFaculty extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fn;
	private JTextField ln;
	private JTextField fatn;
	private JTextField mo;
	private JTextField ex;
	private JTextField su;
	private JTextField aad;
	private JTextField mn;
	private JTextField sta;
	private JTextField ct;
	private JTextField qua;
	private JTextField gen;
	private JComboBox<String> clg;
	private JLabel lblNewLabel_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ADAFaculty dialog = new ADAFaculty();
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
	
	public ADAFaculty() {
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setBounds(300, 50, 500, 700);
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

		JLabel lblNewLabel = new JLabel("Add Faculty");
		lblNewLabel.setBounds(142, 5, 200, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(50, 211, 120, 20);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(50, 241, 120, 20);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Father Name");
		lblNewLabel_3.setBounds(50, 271, 120, 20);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Mobile No");
		lblNewLabel_4.setBounds(50, 331, 120, 20);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPanel.add(lblNewLabel_4);

		fn = new JTextField();
		fn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		fn.setBounds(220, 211, 200, 20);
		contentPanel.add(fn);
		fn.setColumns(10);

		ln = new JTextField();
		ln.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ln.setBounds(220, 241, 200, 20);
		contentPanel.add(ln);
		ln.setColumns(10);

		fatn = new JTextField();
		fatn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		fatn.setBounds(220, 271, 200, 20);
		contentPanel.add(fatn);
		fatn.setColumns(10);

		mo = new JTextField();
		mo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String  mon = mo.getText();
				int length = mon.length();
				char c = e.getKeyChar();
				
				if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					if(length<10) {
						mo.setEditable(true);
					}
					else {
						mo.setEditable(false);
					}
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE ) {
						mo.setEditable(true);
					}
					else {
						mo.setEditable(false);
					}
				}
			}
		});
		mo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mo.setBounds(220, 331, 200, 20);
		contentPanel.add(mo);
		mo.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Qualification");
		lblNewLabel_6.setBounds(50, 361, 150, 20);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		contentPanel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Experiance");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(50, 391, 120, 20);
		contentPanel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Subject");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(50, 421, 120, 20);
		contentPanel.add(lblNewLabel_8);

		ex = new JTextField();
		ex.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ex.setBounds(220, 391, 200, 20);
		contentPanel.add(ex);
		ex.setColumns(10);

		su = new JTextField();
		su.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		su.setBounds(220, 421, 200, 20);
		contentPanel.add(su);
		su.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Gender");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(50, 452, 120, 20);
		contentPanel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Aadhar No.");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(50, 482, 120, 20);
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
		aad.setBounds(220, 482, 200, 20);
		contentPanel.add(aad);
		aad.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Motther Name");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(50, 301, 120, 20);
		contentPanel.add(lblNewLabel_12);

		mn = new JTextField();
		mn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mn.setBounds(220, 301, 200, 20);
		contentPanel.add(mn);
		mn.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("State ");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(50, 512, 120, 20);
		contentPanel.add(lblNewLabel_13);

		JLabel lblNewLabel_15 = new JLabel("City");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_15.setBounds(50, 542, 120, 20);
		contentPanel.add(lblNewLabel_15);

		sta = new JTextField();
		sta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		sta.setBounds(220, 512, 200, 20);
		contentPanel.add(sta);
		sta.setColumns(10);

		ct = new JTextField();
		ct.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ct.setBounds(220, 542, 200, 20);
		contentPanel.add(ct);
		ct.setColumns(10);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fn.getText().isEmpty()||ln.getText().isEmpty()||fatn.getText().isEmpty()||mn.getText().isEmpty()||
						mo.getText().isEmpty()||qua.getText().isEmpty()||ex.getText().isEmpty()||su.getText().isEmpty()||
						gen.getText().isEmpty()||aad.getText().isEmpty()||sta.getText().isEmpty()||ct.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Every Feild Must Be Filled");
				}
				else{
				String a = lblNewLabel_14.getText();
				String b = (String) clg.getSelectedItem();
				String c = fn.getText();
				String d = ln.getText();
				String f = fatn.getText();
				String g = mn.getText();
				String h = mo.getText();
				String i = qua.getText();
				String j = ex.getText();
				String k = su.getText();
				String l = gen.getText();
				String m = aad.getText();
				String n = sta.getText();
				String o = ct.getText();
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
					System.out.println("Connected Successfully");
					
					PreparedStatement pst = connection.prepareStatement("insert into Faculty values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
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
					pst.setString(14, o);
					
					
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
		btnNewButton.setBounds(87, 597, 89, 23);
		contentPanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(287, 597, 89, 23);
		contentPanel.add(btnNewButton_1);

		qua = new JTextField();
		qua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		qua.setBounds(220, 361, 200, 20);
		contentPanel.add(qua);
		qua.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(ADAFaculty.class.getResource("/IMAGE/images__14_-removebg-preview.png")));
		lblNewLabel_5.setBounds(192, 55, 100, 100);
		contentPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_9 = new JLabel("College");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(50, 181, 120, 20);
		contentPanel.add(lblNewLabel_9);
		
		clg = new JComboBox<String>();
		clg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		clg.setBounds(220, 181, 200, 20);
		contentPanel.add(clg);
		
		gen = new JTextField();
		gen.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gen.setBounds(220, 452, 200, 20);
		contentPanel.add(gen);
		gen.setColumns(10);
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setText("360"+first);
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_14.setBounds(10, 61, 100, 20);
		contentPanel.add(lblNewLabel_14);
		
		fillCombobox();
	}
}
