import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class EditMember extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EditMember dialog = new EditMember();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EditMember() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Faculty");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(44, 106, 150, 50);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Student");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(238, 106, 150, 50);
		contentPanel.add(btnNewButton_1);
	}
}
