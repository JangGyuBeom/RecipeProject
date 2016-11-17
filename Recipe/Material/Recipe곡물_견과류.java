
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

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe°î¹°_°ß°ú·ù frame = new Recipe°î¹°_°ß°ú·ù();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
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
		
		JCheckBox chckbxDkahsem = new JCheckBox("\uC544\uBAAC\uB4DC");
		panel.add(chckbxDkahsem);
		
		JCheckBox checkBox_1 = new JCheckBox("\uD638\uB450");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uBC24");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC7A3");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB545\uCF69");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB300\uCD94");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC740\uD589");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uC624\uBBF8\uC790");
		panel.add(checkBox_7);
		
		JCheckBox checkBox = new JCheckBox("\uB9E4\uC2E4");
		panel.add(checkBox);
		
		JCheckBox checkBox_8 = new JCheckBox("\uD574\uBC14\uB77C\uAE30 \uC528");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC300");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_12 = new JCheckBox("\uCC38\uAE68");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_10 = new JCheckBox("\uD604\uBBF8");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uCC39\uC300");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_13 = new JCheckBox("\uD325");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uB4E4\uAE68");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uCC39\uC300\uD604\uBBF8");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uB179\uB450");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_22 = new JCheckBox("\uC644\uB450\uCF69");
		panel.add(checkBox_22);
		
		JCheckBox checkBox_21 = new JCheckBox("\uBD80\uCE68\uAC00\uB8E8");
		panel.add(checkBox_21);
		
		JCheckBox checkBox_20 = new JCheckBox("\uD280\uAE40\uAC00\uB8E8");
		panel.add(checkBox_20);
		
		JCheckBox checkBox_19 = new JCheckBox("\uC804\uBD80\uAC00\uB8E8");
		panel.add(checkBox_19);
		
		JCheckBox checkBox_18 = new JCheckBox("\uBBF8\uC22B\uAC00\uB8E8");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_23 = new JCheckBox("\uBCA0\uC774\uD0B9\uC18C\uB2E4");
		panel.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("\uCC39\uC300\uAC00\uB8E8");
		panel.add(checkBox_24);
		
		JCheckBox checkBox_17 = new JCheckBox("\uCF69\uAC00\uB8E8");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_25 = new JCheckBox("\uC625\uC218\uC218\uAC00\uB8E8");
		panel.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("\uCE58\uC790\uAC00\uB8E8");
		panel.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("\uC778\uC0BC");
		panel.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("\uB545\uCF69\uAC00\uB8E8");
		panel.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("\uAC80\uC740\uAE68");
		panel.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("\uCC28\uC870");
		panel.add(checkBox_30);
		
		JLabel label = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
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
		button.setBounds(12, 304, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 304, 50, 41);
		contentPane.add(label_1);
	}

}
