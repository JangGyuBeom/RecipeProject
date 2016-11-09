
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

public class Recipe채소_과일 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe채소_과일 frame = new Recipe채소_과일();
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
	public Recipe채소_과일() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 192);
		contentPane.add(panel);
		
		JCheckBox checkBox = new JCheckBox("\uC591\uD30C");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uB300\uD30C");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uAC10\uC790");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uB2F9\uADFC");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC560\uD638\uBC15");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uBB34");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uBC24\uACE0\uAD6C\uB9C8");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\uB2E4\uC9C4\uB9C8\uB298");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\uCF69\uB098\uBB3C");
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("\uC591\uBC30\uCD94");
		panel.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("\uD30C\uD504\uB9AC\uCE74");
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("\uC0C8\uC1A1\uC774\uBC84\uC12F");
		panel.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("\uC624\uC774");
		panel.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("\uCCAD\uC591\uACE0\uCD94");
		panel.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("\uD33D\uC774\uBC84\uC12F");
		panel.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("\uC0AC\uACFC");
		panel.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("\uBE0C\uB85C\uCF5C\uB9AC");
		panel.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("\uB290\uD0C0\uB9AC\uBC84\uC12F");
		panel.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("\uB9C8\uB298");
		panel.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("\uC2DC\uAE08\uCE58");
		panel.add(checkBox_19);
		
		JLabel lblNewLabel = new JLabel("\uCC44\uC18C/\uACFC\uC77C");
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 410, 55);
		contentPane.add(lblNewLabel);
		
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 265, 50, 41);
		contentPane.add(button);
		
		JLabel label = new JLabel(image.Back);
		label.setBounds(12, 265, 50, 41);
		contentPane.add(label);
	}
}
