import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.Icon;
import javax.swing.ScrollPaneConstants;

public class RecipeManager extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;

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
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 797);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(187, 133, 57, 15);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RecipeShowinquires frame = new RecipeShowinquires();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(32, 40, 158, 59);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uACF5\uC9C0\uC0AC\uD56D : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 158, 107, 48);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uB808\uC2DC\uD53C : ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		label_1.setBounds(12, 342, 107, 48);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uBC30\uB2EC\uC74C\uC2DD : ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		label_2.setBounds(12, 609, 107, 48);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB4F1\uB85D", "\uC218\uC815", "\uC0AD\uC81C"}));
		comboBox.setBounds(115, 158, 100, 48);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uB4F1\uB85D", "\uC218\uC815", "\uC0AD\uC81C"}));
		comboBox_1.setBounds(115, 342, 100, 48);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uB4F1\uB85D", "\uC218\uC815", "\uC0AD\uC81C"}));
		comboBox_2.setBounds(115, 609, 100, 48);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("\uBB38\uC758 \uBCF4\uAE30");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(32, 40, 158, 59);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uACF5\uC9C0\uBC88\uD638");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(311, 122, 93, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("\uACF5\uC9C0\uB0B4\uC6A9\r\n");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(597, 122, 93, 26);
		contentPane.add(label_3);
		
		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setBounds(953, 195, 97, 35);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(301, 158, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(511, 158, 274, 123);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 708, 50, 41);
		contentPane.add(button);
		
		JLabel label_4 = new JLabel(image.Back);
		label_4.setBounds(12, 708, 50, 41);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uAC00\uAC8C\uC774\uB984");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(266, 578, 93, 26);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(390, 578, 93, 26);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\uAC00\uACA9");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(523, 578, 93, 26);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(648, 578, 93, 26);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(789, 578, 93, 26);
		contentPane.add(label_9);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(257, 623, 116, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(382, 623, 116, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(513, 623, 116, 21);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(641, 623, 116, 21);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(780, 623, 116, 21);
		contentPane.add(textField_5);
		
		JButton button_1 = new JButton("\uD655\uC778");
		button_1.setBounds(953, 616, 97, 35);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\uD655\uC778");
		button_2.setBounds(953, 451, 97, 35);
		contentPane.add(button_2);
		
		JLabel label_10 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(275, 324, 93, 26);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\uAC00\uACA9");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(399, 324, 93, 26);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\uC694\uB9AC\uC21C\uC11C");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(597, 324, 93, 26);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\uC608\uC0C1\uC2DC\uAC04");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(787, 324, 93, 26);
		contentPane.add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(266, 369, 116, 21);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(391, 369, 116, 21);
		contentPane.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(780, 369, 116, 21);
		contentPane.add(textField_9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(533, 369, 219, 192);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
	}
}
