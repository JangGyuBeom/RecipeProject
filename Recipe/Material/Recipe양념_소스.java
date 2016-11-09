
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

public class Recipe¾ç³ä_¼Ò½º extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe¾ç³ä_¼Ò½º frame = new Recipe¾ç³ä_¼Ò½º();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Recipe¾ç³ä_¼Ò½º() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 178);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_7);
		
		JLabel label = new JLabel("\uC591\uB150/\uC18C\uC2A4");
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
		button.setBounds(12, 265, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 265, 50, 41);
		contentPane.add(label_1);
	}

}
