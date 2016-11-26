import java.awt.Color;
import java.awt.Component;
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

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class RecipeCook extends JFrame {

	private JPanel contentPane;
	private JTextField tf_money;
	Price p = new Price();

	public RecipeCook() {

		RecipeImage image = new RecipeImage();
		RecipeButtonHandler cook = new RecipeButtonHandler();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 499);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.background_ora.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_back = new JButton(image.Back);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 410, 50, 41);
		contentPane.add(btn_back);

		JButton btn_search = new JButton();
		btn_search.setBorderPainted(false); // 투명 버튼
		btn_search.setFocusPainted(false); // 투명 버튼
		btn_search.setContentAreaFilled(false); // 투명 버튼
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					cook.searchhandler();
				} catch (Exception p) {
					JOptionPane.showMessageDialog(null, "금액을 입력해 주세요.");
				}

			}
		});
		btn_search.setBounds(531, 21, 97, 54);
		contentPane.add(btn_search);

		JLabel serach_image = new JLabel(image.Search);
		serach_image.setBounds(529, 10, 86, 73);
		contentPane.add(serach_image);

		JLabel money_image = new JLabel(image.Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);

		tf_money = new JTextField();
		tf_money.setHorizontalAlignment(SwingConstants.CENTER);
		tf_money.setBackground(new Color(245, 245, 245));
		tf_money.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		tf_money.setColumns(10);
		tf_money.setBounds(198, 21, 321, 54);
		contentPane.add(tf_money);

		JButton btn_채소_과일 = new JButton();
		btn_채소_과일.setFocusPainted(false);
		btn_채소_과일.setContentAreaFilled(false);
		btn_채소_과일.setBorderPainted(false);
		btn_채소_과일.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.채소_과일handler();
			}
		});
		btn_채소_과일.setBounds(91, 119, 161, 41);
		contentPane.add(btn_채소_과일);

		JLabel lb_채소_과일 = new JLabel("\uCC44\uC18C/\uACFC\uC77C");
		lb_채소_과일.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_채소_과일.setHorizontalAlignment(SwingConstants.CENTER);
		lb_채소_과일.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_채소_과일.setForeground(Color.BLACK);
		lb_채소_과일.setBounds(91, 119, 161, 47);
		contentPane.add(lb_채소_과일);

		JButton btn_육류 = new JButton();
		btn_육류.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.육류handler();
			}
		});
		btn_육류.setFocusPainted(false);
		btn_육류.setContentAreaFilled(false);
		btn_육류.setBorderPainted(false);
		btn_육류.setBounds(379, 119, 161, 41);
		contentPane.add(btn_육류);

		JLabel lb_육류 = new JLabel("\uC721\uB958");
		lb_육류.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_육류.setHorizontalAlignment(SwingConstants.CENTER);
		lb_육류.setForeground(Color.BLACK);
		lb_육류.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_육류.setBounds(379, 119, 161, 47);
		contentPane.add(lb_육류);

		JButton btn_수산물 = new JButton();
		btn_수산물.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 12));
		btn_수산물.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.수산물handler();
			}
		});
		btn_수산물.setFocusPainted(false);
		btn_수산물.setContentAreaFilled(false);
		btn_수산물.setBorderPainted(false);
		btn_수산물.setBounds(91, 192, 161, 41);
		contentPane.add(btn_수산물);

		JLabel lb_수산물 = new JLabel("\uC218\uC0B0\uBB3C");
		lb_수산물.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_수산물.setHorizontalAlignment(SwingConstants.CENTER);
		lb_수산물.setForeground(Color.BLACK);
		lb_수산물.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_수산물.setBounds(91, 192, 161, 47);
		contentPane.add(lb_수산물);

		JButton btn_곡물_견과류 = new JButton();
		btn_곡물_견과류.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.곡물_견과류handler();
			}
		});
		btn_곡물_견과류.setFocusPainted(false);
		btn_곡물_견과류.setContentAreaFilled(false);
		btn_곡물_견과류.setBorderPainted(false);
		btn_곡물_견과류.setBounds(379, 192, 182, 54);
		contentPane.add(btn_곡물_견과류);

		JLabel lb_곡물_견과류 = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
		lb_곡물_견과류.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_곡물_견과류.setHorizontalAlignment(SwingConstants.CENTER);
		lb_곡물_견과류.setForeground(Color.BLACK);
		lb_곡물_견과류.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_곡물_견과류.setBounds(356, 192, 214, 47);
		contentPane.add(lb_곡물_견과류);

		JButton btn_양념_소스 = new JButton();
		btn_양념_소스.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.양념_소스handler();
			}
		});
		btn_양념_소스.setFocusPainted(false);
		btn_양념_소스.setContentAreaFilled(false);
		btn_양념_소스.setBorderPainted(false);
		btn_양념_소스.setBounds(91, 261, 161, 41);
		contentPane.add(btn_양념_소스);

		JLabel lb_양념_소스 = new JLabel("\uC591\uB150/\uC18C\uC2A4");
		lb_양념_소스.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_양념_소스.setHorizontalAlignment(SwingConstants.CENTER);
		lb_양념_소스.setForeground(Color.BLACK);
		lb_양념_소스.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_양념_소스.setBounds(91, 261, 161, 47);
		contentPane.add(lb_양념_소스);

		JButton btn_가공_유제품 = new JButton();
		btn_가공_유제품.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.가공_유제품handler();
			}
		});
		btn_가공_유제품.setFocusPainted(false);
		btn_가공_유제품.setContentAreaFilled(false);
		btn_가공_유제품.setBorderPainted(false);
		btn_가공_유제품.setBounds(79, 330, 189, 47);
		contentPane.add(btn_가공_유제품);

		JLabel lb_가공_유제품 = new JLabel("\uAC00\uACF5/\uC720\uC81C\uD488");
		lb_가공_유제품.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_가공_유제품.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가공_유제품.setForeground(Color.BLACK);
		lb_가공_유제품.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_가공_유제품.setBounds(79, 318, 189, 59);
		contentPane.add(lb_가공_유제품);

		JButton btn_기타 = new JButton();
		btn_기타.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.기타handler();
			}
		});
		btn_기타.setFocusPainted(false);
		btn_기타.setContentAreaFilled(false);
		btn_기타.setBorderPainted(false);
		btn_기타.setBounds(379, 255, 161, 41);
		contentPane.add(btn_기타);

		JLabel lb_기타 = new JLabel("\uAE30\uD0C0");
		lb_기타.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_기타.setHorizontalAlignment(SwingConstants.CENTER);
		lb_기타.setForeground(Color.BLACK);
		lb_기타.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_기타.setBounds(379, 255, 161, 47);
		contentPane.add(lb_기타);

		JButton btn_재료초기화 = new JButton(image.reset);
		btn_재료초기화.setFocusPainted(false);
		btn_재료초기화.setContentAreaFilled(false);
		btn_재료초기화.setBorderPainted(false);
		btn_재료초기화.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cook.reset();
			}
		});
		btn_재료초기화.setBounds(425, 318, 74, 73);
		contentPane.add(btn_재료초기화);

		JLabel lb_재료초기화 = new JLabel("\uC7AC\uB8CC \uCD08\uAE30\uD654");
		lb_재료초기화.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
		lb_재료초기화.setBounds(425, 345, 74, 18);
		contentPane.add(lb_재료초기화);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btn_back, btn_search, serach_image, money_image, tf_money, btn_채소_과일, lb_채소_과일, btn_육류, lb_육류, btn_수산물, lb_수산물, btn_곡물_견과류, lb_곡물_견과류, btn_양념_소스, lb_양념_소스, btn_가공_유제품, lb_가공_유제품, btn_기타, lb_기타, btn_재료초기화, lb_재료초기화}));
		
		
	}
}
