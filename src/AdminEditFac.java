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
import java.awt.event.ActionEvent;

public class AdminEditFac extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fn;
	private JTextField ln;
	private JTextField fatn;
	private JTextField mon;
	private JTextField ex;
	private JTextField su;
	private JTextField aad;
	private JTextField mn;
	private JTextField sta;
	private JTextField ct;
	private JTextField qua;
	private JTextField gen;
	private JComboBox<String> scl;
	private JLabel id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AdminEditFac dialog = new AdminEditFac(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillCombobox() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
					"H@rSHiTR24");
			System.out.println("Connected Successfully");
			String q = "select * from College";
			PreparedStatement pst = connection.prepareStatement(q);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				scl.addItem(rs.getString("Collage_Name"));
			}
		} catch (Exception er) {
			System.out.println(er);
		}
	}
	
	
	public void output(String s) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
			PreparedStatement pst = connection.prepareStatement("select * from Faculty where Faculty_ID="+s);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				fn.setText(rs.getString("First_Name"));
				ln.setText(rs.getString("Last_Name"));
				ct.setText(rs.getString("City"));
				fatn.setText(rs.getString("Father_Name"));
				mn.setText(rs.getString("Mother_Name"));
				mon.setText(rs.getString("MobileNo"));
				su.setText(rs.getString("Subject"));
				qua.setText(rs.getString("Qualification"));
				gen.setText(rs.getString("Gender"));
				aad.setText(rs.getString("AadharNO"));
				sta.setText(rs.getString("Stae"));
				ex.setText(rs.getString("Experiance"));
				id.setText(rs.getString("Faculty_Id"));
			}

			
			
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	public AdminEditFac(String string) {
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

		mon = new JTextField();
		mon.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mon.setBounds(220, 331, 200, 20);
		contentPanel.add(mon);
		mon.setColumns(10);

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

		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fn.getText().isEmpty()||ln.getText().isEmpty()||fatn.getText().isEmpty()||mn.getText().isEmpty()||
						mon.getText().isEmpty()||qua.getText().isEmpty()||ex.getText().isEmpty()||su.getText().isEmpty()||
						gen.getText().isEmpty()||aad.getText().isEmpty()||sta.getText().isEmpty()||ct.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Every Feild Must Be Filled");
				}
				else{
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root",
							"H@rSHiTR24");
					System.out.println("Connected Successfully");
					PreparedStatement pst = connection.prepareStatement("update Faculty set  City= '" + ct.getText()
							+ "',First_Name= '" + fn.getText() + "',Last_Name= '" + ln.getText() + "',Father_Name= '"
							+ fatn.getText() + "',Mother_Name= '" + mn.getText() + "',MobileNo= '" + mon.getText()
							+ "', Gender= '" + gen.getText() + "',AadharNO= '" + aad.getText() + "',Stae= '"
							+ sta.getText() + "',College_Name= '" + (String) scl.getSelectedItem() + "',Experiance= '"
							+ ex.getText() + "',Qualification= '" + qua.getText() + "', Subject= '" + su.getText() + "' where Faculty_id='"
							+ id.getText() + "'");
					pst.executeUpdate();

					JOptionPane.showMessageDialog(null, "Updated Successfully");
					setVisible(false);

				} catch (Exception E) {
					System.out.println(E);
				}
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(87, 597, 89, 23);
		contentPanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(287, 597, 89, 23);
		contentPanel.add(btnNewButton_1);

		qua = new JTextField();
		qua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		qua.setBounds(220, 361, 200, 20);
		contentPanel.add(qua);
		qua.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(AdminEditFac.class.getResource("/IMAGE/images__14_-removebg-preview.png")));
		lblNewLabel_5.setBounds(192, 55, 100, 100);
		contentPanel.add(lblNewLabel_5);

		JLabel lblNewLabel_9 = new JLabel("College");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(50, 181, 120, 20);
		contentPanel.add(lblNewLabel_9);

		scl = new JComboBox<String>();
		scl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		scl.setBounds(220, 181, 200, 20);
		contentPanel.add(scl);

		gen = new JTextField();
		gen.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gen.setBounds(220, 452, 200, 20);
		contentPanel.add(gen);
		gen.setColumns(10);

		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
					System.out.println("Connected Successfully");
					PreparedStatement pst = connection.prepareStatement("delete from Faculty where Faculty_Id='"+id.getText()+"'" );
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
					setVisible(false);

					
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(186, 597, 89, 23);
		contentPanel.add(btnNewButton_2);

		id = new JLabel("");
		id.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		id.setForeground(Color.WHITE);
		id.setBounds(10, 61, 100, 20);
		contentPanel.add(id);

		fillCombobox();
		output(string);
	}
}
