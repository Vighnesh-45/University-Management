import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminEditclg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField cc;
	private JTextField cn;
	private JTextField ct;
	private JTextField ty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			AdminEditclg dialog = new AdminEditclg(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void output(String s) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
			PreparedStatement pst = connection.prepareStatement("select * from College where College_Id="+s);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				cc.setText(rs.getString("College_id"));
				cn.setText(rs.getString("Collage_Name"));
				ct.setText(rs.getString("City"));
				ty.setText(rs.getString("Type"));
			}

			
			
		} catch (Exception E) {
			System.out.println(E);
		}
	}
	
	
	public AdminEditclg(String string) {
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
		
		JLabel lblNewLabel = new JLabel("Edit");
		lblNewLabel.setBounds(117, 5, 200, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cc.getText().isEmpty()||cn.getText().isEmpty()||ct.getText().isEmpty()||ty.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Every Feild Must Be Filled");
				}
				else {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
					System.out.println("Connected Successfully");
					PreparedStatement pst = connection.prepareStatement("update College set  Collage_Name= '"+cn.getText()+"',City= '"+ct.getText()+"',Type= '"+ty.getText()+"' where College_ID='"+cc.getText()+"'" );
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
		btnNewButton.setBounds(73, 338, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(273, 338, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("College Code");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(36, 188, 120, 20);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("College Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(36, 218, 120, 20);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("City");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(36, 248, 120, 20);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Type");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(36, 278, 120, 20);
		contentPanel.add(lblNewLabel_4);
		
		cc = new JTextField();
		cc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cc.setBounds(192, 188, 200, 20);
		contentPanel.add(cc);
		cc.setColumns(10);
		
		cn = new JTextField();
		cn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cn.setBounds(192, 218, 200, 20);
		contentPanel.add(cn);
		cn.setColumns(10);
		
		ct = new JTextField();
		ct.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ct.setBounds(192, 248, 200, 20);
		contentPanel.add(ct);
		ct.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(AdminEditclg.class.getResource("/IMAGE/images__2_-removebg-preview.png")));
		lblNewLabel_5.setBounds(167, 50, 100, 100);
		contentPanel.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
					System.out.println("Connected Successfully");
					PreparedStatement pst = connection.prepareStatement("delete from College where College_ID='"+cc.getText()+"'" );
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
					setVisible(false);

					
				} catch (Exception E) {
					System.out.println(E);
				}
			
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(174, 338, 89, 23);
		contentPanel.add(btnNewButton_2);
		
		ty = new JTextField();
		ty.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ty.setBounds(192, 278, 200, 20);
		contentPanel.add(ty);
		ty.setColumns(10);
		
		output(string);
	}
}
