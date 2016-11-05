import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class RecipeManager extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeManager frame = new RecipeManager();
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
	public RecipeManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 411);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(187, 133, 57, 15);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("문의 보기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(72, 23, 182, 55);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setText("         레시피");
		textField.setBounds(107, 102, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("          배달");
		textField_1.setBounds(351, 102, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("등록");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(110, 158, 113, 36);
		contentPane.add(button);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(110, 227, 113, 36);
		contentPane.add(btnNewButton_2);
		
		JButton button_1 = new JButton("삭제");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(110, 288, 113, 36);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("등록");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(354, 158, 113, 36);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("수정");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(354, 227, 113, 36);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("삭제");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(354, 288, 113, 36);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("공지 등록");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(322, 23, 182, 55);
		contentPane.add(button_5);
	}
}
