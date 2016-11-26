
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

public class Recipe¾ç³ä_¼Ò½º extends JFrame {

	private JPanel contentPane;

	public Recipe¾ç³ä_¼Ò½º() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 171);
		contentPane.add(panel);
		
		JCheckBox checkBox_4 = new JCheckBox("\uAC04\uC7A5");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_8 = new JCheckBox("\uACE0\uCD94\uC7A5");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_15 = new JCheckBox("\uAD74\uC18C\uC2A4");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_20 = new JCheckBox("\uAFC0");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB41C\uC7A5");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_27 = new JCheckBox("\uB450\uBC18\uC7A5");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_16 = new JCheckBox("\uB370\uB9AC\uC57C\uD0A4\uC18C\uC2A4");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_19 = new JCheckBox("\uB545\uCF69\uC18C\uC2A4");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_10 = new JCheckBox("\uB808\uBAAC\uC999");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_25 = new JCheckBox("\uB9C8\uC694\uB124\uC988");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_14 = new JCheckBox("\uBA38\uC2A4\uD130\uB4DC");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_12 = new JCheckBox("\uBA78\uCE58\uC561\uC813");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_5 = new JCheckBox("\uBB3C\uC5FF");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_18 = new JCheckBox("\uB9E4\uC2E4\uCCAD");
		panel.add(checkBox_18);
		
		JCheckBox checkBox = new JCheckBox("\uC18C\uAE08");
		panel.add(checkBox);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC2DD\uCD08");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC0C8\uC6B0\uC813");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC124\uD0D5");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_23 = new JCheckBox("\uC6B0\uC2A4\uD130\uC18C\uC2A4");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC640\uC0AC\uBE44");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_11 = new JCheckBox("\uCC38\uCE58\uC561\uC813");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_22 = new JCheckBox("\uCE60\uB9AC\uC18C\uC2A4");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_21 = new JCheckBox("\uCD98\uC7A5");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_13 = new JCheckBox("\uCF00\uCCA9");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_24 = new JCheckBox("\uD1A0\uB9C8\uD1A0\uD398\uC774\uC2A4\uD2B8");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_17 = new JCheckBox("\uD53C\uC2DC\uC18C\uC2A4");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_1 = new JCheckBox("\uD6C4\uCDA7\uAC00\uB8E8");
		panel.add(checkBox_1);
		
		JLabel lb_¾ç³ä_¼Ò½º = new JLabel("\uC591\uB150/\uC18C\uC2A4");
		lb_¾ç³ä_¼Ò½º.setHorizontalAlignment(SwingConstants.CENTER);
		lb_¾ç³ä_¼Ò½º.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
		lb_¾ç³ä_¼Ò½º.setBounds(12, 10, 410, 44);
		contentPane.add(lb_¾ç³ä_¼Ò½º);
		
		Material M = new Material();
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 323, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 323, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8,checkBox_9,checkBox_10,checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,checkBox_16,checkBox_17,checkBox_18,checkBox_19,checkBox_20,checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25,checkBox_27);
				JOptionPane.showMessageDialog(null,"Ãß°¡ ¿Ï·á");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 252, 111, 112);
		contentPane.add(btn_add);
	}

}
