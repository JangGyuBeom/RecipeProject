
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

public class RecipeÀ°·ù extends JFrame {

	private JPanel contentPane;

	public RecipeÀ°·ù() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 131);
		contentPane.add(panel);
		
		JCheckBox checkBox_4 = new JCheckBox("\uB2ED\uACE0\uAE30");
		panel.add(checkBox_4);
		
		JCheckBox checkBox = new JCheckBox("\uB3FC\uC9C0\uAC08\uBE44");
		panel.add(checkBox);
		
		JCheckBox checkBox_5 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC0BC\uACB9\uC0B4");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC18C\uAC08\uBE44");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_1 = new JCheckBox("\uC1E0\uACE0\uAE30");
		panel.add(checkBox_1);
		
		JLabel label = new JLabel("\uC721\uB958");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
		label.setBounds(12, 10, 410, 44);
		contentPane.add(label);
		
		Material M = new Material();
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 307, 50, 41);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel(image.Back);
		label_1.setBounds(12, 307, 50, 41);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton(image.Add);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5);
				JOptionPane.showMessageDialog(null,"Ãß°¡ ¿Ï·á");
			}
		});
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(311, 236, 111, 112);
		contentPane.add(button_1);
	}

}
