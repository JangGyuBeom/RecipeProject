
import java.awt.Color;
import java.awt.Font;
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

public class Recipe가공_유제품 extends JFrame {

	private JPanel contentPane;

	public Recipe가공_유제품() {
		
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 215);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uACA8\uC790\uAC00\uB8E8");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uACC4\uB780");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uACE4\uC57D");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uAE40");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB2E8\uBB34\uC9C0");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB2F9\uBA74");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB3D9\uADF8\uB791\uB561");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB450\uBD80");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uB5A1\uAD6D\uC6A9 \uB5A1");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uB77C\uBA74");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uB9C8\uCE74\uB85C\uB2C8");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uB9CC\uB450");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uB9DB\uC0B4");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uBA54\uCD94\uB9AC\uC54C");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uBC25");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uBC84\uD130");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uBCA0\uC774\uCEE8");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uC0DD\uBA74");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uC0DD\uC120\uAE4C\uC2A4");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uC0DD\uD06C\uB9BC");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uC18C\uBA74");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uC18C\uC2DC\uC9C0");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uC2A4\uD30C\uAC8C\uD2F0");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uC300\uAD6D\uC218");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uC5B4\uBB35");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("\uC6B0\uB3D9\uBA74");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uC6B0\uC720");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uC870\uB7AD\uC774\uB5A1");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uC950\uD3EC");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uCC38\uCE58\uCE94");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uCE58\uC988");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uD06C\uB798\uBBF8");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("\uD50C\uB808\uC778\uC694\uAD6C\uB974\uD2B8");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("\uD584");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uD6C8\uC81C\uC624\uB9AC");
		panel.add(checkBox_34);
		
		JLabel lb_가공_유제품 = new JLabel("\uAC00\uACF5/\uC720\uC81C\uD488");
		lb_가공_유제품.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가공_유제품.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		lb_가공_유제품.setBounds(12, 10, 410, 44);
		contentPane.add(lb_가공_유제품);
		
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 370, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 370, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8
						,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17
						,checkBox_18,checkBox_19,checkBox_20,checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25
						,checkBox_26,checkBox_27,checkBox_28,checkBox_29,checkBox_30,checkBox_31,checkBox_32,checkBox_33
						,checkBox_34);
				JOptionPane.showMessageDialog(null,"추가 완료");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 299, 111, 112);
		contentPane.add(btn_add);
	}
}
