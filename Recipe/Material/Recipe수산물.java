
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

public class Recipe수산물 extends JFrame {

	private JPanel contentPane;

	public Recipe수산물() {
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 175);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uAC00\uB9AC\uBE44");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uAC00\uC4F0\uC624\uBD80\uC2DC");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uAC8C");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uACE0\uB4F1\uC5B4");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB0A0\uCE58\uC54C");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB2E4\uC2AC\uAE30");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB300\uD558");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uBA78\uCE58");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uBB38\uC5B4");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uBC14\uC9C0\uB77D");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uC0C8\uC6B0");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uC18C\uB77C");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uC544\uADC0");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uC624\uC9D5\uC5B4");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uC624\uC9D5\uC5B4\uD3EC");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uC870\uAC1C");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uCB48\uAFB8\uBBF8");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uCF54\uB2E4\uB9AC");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uD574\uC0BC");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uD64D\uD569");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uD669\uD0DC");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uD68C");
		panel.add(checkBox_21);
		
		JLabel lb_수산물 = new JLabel("\uC218\uC0B0\uBB3C");
		lb_수산물.setHorizontalAlignment(SwingConstants.CENTER);
		lb_수산물.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		lb_수산물.setBounds(12, 10, 410, 44);
		contentPane.add(lb_수산물);
		
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 343, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 343, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8
						,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17
						,checkBox_18,checkBox_19,checkBox_20,checkBox_21);
				JOptionPane.showMessageDialog(null,"추가 완료");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 272, 111, 112);
		contentPane.add(btn_add);
	}

}
