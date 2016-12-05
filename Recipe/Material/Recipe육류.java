
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

public class RecipeÀ°·ù extends JFrame {

	private JPanel contentPane;

	public RecipeÀ°·ù() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/RecipeLogo.png"));
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 259);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uAC00\uBE0C\uB9AC\uC0B4");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uAC08\uBE44\uC0B4");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uAF2C\uCE58\uC6A9\uC591\uACE0\uAE30");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uAF43\uAC08\uBE44\uC0B4");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB2ED(\uBC31\uC219\uC6A9)");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB2ED(\uBCF6\uC74C\uB2ED\uC6A9)");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uB2ED\uAC00\uC2B4\uC0B4");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB2ED\uADFC\uC704");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uB2ED\uB0A0\uAC1C");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uB2ED\uB2E4\uB9AC");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uB2ED\uC5FC\uD1B5");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30\uBAA9\uC0B4");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uB3FC\uC9C0\uB4F1\uB367\uC0B4");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uB4B7\uB2E4\uB9AC\uC0B4");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uB4F1\uAC08\uBE44");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uB4F1\uC2EC");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uB9C9\uCC3D");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uBAA9\uC2EC");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uBC31\uC219\uC624\uB9AC");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uBD80\uCC44\uC0B4");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("\uC0AC\uD0DC");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("\uC0BC\uACB9\uC0B4");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("\uC0DD\uC624\uB9AC");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("\uC124\uB3C4");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uC548\uC2EC");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("\uC55E\uB2E4\uB9AC\uC0B4");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uC591\uAC08\uBE44");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uC591\uC9C0");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uC591\uC9C0\uAD6C\uC774");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uC5FC\uC18C\uACE0\uAE30");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uC624\uB9AC");
		panel.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("\uC6B0\uB454");
		panel.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("\uCC28\uB3CC\uBC15\uC774");
		panel.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("\uD1A0\uC2DC\uC0B4");
		panel.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("\uD56D\uC815\uC0B4");
		panel.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("\uD64D\uB450\uAE68\uC0B4");
		panel.add(checkBox_35);
		
		JLabel lb_À°·ù = new JLabel("\uC721\uB958");
		lb_À°·ù.setHorizontalAlignment(SwingConstants.CENTER);
		lb_À°·ù.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
		lb_À°·ù.setBounds(12, 10, 410, 44);
		contentPane.add(lb_À°·ù);
		
	
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 384, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 384, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8
						,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17
						,checkBox_18,checkBox_19,checkBox_20,checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25
						,checkBox_26,checkBox_27,checkBox_28,checkBox_29,checkBox_30,checkBox_31,checkBox_32,checkBox_33
						,checkBox_34,checkBox_35);
				JOptionPane.showMessageDialog(null,"Ãß°¡ ¿Ï·á");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 313, 111, 112);
		contentPane.add(btn_add);
	}

}
