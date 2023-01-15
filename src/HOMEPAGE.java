import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HOMEPAGE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOMEPAGE frame = new HOMEPAGE();
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
	public HOMEPAGE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 1366, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 200, 200);
		lblNewLabel.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/images__16_-removebg-preview.png")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOGWARDS UNIVERCITY,HOGWARD");
		lblNewLabel_1.setBounds(250, 40, 983, 120);
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sports World", Font.PLAIN, 50));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN l = new LOGIN();
				l.setVisible(true);
				setVisible(false);
			} 
		});
		btnNewButton.setBounds(1225, 135, 100, 50);
		btnNewButton.setFont(new Font("Sports World", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(250, 140, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(25, 25, 112));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/dom.jpg")));
		lblNewLabel_2.setBounds(50, 250, 200, 200);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Severus Snape");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/alanrickman-servussnape.jpg")));
		lblNewLabel_3.setBounds(1116, 250, 200, 200);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Severus Snape");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(1116, 471, 200, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vice-Chancellor");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(1116, 505, 200, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Albus Dumbledore");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6.setBounds(45, 471, 211, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Chancellor");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(50, 505, 200, 30);
		contentPane.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(310, 250, 750, 403);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		tabbedPane.setBounds(0, 0, 750, 403);
		panel_1.add(tabbedPane);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tabbedPane.addTab("University Image", null, lblNewLabel_8, null);
		lblNewLabel_8.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/Hogwarts_-_Wizarding_World_of_Ha.jpg")));
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/Campus.jpg")));
		tabbedPane.addTab("University Campus", null, lblNewLabel_14, null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/library.jpg")));
		tabbedPane.addTab("University Library", null, lblNewLabel_9, null);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/class.jpg")));
		tabbedPane.addTab("Hall", null, lblNewLabel_10, null);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		tabbedPane.addTab("Sports Event", null, lblNewLabel_11, null);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/Trophies.jpg")));
		tabbedPane.addTab("Achivements", null, lblNewLabel_12, null);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon(HOMEPAGE.class.getResource("/IMAGE/Sing.jpg")));
		tabbedPane.addTab("Singing Event", null, lblNewLabel_13, null);
		JMenu Info = new JMenu("INFO");
	}
}
