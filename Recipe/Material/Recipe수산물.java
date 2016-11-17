
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

public class Recipe수산물 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe수산물 frame = new Recipe수산물();
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
	public Recipe수산물() {
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
		panel.setBounds(12, 64, 410, 188);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uACE0\uB4F1\uC5B4");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uC624\uC9D5\uC5B4");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC870\uAE30");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uAC08\uCE58");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uBD81\uC5B4\uD3EC");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uC7A5\uC5B4");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB0A0\uCE58\uC54C");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uAD74\uBE44");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_9 = new JCheckBox("\uCC38\uCE58");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uAD11\uC5B4");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uBA85\uD0DC");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uD64D\uC5B4");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uBA54\uAE30");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uBBF8\uAFB8\uB77C\uC9C0");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uC0C8\uC6B0");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uAF43\uAC8C");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uC804\uBCF5");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uAD74");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uD64D\uD569");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uB300\uAC8C");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uACE8\uBC45\uC774");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uAE40");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uAC74\uB2E4\uC2DC\uB9C8");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uBD81\uC5B4\uCC44");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("\uD669\uD0DC\uCC44");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_8 = new JCheckBox("\uBD81\uC5B4\uD3EC");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_26 = new JCheckBox("\uC624\uC9D5\uC5B4\uCC44");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uBB38\uC5B4");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uB300\uAD6C");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uAF34\uB69C\uAE30");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_32 = new JCheckBox("\uD574\uC0BC");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_30 = new JCheckBox("\uC1A1\uC5B4");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uBCF5\uC5B4");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_33 = new JCheckBox("\uB9DD\uB465\uC5B4");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uC624\uC9D5\uC5B4");
		panel.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("\uAF41\uCE58");
		panel.add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("\uB3D9\uD0DC");
		panel.add(checkBox_36);
		
		JLabel label = new JLabel("\uC218\uC0B0\uBB3C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
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
