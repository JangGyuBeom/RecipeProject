
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeÀ°·ù extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeÀ°·ù frame = new RecipeÀ°·ù();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public RecipeÀ°·ù() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 233);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uC18C\uACE0\uAE30 \uAD6D\uAC70\uB9AC\uC6A9");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uB2ED\uACE0\uAE30 \uAC00\uC2B4\uC0B4");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uAD6C\uC774\uC6A9");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uCC0C\uAC1C\uC6A9");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC18C\uACE0\uAE30 \uBD88\uACE0\uAE30\uC6A9");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB2ED\uACE0\uAE30 \uBCF6\uC74C\uC6A9");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uC0BC\uACB9\uC0B4");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uB2E4\uC9D0\uC721");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uD6C8\uC81C\uC624\uB9AC");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uB2E4\uC9D0\uC721");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uD6C8\uC81C\uC624\uB9AC");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uC7A5\uC870\uB9BC\uC6A9");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uB3C8\uAE4C\uC2A4");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_17 = new JCheckBox("\uD6C8\uC81C\uC624\uB9AC");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uB2ED\uB2E4\uB9AC");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_13 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30 \uC55E\uB2E4\uB9AC\uC0B4");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uB2ED\uACE0\uAE30 \uC0BC\uACC4\uD0D5\uC6A9");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uB2ED\uBC1C");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uC18C\uACE0\uAE30 \uB4F1\uC2EC");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_19 = new JCheckBox("\uC18C\uACE0\uAE30 \uC548\uC2EC");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uC18C\uACE0\uAE30 \uAC08\uBE44");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uC18C\uACE0\uAE30 \uC7A5\uC870\uB9BC\uC6A9");
		panel.add(checkBox_21);
		
		JLabel label = new JLabel("\uC721\uB958");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
		label.setBounds(12, 10, 410, 44);
		contentPane.add(label);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 307, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 307, 50, 41);
		contentPane.add(label_1);
	}

}
