
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Recipe채소_과일 extends JFrame {

	private JPanel contentPane;

	public Recipe채소_과일() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 254);
		contentPane.add(panel);
		JCheckBox checkBox = new JCheckBox("\uD45C\uACE0\uBC84\uC12F");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uD33D\uC774\uBC84\uC12F");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC0C8\uC1A1\uC774\uBC84\uC12F");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uB290\uD0C0\uB9AC\uBC84\uC12F");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC591\uC1A1\uC774\uBC84\uC12F");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB3C4\uB77C\uC9C0");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uBAA9\uC774\uBC84\uC12F");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uCF69\uB098\uBB3C");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uAE7B\uC78E");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uB2F9\uADFC");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uBBF8\uB098\uB9AC");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uC624\uC774");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uC5F0\uADFC");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uBB34");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uD30C");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uAC10\uC790");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uC591\uD30C");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uACE0\uAD6C\uB9C8");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uACE0\uCD94");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uBE0C\uB85C\uCF5C\uB9AC");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uD53C\uB9DD");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uBB34\uB9D0\uB7AD\uC774");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uBBF8\uB354\uB355");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uC591\uBC30\uCD94");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uD638\uBC15");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("\uBD80\uCD94");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uBC30\uCD94");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uC560\uD638\uBC15");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uD30C\uD504\uB9AC\uCE74");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uBC30");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uAC00\uC9C0");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uC0C1\uCD94");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("\uC219\uC8FC");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("\uD30C\uC778\uC560\uD50C");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uACE0\uC0AC\uB9AC");
		panel.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("\uD1A0\uB9C8\uD1A0");
		panel.add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("\uC625\uC218\uC218");
		panel.add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("\uCCAD\uACBD\uCC44");
		panel.add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("\uC624\uB80C\uC9C0");
		panel.add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("\uB808\uBAAC");
		panel.add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("\uACE0\uC218");
		panel.add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("\uC0AC\uACFC");
		panel.add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("\uC0C8\uC2F9\uCC44\uC18C");
		panel.add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("\uC591\uC0C1\uCD94");
		panel.add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("\uD0C0\uC784");
		panel.add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("\uB2E8\uD638\uBC15");
		panel.add(checkBox_45);
		
		JLabel lblNewLabel = new JLabel("\uCC44\uC18C/\uACFC\uC77C");
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 410, 55);
		contentPane.add(lblNewLabel);
		
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
		button.setBounds(12, 356, 50, 41);
		contentPane.add(button);
		
		JLabel label = new JLabel(image.Back);
		label.setBounds(12, 356, 50, 41);
		contentPane.add(label);
	}
}
