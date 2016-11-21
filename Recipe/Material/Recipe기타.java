
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

public class Recipe기타 extends JFrame {

	private JPanel contentPane;

	public Recipe기타() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 282);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uACE0\uCDA7\uAC00\uB8E8");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uB9C8\uB298");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC0DD\uAC15");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uAC10\uCD08");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC8FD\uC21C");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uAE40\uCE58");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uACC4\uD53C");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uCCAD\uC8FC");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uB9E5\uC8FC");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uD587\uBC18");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uACC4\uB780");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uBC00\uAC00\uB8E8");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uBA54\uCD94\uB9AC\uC54C");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uC950\uD3EC");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uB2F9\uBA74");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uB9CC\uB450");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uB77C\uBA74");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uC2DD\uBE75");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uAE40");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uAC10\uC790\uC804\uBD84");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uB179\uB9D0\uAC00\uB8E8");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uB9C8\uCE74\uB85C\uB2C8");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uB9DB\uC220");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uD6C4\uB9AC\uAC00\uCF00");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uB2E8\uBB34\uC9C0");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("\uCE74\uB808\uAC00\uB8E8");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uCC39\uC300\uAC00\uB8E8");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uC300\uAD6D\uC218");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uC18C\uBA74");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uC0DD\uBA74");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uB808\uB4DC\uC640\uC778");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uACA8\uC790\uAC00\uB8E8");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("\uC591\uC7A5\uD53C");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("\uC815\uC885");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uBC84\uD130");
		panel.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("\uD30C\uC2AC\uB9AC\uAC00\uB8E8");
		panel.add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("\uBE75\uAC00\uB8E8");
		panel.add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("\uC2A4\uD30C\uAC8C\uD2F0");
		panel.add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("\uD654\uC774\uD2B8\uC640\uC778");
		panel.add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("\uC6B0\uB3D9\uBA74");
		panel.add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("\uD0C0\uCF54\uC57C\uD0A4 \uBD84\uB9D0");
		panel.add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("\uC624\uCF54\uB178\uBBF8\uC57C\uD0A4 \uAC00\uB8E8");
		panel.add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("\uD53C\uD074");
		panel.add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("\uCE58\uD0A8\uD30C\uC6B0\uB354");
		panel.add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("\uD280\uAE40\uAC00\uB8E8");
		panel.add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("\uBCA0\uC774\uD0B9\uD30C\uC6B0\uB354");
		panel.add(checkBox_45);
		
		JLabel label = new JLabel("\uAE30\uD0C0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		label.setBounds(12, 10, 410, 44);
		contentPane.add(label);
		
		Material M = new Material();
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17,checkBox_18,checkBox_19,checkBox_20,checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25,checkBox_26,checkBox_27,checkBox_28,checkBox_29,checkBox_30,checkBox_31,checkBox_32,checkBox_33,checkBox_34,checkBox_35,checkBox_36,checkBox_37,checkBox_38,checkBox_39,checkBox_40,checkBox_41,checkBox_42,checkBox_43,checkBox_44,checkBox_45);
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 423, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 423, 50, 41);
		contentPane.add(label_1);
	}
}
