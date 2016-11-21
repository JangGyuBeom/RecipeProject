
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

public class Recipe°î¹°_°ß°ú·ù extends JFrame {

	private JPanel contentPane;

	public Recipe°î¹°_°ß°ú·ù() {
		
		RecipeImage image = new RecipeImage();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 191);
		contentPane.add(panel);
		
		JCheckBox checkBox= new JCheckBox("\uAE68");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uB545\uCF69");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC7A3");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uD325");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uBC24");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uCF69");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uAC74\uD3EC\uB3C4");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uC544\uBAAC\uB4DC");
		panel.add(checkBox_7);
		
		JLabel label = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
		label.setBounds(12, 10, 410, 44);
		contentPane.add(label);
		
		CheckM cm = new CheckM();
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cm.Check°î¹°_°ß°ú·ù(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7);
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 304, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 304, 50, 41);
		contentPane.add(label_1);
	}

}
