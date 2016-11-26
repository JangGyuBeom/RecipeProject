
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
		
		JLabel lb_À°·ù = new JLabel("\uC721\uB958");
		lb_À°·ù.setHorizontalAlignment(SwingConstants.CENTER);
		lb_À°·ù.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
		lb_À°·ù.setBounds(12, 10, 410, 44);
		contentPane.add(lb_À°·ù);
		
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
		btn_back.setBounds(12, 307, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 307, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5);
				JOptionPane.showMessageDialog(null,"Ãß°¡ ¿Ï·á");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 236, 111, 112);
		contentPane.add(btn_add);
	}

}
