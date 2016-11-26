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
		btn_search.setBorderPainted(false); // ���� ��ư
		btn_search.setFocusPainted(false); // ���� ��ư
		btn_search.setContentAreaFilled(false); // ���� ��ư
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					cook.searchhandler();
				} catch (Exception p) {
					JOptionPane.showMessageDialog(null, "�ݾ��� �Է��� �ּ���.");
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
		tf_money.setFont(new Font("�޸յձ�������", Font.PLAIN, 38));
		tf_money.setColumns(10);
		tf_money.setBounds(198, 21, 321, 54);
		contentPane.add(tf_money);

		JButton btn_ä��_���� = new JButton();
		btn_ä��_����.setFocusPainted(false);
		btn_ä��_����.setContentAreaFilled(false);
		btn_ä��_����.setBorderPainted(false);
		btn_ä��_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.ä��_����handler();
			}
		});
		btn_ä��_����.setBounds(91, 119, 161, 41);
		contentPane.add(btn_ä��_����);

		JLabel lb_ä��_���� = new JLabel("\uCC44\uC18C/\uACFC\uC77C");
		lb_ä��_����.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_ä��_����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_ä��_����.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_ä��_����.setForeground(Color.BLACK);
		lb_ä��_����.setBounds(91, 119, 161, 47);
		contentPane.add(lb_ä��_����);

		JButton btn_���� = new JButton();
		btn_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.����handler();
			}
		});
		btn_����.setFocusPainted(false);
		btn_����.setContentAreaFilled(false);
		btn_����.setBorderPainted(false);
		btn_����.setBounds(379, 119, 161, 41);
		contentPane.add(btn_����);

		JLabel lb_���� = new JLabel("\uC721\uB958");
		lb_����.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����.setForeground(Color.BLACK);
		lb_����.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_����.setBounds(379, 119, 161, 47);
		contentPane.add(lb_����);

		JButton btn_���깰 = new JButton();
		btn_���깰.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 12));
		btn_���깰.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.���깰handler();
			}
		});
		btn_���깰.setFocusPainted(false);
		btn_���깰.setContentAreaFilled(false);
		btn_���깰.setBorderPainted(false);
		btn_���깰.setBounds(91, 192, 161, 41);
		contentPane.add(btn_���깰);

		JLabel lb_���깰 = new JLabel("\uC218\uC0B0\uBB3C");
		lb_���깰.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_���깰.setHorizontalAlignment(SwingConstants.CENTER);
		lb_���깰.setForeground(Color.BLACK);
		lb_���깰.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_���깰.setBounds(91, 192, 161, 47);
		contentPane.add(lb_���깰);

		JButton btn_�_�߰��� = new JButton();
		btn_�_�߰���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.�_�߰���handler();
			}
		});
		btn_�_�߰���.setFocusPainted(false);
		btn_�_�߰���.setContentAreaFilled(false);
		btn_�_�߰���.setBorderPainted(false);
		btn_�_�߰���.setBounds(379, 192, 182, 54);
		contentPane.add(btn_�_�߰���);

		JLabel lb_�_�߰��� = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
		lb_�_�߰���.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_�_�߰���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�_�߰���.setForeground(Color.BLACK);
		lb_�_�߰���.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_�_�߰���.setBounds(356, 192, 214, 47);
		contentPane.add(lb_�_�߰���);

		JButton btn_���_�ҽ� = new JButton();
		btn_���_�ҽ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.���_�ҽ�handler();
			}
		});
		btn_���_�ҽ�.setFocusPainted(false);
		btn_���_�ҽ�.setContentAreaFilled(false);
		btn_���_�ҽ�.setBorderPainted(false);
		btn_���_�ҽ�.setBounds(91, 261, 161, 41);
		contentPane.add(btn_���_�ҽ�);

		JLabel lb_���_�ҽ� = new JLabel("\uC591\uB150/\uC18C\uC2A4");
		lb_���_�ҽ�.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_���_�ҽ�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_���_�ҽ�.setForeground(Color.BLACK);
		lb_���_�ҽ�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_���_�ҽ�.setBounds(91, 261, 161, 47);
		contentPane.add(lb_���_�ҽ�);

		JButton btn_����_����ǰ = new JButton();
		btn_����_����ǰ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.����_����ǰhandler();
			}
		});
		btn_����_����ǰ.setFocusPainted(false);
		btn_����_����ǰ.setContentAreaFilled(false);
		btn_����_����ǰ.setBorderPainted(false);
		btn_����_����ǰ.setBounds(79, 330, 189, 47);
		contentPane.add(btn_����_����ǰ);

		JLabel lb_����_����ǰ = new JLabel("\uAC00\uACF5/\uC720\uC81C\uD488");
		lb_����_����ǰ.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_����_����ǰ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����_����ǰ.setForeground(Color.BLACK);
		lb_����_����ǰ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_����_����ǰ.setBounds(79, 318, 189, 59);
		contentPane.add(lb_����_����ǰ);

		JButton btn_��Ÿ = new JButton();
		btn_��Ÿ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cook.��Ÿhandler();
			}
		});
		btn_��Ÿ.setFocusPainted(false);
		btn_��Ÿ.setContentAreaFilled(false);
		btn_��Ÿ.setBorderPainted(false);
		btn_��Ÿ.setBounds(379, 255, 161, 41);
		contentPane.add(btn_��Ÿ);

		JLabel lb_��Ÿ = new JLabel("\uAE30\uD0C0");
		lb_��Ÿ.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_��Ÿ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��Ÿ.setForeground(Color.BLACK);
		lb_��Ÿ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_��Ÿ.setBounds(379, 255, 161, 47);
		contentPane.add(lb_��Ÿ);

		JButton btn_����ʱ�ȭ = new JButton(image.reset);
		btn_����ʱ�ȭ.setFocusPainted(false);
		btn_����ʱ�ȭ.setContentAreaFilled(false);
		btn_����ʱ�ȭ.setBorderPainted(false);
		btn_����ʱ�ȭ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cook.reset();
			}
		});
		btn_����ʱ�ȭ.setBounds(425, 318, 74, 73);
		contentPane.add(btn_����ʱ�ȭ);

		JLabel lb_����ʱ�ȭ = new JLabel("\uC7AC\uB8CC \uCD08\uAE30\uD654");
		lb_����ʱ�ȭ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 14));
		lb_����ʱ�ȭ.setBounds(425, 345, 74, 18);
		contentPane.add(lb_����ʱ�ȭ);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btn_back, btn_search, serach_image, money_image, tf_money, btn_ä��_����, lb_ä��_����, btn_����, lb_����, btn_���깰, lb_���깰, btn_�_�߰���, lb_�_�߰���, btn_���_�ҽ�, lb_���_�ҽ�, btn_����_����ǰ, lb_����_����ǰ, btn_��Ÿ, lb_��Ÿ, btn_����ʱ�ȭ, lb_����ʱ�ȭ}));
		
		
	}
}
