import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADEdit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADEdit frame = new ADEdit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ADEdit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 1366, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(533, 25, 300, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADMINPAGE a = new ADMINPAGE();
				a.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_4.setBackground(SystemColor.textHighlight);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setBounds(1208, 33, 100, 50);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLclg clg = new AdminLclg();
				clg.setVisible(true);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(ADEdit.class.getResource("/IMAGE/images__2_-removebg-preview (2).png")));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(150, 290, 150, 150);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLStu stu = new AdminLStu();
				stu.setVisible(true);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(ADEdit.class.getResource("/IMAGE/images__15_-removebg-preview (2).png")));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(750, 290, 150, 150);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLFac fac = new AdminLFac();
				fac.setVisible(true);
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(ADEdit.class.getResource("/IMAGE/images__14_-removebg-preview (1).png")));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(450, 290, 150, 150);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLCource cou = new AdminLCource();
				cou.setVisible(true);
				
			}
		});
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon(ADEdit.class.getResource("/IMAGE/subject-icon-5.png")));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBounds(1050, 290, 150, 150);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("College");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(150, 450, 150, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Faculty");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(450, 450, 150, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(750, 450, 150, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Course");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(1050, 450, 150, 30);
		contentPane.add(lblNewLabel_4);
	}
}
