
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

public class Recipe곡물_견과류 extends JFrame {

	private JPanel contentPane;

	public Recipe곡물_견과류() {
		
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(Color.BLACK);
		panel.setBounds(12, 64, 410, 63);
		contentPane.add(panel);
		
		JCheckBox checkBox_6 = new JCheckBox("\uAC74\uD3EC\uB3C4");
		panel.add(checkBox_6);
		
		JCheckBox checkBox_4 = new JCheckBox("\uBC24");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_7 = new JCheckBox("\uC544\uBAAC\uB4DC");
		panel.add(checkBox_7);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC7A3");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_5 = new JCheckBox("\uCF69");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_3 = new JCheckBox("\uD325");
		panel.add(checkBox_3);
		
		JCheckBox checkBox= new JCheckBox("\uAE68");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uB545\uCF69");
		panel.add(checkBox_1);
		
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
		btn_back.setBounds(12, 304, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 304, 50, 41);
		contentPane.add(lb_back);
		
		JButton btn_add = new JButton(image.Add);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M.SearchM(checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7);
				JOptionPane.showMessageDialog(null,"추가 완료");
			}
		});
		btn_add.setFocusPainted(false);
		btn_add.setContentAreaFilled(false);
		btn_add.setBorderPainted(false);
		btn_add.setBounds(311, 233, 111, 112);
		contentPane.add(btn_add);
	}

}
