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
		ImageIcon Search = new ImageIcon("Image/search.png");
		ImageIcon Back = new ImageIcon("Image/back.png");
		ImageIcon Money = new ImageIcon("Image/money.png");
		
		ImageIcon 족발 = new ImageIcon("Image/족발.png");
		Image 족발2 = 족발.getImage();
		Image 족발3 = 족발2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 족발1 = new ImageIcon(족발3);
		
		ImageIcon 양식 = new ImageIcon("Image/양식.png");
		Image 양식2 = 양식.getImage();
		Image 양식3 = 양식2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 양식1 = new ImageIcon(양식3);
		
		ImageIcon 분식 = new ImageIcon("Image/분식.png");
		Image 분식2 = 분식.getImage();
		Image 분식3 = 분식2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 분식1 = new ImageIcon(분식3);
		
		ImageIcon 중식 = new ImageIcon("Image/짜장면.png");
		Image 중식2 = 중식.getImage();
		Image 중식3 = 중식2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 중식1 = new ImageIcon(중식3);
		
		ImageIcon 일식 = new ImageIcon("Image/일식.png");
		Image 일식2 = 일식.getImage();
		Image 일식3 = 일식2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 일식1 = new ImageIcon(일식3);
		
		ImageIcon 치킨 = new ImageIcon("Image/치킨.png");
		Image 치킨2 = 치킨.getImage();
		Image 치킨3 = 치킨2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 치킨1 = new ImageIcon(치킨3);
		
		ImageIcon 찜 = new ImageIcon("Image/찜.png");
		Image 찜2 = 찜.getImage();
		Image 찜3 = 찜2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 찜1 = new ImageIcon(찜3);
		
		ImageIcon 피자 = new ImageIcon("Image/피자.png");
		Image 피자2 = 피자.getImage();
		Image 피자3 = 피자2.getScaledInstance(290, 78,java.awt.Image.SCALE_SMOOTH);
		ImageIcon 피자1 = new ImageIcon(피자3);
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 623);
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
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btn_search = new JButton("");
		btn_search.setFocusPainted(false);
		btn_search.setContentAreaFilled(false);
		btn_search.setBorderPainted(false);
		btn_search.setBounds(652, 10, 87, 63);
		contentPane.add(btn_search);
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 534, 50, 41);
		contentPane.add(btn_back);
		
		JLabel money_image = new JLabel(Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);
		
		JLabel search_image = new JLabel(Search);
		search_image.setBounds(662, 19, 67, 61);
		contentPane.add(search_image);
		
		JLabel back_image = new JLabel(Back);
		back_image.setBounds(12, 534, 50, 41);
		contentPane.add(back_image);
		
		textField = new JTextField();
		
		textField.setBackground(new Color(245, 245, 245));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		textField.setBounds(204, 21, 436, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_중식 = new JButton();
		btn_중식.setBorderPainted(false); 	//투명 버튼
		btn_중식.setFocusPainted(false);		//투명 버튼
		btn_중식.setContentAreaFilled(false); //투명 버튼
		btn_중식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_중식.setBounds(62, 116, 290, 78);
		contentPane.add(btn_중식);
		
		JButton btn_치킨 = new JButton();
		btn_치킨.setBorderPainted(false); 	//투명 버튼
		btn_치킨.setFocusPainted(false);		//투명 버튼
		btn_치킨.setContentAreaFilled(false);
		btn_치킨.setBounds(427, 116, 290, 78);
		contentPane.add(btn_치킨);
		
		JButton btn_일식 = new JButton();
		btn_일식.setBorderPainted(false); 	//투명 버튼
		btn_일식.setFocusPainted(false);		//투명 버튼
		btn_일식.setContentAreaFilled(false);
		btn_일식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_일식.setBounds(62, 224, 290, 78);
		contentPane.add(btn_일식);
		
		JButton btn_한식_분식 = new JButton();
		btn_한식_분식.setBorderPainted(false); 	//투명 버튼
		btn_한식_분식.setFocusPainted(false);		//투명 버튼
		btn_한식_분식.setContentAreaFilled(false);
		btn_한식_분식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_한식_분식.setBounds(427, 224, 290, 78);
		contentPane.add(btn_한식_분식);
		
		JButton btn_족발_보쌈 = new JButton();
		btn_족발_보쌈.setBorderPainted(false); 	//투명 버튼
		btn_족발_보쌈.setFocusPainted(false);		//투명 버튼
		btn_족발_보쌈.setContentAreaFilled(false);
		btn_족발_보쌈.setBounds(427, 335, 290, 78);
		contentPane.add(btn_족발_보쌈);
		
		JButton btn_피자 = new JButton();
		btn_피자.setBorderPainted(false); 	//투명 버튼
		btn_피자.setFocusPainted(false);		//투명 버튼
		btn_피자.setContentAreaFilled(false);
		btn_피자.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_피자.setBounds(427, 443, 290, 78);
		contentPane.add(btn_피자);
		
		JButton btn_양식 = new JButton();
		btn_양식.setBorderPainted(false); 	//투명 버튼
		btn_양식.setFocusPainted(false);		//투명 버튼
		btn_양식.setContentAreaFilled(false);
		btn_양식.setBounds(62, 335, 290, 78);
		contentPane.add(btn_양식);
		
		JButton btn_찜_탕 = new JButton();
		btn_찜_탕.setBorderPainted(false); 	//투명 버튼
		btn_찜_탕.setFocusPainted(false);		//투명 버튼
		btn_찜_탕.setContentAreaFilled(false);
		btn_찜_탕.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_찜_탕.setBounds(62, 443, 290, 78);
		contentPane.add(btn_찜_탕);
		
		JLabel 중식_image = new JLabel(중식1);
		중식_image.setBounds(62, 116, 290, 78);
		contentPane.add(중식_image);
		
		JLabel 치킨_image = new JLabel(치킨1);
		치킨_image.setBounds(427, 116, 290, 78);
		contentPane.add(치킨_image);
		
		JLabel 일식_image = new JLabel(일식1);
		일식_image.setBounds(62, 224, 290, 78);
		contentPane.add(일식_image);
		
		JLabel 한식_분식_image = new JLabel(분식1);
		한식_분식_image.setBounds(427, 224, 290, 78);
		contentPane.add(한식_분식_image);
		
		JLabel 양식_image = new JLabel(양식1);
		양식_image.setBounds(62, 335, 290, 78);
		contentPane.add(양식_image);
		
		JLabel 족발_image = new JLabel(족발1);
		족발_image.setBounds(427, 335, 290, 78);
		contentPane.add(족발_image);
		
		JLabel 찜_탕_image = new JLabel(찜1);
		찜_탕_image.setBounds(62, 443, 290, 78);
		contentPane.add(찜_탕_image);
		
		JLabel 피자_image = new JLabel(피자1);
		피자_image.setBounds(427, 443, 290, 78);
		contentPane.add(피자_image);
	}
}
