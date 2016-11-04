import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class RecipeDelivery extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeDelivery frame = new RecipeDelivery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RecipeDelivery() {
		ImageIcon Search = new ImageIcon("Image/search.png");
		ImageIcon Back = new ImageIcon("Image/back.png");
		ImageIcon Money = new ImageIcon("Image/money.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 455);
		ImageIcon background = new ImageIcon("Image/background_ora.jpg");
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(background.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\uCC1C,\uD0D5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(27, 100, 276, 43);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("\uC911\uC2DD");
		button.setBounds(27, 167, 276, 43);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uC77C\uC2DD");
		button_1.setBounds(27, 234, 276, 43);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\uC591\uC2DD");
		button_2.setBounds(27, 302, 276, 43);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\uCE58\uD0A8,\uCC1C\uB2ED");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(347, 100, 276, 43);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\uD55C\uC2DD,\uBD84\uC2DD");
		button_4.setBounds(347, 167, 276, 43);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\uC871\uBC1C,\uBCF4\uC308");
		button_5.setBounds(347, 234, 276, 43);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\uD53C\uC790");
		button_6.setBounds(347, 302, 276, 43);
		contentPane.add(button_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 38));
		textArea.setBackground(new Color(255, 239, 213));
		textArea.setBounds(194, 21, 323, 54);
		contentPane.add(textArea);
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btn_search = new JButton("");
		btn_search.setFocusPainted(false);
		btn_search.setContentAreaFilled(false);
		btn_search.setBorderPainted(false);
		btn_search.setBounds(531, 21, 97, 54);
		contentPane.add(btn_search);
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 366, 50, 41);
		contentPane.add(btn_back);
		
		JLabel money_image = new JLabel(Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);
		
		JLabel search_image = new JLabel(Search);
		search_image.setBounds(541, 21, 61, 61);
		contentPane.add(search_image);
		
		JLabel back_image = new JLabel(Back);
		back_image.setBounds(12, 366, 50, 41);
		contentPane.add(back_image);
	}

}
