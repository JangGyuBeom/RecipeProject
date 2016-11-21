
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

public class Recipe가공_유제품 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe가공_유제품 frame = new Recipe가공_유제품();
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
	public Recipe가공_유제품() {
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
		panel.setBounds(12, 64, 410, 173);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uC2DD\uC6A9\uC720");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uCC38\uAE30\uB984");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uB2E4\uC2DC\uB9C8");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC62C\uB9AC\uBE0C\uC720");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uACE0\uCD94\uAE30\uB984");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uBCA0\uC774\uCEE8");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC18C\uC2DC\uC9C0");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB450\uBD80");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_12 = new JCheckBox("\uC5B4\uBB35");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_8 = new JCheckBox("\uCC38\uCE58\uCE94");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uD584");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uB5A1\uAD6D\uC6A9 \uB5A1");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uC6B0\uC720");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_13 = new JCheckBox("\uCE58\uC988");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uAC00\uC4F0\uC624\uBD80\uC2DC");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uACE4\uC57D");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_17 = new JCheckBox("\uC0DD\uD06C\uB9BC");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_16 = new JCheckBox("\uCE58\uD0A8\uC2A4\uD1A1");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_18 = new JCheckBox("\uD50C\uB808\uC778\uC694\uAD6C\uB974\uD2B8");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uC870\uB7AD\uC774\uB5A1");
		panel.add(checkBox_19);
		
		JLabel label = new JLabel("\uAC00\uACF5/\uC720\uC81C\uD488");
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
