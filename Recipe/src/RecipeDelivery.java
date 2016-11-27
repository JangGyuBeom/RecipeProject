import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	public RecipeDelivery() {
		Price p = new Price();
		RecipeImage image = new RecipeImage();
		DeliveryButtonHandler delivery = new DeliveryButtonHandler();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 802);

		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.background_ora.getImage(), 0, 0, null);
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

		JTextField tf_money = new JTextField();
		tf_money.setBackground(new Color(245, 245, 245));
		tf_money.setHorizontalAlignment(SwingConstants.CENTER);
		tf_money.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		tf_money.setBounds(204, 21, 513, 54);
		contentPane.add(tf_money);
		tf_money.setColumns(10);

		JButton btn_중식 = new JButton(image.중식1);
		btn_중식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.chinahandler();

				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}
			}
		});
		btn_중식.setBounds(62, 116, 290, 105);
		contentPane.add(btn_중식);

		JButton btn_치킨 = new JButton(image.치킨1);
		btn_치킨.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.chickenhandler();

				}

				catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}
			}
		});
		btn_치킨.setBounds(427, 116, 290, 105);
		contentPane.add(btn_치킨);

		JButton btn_일식 = new JButton(image.일식1);
		btn_일식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.japanfoodhandler();

				}

				catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}
			}
		});
		btn_일식.setBounds(62, 259, 290, 105);
		contentPane.add(btn_일식);

		JButton btn_한식_분식 = new JButton(image.분식1);
		btn_한식_분식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.koreanfoodhandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}

			}
		});
		btn_한식_분식.setBounds(427, 259, 290, 105);
		contentPane.add(btn_한식_분식);

		JButton btn_족발_보쌈 = new JButton(image.족발1);
		btn_족발_보쌈.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.figsfeethandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}

			}
		});
		btn_족발_보쌈.setBounds(427, 410, 290, 105);
		contentPane.add(btn_족발_보쌈);

		JButton btn_피자 = new JButton(image.피자1);
		btn_피자.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.pizzahandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}

			}
		});
		btn_피자.setBounds(427, 557, 290, 105);
		contentPane.add(btn_피자);

		JButton btn_양식 = new JButton(image.양식1);
		btn_양식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.westernfoodhandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}
			}
		});
		btn_양식.setBounds(62, 410, 290, 105);
		contentPane.add(btn_양식);

		JButton btn_찜_탕 = new JButton(image.찜1);
		btn_찜_탕.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.steamhandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
				}

			}
		});
		btn_찜_탕.setBounds(62, 557, 290, 105);
		contentPane.add(btn_찜_탕);

		JLabel lb_중식 = new JLabel("\uC911\uC2DD");
		lb_중식.setHorizontalAlignment(SwingConstants.CENTER);
		lb_중식.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_중식.setBounds(166, 218, 78, 31);
		contentPane.add(lb_중식);

		JLabel lb_치킨_찜닭 = new JLabel("\uCE58\uD0A8/\uCC1C\uB2ED");
		lb_치킨_찜닭.setHorizontalAlignment(SwingConstants.CENTER);
		lb_치킨_찜닭.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_치킨_찜닭.setBounds(511, 218, 115, 31);
		contentPane.add(lb_치킨_찜닭);

		JLabel lb_일식 = new JLabel("\uC77C\uC2DD");
		lb_일식.setHorizontalAlignment(SwingConstants.CENTER);
		lb_일식.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_일식.setBounds(166, 361, 78, 31);
		contentPane.add(lb_일식);

		JLabel lb_한식_분식 = new JLabel("\uD55C\uC2DD/\uBD84\uC2DD");
		lb_한식_분식.setHorizontalAlignment(SwingConstants.CENTER);
		lb_한식_분식.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_한식_분식.setBounds(520, 361, 106, 31);
		contentPane.add(lb_한식_분식);

		JLabel lb_양식 = new JLabel("\uC591\uC2DD");
		lb_양식.setHorizontalAlignment(SwingConstants.CENTER);
		lb_양식.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_양식.setBounds(166, 511, 78, 31);
		contentPane.add(lb_양식);

		JLabel lb_족발_보쌈 = new JLabel("\uC871\uBC1C/\uBCF4\uC308");
		lb_족발_보쌈.setHorizontalAlignment(SwingConstants.CENTER);
		lb_족발_보쌈.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_족발_보쌈.setBounds(520, 511, 106, 31);
		contentPane.add(lb_족발_보쌈);

		JLabel lb_찜_탕 = new JLabel("\uCC1C/\uD0D5");
		lb_찜_탕.setHorizontalAlignment(SwingConstants.CENTER);
		lb_찜_탕.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_찜_탕.setBounds(166, 662, 78, 31);
		contentPane.add(lb_찜_탕);

		JLabel lb_피자_패스트푸드 = new JLabel("\uD53C\uC790/\uD328\uC2A4\uD2B8\uD478\uB4DC");
		lb_피자_패스트푸드.setHorizontalAlignment(SwingConstants.CENTER);
		lb_피자_패스트푸드.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 21));
		lb_피자_패스트푸드.setBounds(484, 662, 175, 31);
		contentPane.add(lb_피자_패스트푸드);
	}
}
