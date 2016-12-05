
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Recipe기타 extends JFrame {

	private JPanel contentPane;

	public Recipe기타() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/RecipeLogo.png"));
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 211);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uAC10\uC790\uC804\uBD84");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uAC10\uCD08");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uACC4\uD53C");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uAE40\uCE58");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB179\uB9D0\uAC00\uB8E8");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB808\uB4DC\uC640\uC778");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB9DB\uC220");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB9E5\uC8FC");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uBC00\uAC00\uB8E8");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uBCA0\uC774\uD0B9\uD30C\uC6B0\uB354");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uBE75\uAC00\uB8E8");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uC0B0\uC218\uC720");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uC2DD\uBE75");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uC2DD\uC6A9\uC720");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uC591\uC7A5\uD53C");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_27 = new JCheckBox("\uC624\uBBF8\uC790");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_15 = new JCheckBox("\uC624\uCF54\uB178\uBBF8\uC57C\uD0A4\uAC00\uB8E8");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uC62C\uB9AC\uBE0C\uC720");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uC815\uC885");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uCC38\uAE30\uB984");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uCC39\uC300\uAC00\uB8E8");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uCCAD\uC8FC");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uCE58\uD0A8\uD30C\uC6B0\uB354");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uCE74\uB808\uAC00\uB8E8");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uD0C0\uCF54\uC57C\uD0A4\uBD84\uB9D0");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uD280\uAE40\uAC00\uB8E8");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_28 = new JCheckBox("\uD30C\uC2AC\uB9AC\uAC00\uB8E8");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_25 = new JCheckBox("\uD53C\uD074");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uD5DB\uAC1C\uB098\uBB34\uAC00\uC9C0");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_29 = new JCheckBox("\uD654\uC774\uD2B8\uC640\uC778");
		panel.add(checkBox_29);
		
		JLabel lb_기타 = new JLabel("\uAE30\uD0C0");
		lb_기타.setHorizontalAlignment(SwingConstants.CENTER);
		lb_기타.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		lb_기타.setBounds(12, 10, 410, 44);
		contentPane.add(lb_기타);
		
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 364, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 364, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8
						,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17
						,checkBox_18,checkBox_19,checkBox_20,checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25
						,checkBox_26,checkBox_27,checkBox_28,checkBox_29);
				JOptionPane.showMessageDialog(null,"추가 완료");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 293, 111, 112);
		contentPane.add(btn_add);
	}
}
