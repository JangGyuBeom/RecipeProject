import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeDelivery extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		RecipeImage image = new RecipeImage();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 802);
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
		
		JButton btn_back = new JButton();
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 713, 50, 41);
		contentPane.add(btn_back);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		JLabel money_image = new JLabel(image.Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);
		
		JLabel back_image = new JLabel(image.Back);
		back_image.setBounds(12, 713, 50, 41);
		contentPane.add(back_image);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		textField.setBounds(204, 21, 513, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0){
			}
		});
		JButton btn_중식 = new JButton(image.중식1);
		btn_중식.addActionListener(new ActionListener() {
			JFrame frame;
			public void actionPerformed(ActionEvent arg0) {
				Jdbc s_price = new Jdbc();
				String s = textField.getText();
				
				int p = Integer.parseInt(s);
				
				s_price.returnSQL("select * from delivery where d_price<="+p+" and d_group='중식'");
				JOptionPane.showMessageDialog(null,"검색 완료");
			}
		});
		btn_중식.setBounds(62, 116, 290, 105);
		contentPane.add(btn_중식);
		
		JButton btn_치킨 = new JButton(image.치킨1);
	
		btn_치킨.setBounds(427, 116, 290, 105);
		contentPane.add(btn_치킨);
		
		JButton btn_일식 = new JButton(image.일식1);
		btn_일식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_일식.setBounds(62, 259, 290, 105);
		contentPane.add(btn_일식);
		
		JButton btn_한식_분식 = new JButton(image.분식1);
		btn_한식_분식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_한식_분식.setBounds(427, 259, 290, 105);
		contentPane.add(btn_한식_분식);
		
		JButton btn_족발_보쌈 = new JButton(image.족발1);
		btn_족발_보쌈.setBounds(427, 410, 290, 105);
		contentPane.add(btn_족발_보쌈);
		
		JButton btn_피자 = new JButton(image.피자1);
		btn_피자.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_피자.setBounds(427, 557, 290, 105);
		contentPane.add(btn_피자);
		
		JButton btn_양식 = new JButton(image.양식1);
		btn_양식.setBounds(62, 410, 290, 105);
		contentPane.add(btn_양식);
		
		JButton btn_찜_탕 = new JButton(image.찜1);
		btn_찜_탕.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_찜_탕.setBounds(62, 557, 290, 105);
		contentPane.add(btn_찜_탕);
		
		JLabel label = new JLabel("\uC911\uC2DD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label.setBounds(166, 218, 78, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uCE58\uD0A8/\uCC1C\uB2ED");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_1.setBounds(511, 218, 115, 31);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC77C\uC2DD");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_2.setBounds(166, 361, 78, 31);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uD55C\uC2DD/\uBD84\uC2DD");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_3.setBounds(520, 361, 106, 31);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uC591\uC2DD");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_4.setBounds(166, 511, 78, 31);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uC871\uBC1C/\uBCF4\uC308");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_5.setBounds(520, 511, 106, 31);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uCC1C/\uD0D5");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_6.setBounds(166, 662, 78, 31);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\uD53C\uC790/\uD328\uC2A4\uD2B8\uD478\uB4DC");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		label_7.setBounds(484, 662, 175, 31);
		contentPane.add(label_7);
	}
}
