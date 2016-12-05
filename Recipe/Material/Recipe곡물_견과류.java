
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

public class Recipe곡물_견과류 extends JFrame {

	private JPanel contentPane;

	public Recipe곡물_견과류() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/RecipeLogo.png"));
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 265);
		contentPane.add(panel);
		
		JCheckBox checkBox= new JCheckBox("\uAC15\uB0AD\uCF69");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uAC74\uB300\uCD94");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uAC74\uD3EC\uB3C4");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uAC80\uC740\uBCF4\uB9AC\uC300");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uAC80\uC815\uD604\uBBF8");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uADC0\uB9AC");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uAE68");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB179\uB450");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uB545\uCF69");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uB80C\uC988\uCF69");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uB9C8\uCE74\uB2E4\uBBF8\uC544");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uB9E4\uD654\uCF69");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uBA54\uBC00");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uBC24");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uC11C\uB9AC\uD0DC");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uC11C\uBAA9\uD0DC");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uC218\uC218");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uC544\uB9C8\uC528");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uC544\uBAAC\uB4DC");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uC555\uB9E5");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uC728\uBB34");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uC740\uD589");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uC7A3");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uCC30\uAE30\uC7A5");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uCC30\uC218\uC218\uC300");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("\uCC39\uC300");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uCCAD\uCC28\uC881\uC300");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uCE58\uC544\uC2DC\uB4DC");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uCE90\uC288\uB108\uD2B8");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uCF69");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uD034\uB178\uC544");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uD06C\uB79C\uBCA0\uB9AC");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("\uD325");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("\uD53C\uC2A4\uD0C0\uCE58\uC624");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uD53C\uCE78");
		panel.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("\uD574\uBC14\uB77C\uAE30\uC528");
		panel.add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("\uD584\uD504\uC528\uB4DC");
		panel.add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("\uD5E4\uC774\uC990\uB11B");
		panel.add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("\uD604\uBBF8");
		panel.add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("\uD638\uB450");
		panel.add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("\uD638\uBC15\uC528");
		panel.add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("\uD64D\uBBF8");
		panel.add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("\uD751\uBBF8");
		panel.add(checkBox_42);
		
		JLabel lb_곡물_견과류 = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
		lb_곡물_견과류.setHorizontalAlignment(SwingConstants.CENTER);
		lb_곡물_견과류.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		lb_곡물_견과류.setBounds(12, 10, 410, 44);
		contentPane.add(lb_곡물_견과류);
		
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 410, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 410, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8
						,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17
						,checkBox_18,checkBox_19,checkBox_20,checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25
						,checkBox_26,checkBox_27,checkBox_28,checkBox_29,checkBox_30,checkBox_31,checkBox_32,checkBox_33
						,checkBox_34,checkBox_35,checkBox_36,checkBox_37,checkBox_38,checkBox_39,checkBox_40,checkBox_41
						,checkBox_42);
				JOptionPane.showMessageDialog(null,"추가 완료");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 339, 111, 112);
		contentPane.add(btn_add);
	}

}
