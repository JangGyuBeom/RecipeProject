
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
		
		JCheckBox checkBox = new JCheckBox("\uACE0\uCD94\uC7A5");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uAC04\uC7A5");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uB41C\uC7A5");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC308\uC7A5");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uCD08\uACE0\uCD94\uC7A5");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uCCAD\uAD6D\uC7A5");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB0AB\uB610");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uCC38\uAE30\uB984");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uC2DD\uC6A9\uC720");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC62C\uB9AC\uBE0C\uC720");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_12 = new JCheckBox("\uB4E4\uAE30\uB984");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_10 = new JCheckBox("\uCE74\uB180\uB77C\uC720");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uD3EC\uB3C4\uC528\uC720");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_13 = new JCheckBox("\uACE0\uCD94\uAE30\uB984");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uD6C4\uCDA7\uAC00\uB8E8");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uC62C\uB9AC\uACE0\uB2F9");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uACE0\uCDA7\uAC00\uB8E8");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_18 = new JCheckBox("\uC2DD\uCD08");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_17 = new JCheckBox("\uBB3C\uC5FF");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_19 = new JCheckBox("\uAE68\uC18C\uAE08");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uC0C8\uC6B0\uC813");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uCCAD\uC8FC");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_24 = new JCheckBox("\uB77C\uBA74\uC2A4\uD504");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_23 = new JCheckBox("\uB808\uBAAC\uC999");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_22 = new JCheckBox("\uACC4\uD53C\uAC00\uB8E8");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_25 = new JCheckBox("\uCF00\uCC39");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_27 = new JCheckBox("\uB9C8\uC694\uB124\uC988");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_26 = new JCheckBox("\uAD74\uC18C\uC2A4");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_28 = new JCheckBox("\uBC84\uD130");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uCE60\uB9AC\uC18C\uC2A4");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uC124\uD0D5");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uAFC0");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("\uB538\uAE30\uC7BC");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("\uB4E4\uAE68\uAC00\uB8E8");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uBA78\uCE58\uC561\uC813");
		panel.add(checkBox_34);
		
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
