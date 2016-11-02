import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class RecipeSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeSwing frame = new RecipeSwing();
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
	public RecipeSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("조리할 음식");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(12, 21, 379, 156);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("배달 음식");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnNewButton_1.setBounds(424, 21, 381, 156);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(12, 234, 656, 61);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("\uBB38\uC758\uC0AC\uD56D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(textArea);
		lblNewLabel.setFont(new Font("궁서체", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 187, 140, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\uBCF4\uB0B4\uAE30");
		btnNewButton_2.setBounds(680, 234, 125, 61);
		contentPane.add(btnNewButton_2);
	}
}
