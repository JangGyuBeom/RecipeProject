import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class RecipeCook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeCook frame = new RecipeCook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RecipeCook() {
		ImageIcon Search = new ImageIcon("Image/search.png");
		ImageIcon Back = new ImageIcon("Image/back.png");
		ImageIcon Money = new ImageIcon("Image/money.png");
		ImageIcon background = new ImageIcon("Image/background_ora.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 455);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(background.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBackground(new Color(255, 255, 255));
		//contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		textArea.setBackground(new Color(255, 255, 240));
		textArea.setBounds(194, 21, 323, 54);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setToolTipText("");
		panel.setBounds(32, 100, 582, 33);
		contentPane.add(panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_6);
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 366, 50, 41);
		contentPane.add(btn_back);
		
		JButton btn_search = new JButton("");
		btn_search.setBorderPainted(false); 	//투명 버튼
		btn_search.setFocusPainted(false);		//투명 버튼
		btn_search.setContentAreaFilled(false); //투명 버튼
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_search.setBounds(531, 21, 97, 54);
		contentPane.add(btn_search);
		
		JLabel back_image = new JLabel(Back);
		back_image.setBounds(12, 366, 50, 41);
		contentPane.add(back_image);
		
		JLabel serach_image = new JLabel(Search);
		serach_image.setBounds(529, 10, 86, 73);
		contentPane.add(serach_image);
		
		JLabel money_image = new JLabel(Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);
	}
}
