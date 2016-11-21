
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
		setBounds(100, 100, 450, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 195);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uC18C\uAE08");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uD6C4\uCDA7\uAC00\uB8E8");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC2DD\uCD08");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC124\uD0D5");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uAC04\uC7A5");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uBB3C\uC5FF");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC640\uC0AC\uBE44");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB41C\uC7A5");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uACE0\uCD94\uC7A5");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC0C8\uC6B0\uC813");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_12 = new JCheckBox("\uBA78\uCE58\uC561\uC813");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_10 = new JCheckBox("\uB808\uBAAC\uC999");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uCC38\uCE58\uC561\uC813");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_13 = new JCheckBox("\uCF00\uCCA9");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uBA38\uC2A4\uD130\uB4DC");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uAD74\uC18C\uC2A4");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uB370\uB9AC\uC57C\uD0A4\uC18C\uC2A4");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_18 = new JCheckBox("\uB9E4\uC2E4\uCCAD");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_17 = new JCheckBox("\uD53C\uC2DC\uC18C\uC2A4");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_19 = new JCheckBox("\uB545\uCF69\uC18C\uC2A4");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uAFC0");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uCD98\uC7A5");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_24 = new JCheckBox("\uD1A0\uB9C8\uD1A0\uD398\uC774\uC2A4\uD2B8");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_23 = new JCheckBox("\uC6B0\uC2A4\uD130\uC18C\uC2A4");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_22 = new JCheckBox("\uCE60\uB9AC\uC18C\uC2A4");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_25 = new JCheckBox("\uB9C8\uC694\uB124\uC988");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_27 = new JCheckBox("\uB450\uBC18\uC7A5");
		panel.add(checkBox_27);
		
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
		button.setBounds(12, 290, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 290, 50, 41);
		contentPane.add(label_1);
	}

}
