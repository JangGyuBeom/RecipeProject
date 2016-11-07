import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

public class RecipeManager extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 964, 568);
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
			}
		});
		btnNewButton.setBounds(391, 32, 194, 73);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uACF5\uC9C0\uC0AC\uD56D : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 158, 107, 48);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uB808\uC2DC\uD53C : ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		label_1.setBounds(12, 305, 107, 48);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uBC30\uB2EC\uC74C\uC2DD : ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		label_2.setBounds(12, 397, 107, 48);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB4F1\uB85D", "\uC218\uC815", "\uC0AD\uC81C"}));
		comboBox.setBounds(115, 158, 100, 48);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uB4F1\uB85D", "\uC218\uC815", "\uC0AD\uC81C"}));
		comboBox_1.setBounds(115, 305, 100, 48);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uB4F1\uB85D", "\uC218\uC815", "\uC0AD\uC81C"}));
		comboBox_2.setBounds(115, 397, 100, 48);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("\uBB38\uC758 \uBCF4\uAE30");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(391, 32, 194, 73);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uACF5\uC9C0\uBC88\uD638");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(255, 133, 93, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("\uACF5\uC9C0\uB0B4\uC6A9\r\n");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(581, 133, 93, 26);
		contentPane.add(label_3);
		
		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setBounds(839, 165, 97, 35);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(249, 172, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(506, 169, 244, 37);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
