
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

public class Recipe���깰 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe���깰 frame = new Recipe���깰();
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
	public Recipe���깰() {
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
		panel.setBounds(12, 64, 410, 130);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uC624\uC9D5\uC5B4\uD3EC");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uBA78\uCE58");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC544\uADC0");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uD574\uC0BC");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC0C8\uC6B0");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uCF54\uB2E4\uB9AC");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uACE0\uB4F1\uC5B4");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uD669\uD0DC");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC18C\uB77C");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uC624\uC9D5\uC5B4");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uD64D\uD569");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uBB38\uC5B4");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uBC14\uC9C0\uB77D");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uB300\uD558");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uD68C");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uC870\uAC1C");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uAC8C");
		panel.add(checkBox_17);
		
		JLabel label = new JLabel("\uC218\uC0B0\uBB3C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 24));
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
