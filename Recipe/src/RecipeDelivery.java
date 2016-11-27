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
		tf_money.setFont(new Font("�޸յձ�������", Font.PLAIN, 38));
		tf_money.setBounds(204, 21, 513, 54);
		contentPane.add(tf_money);
		tf_money.setColumns(10);

		JButton btn_�߽� = new JButton(image.�߽�1);
		btn_�߽�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.chinahandler();

				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}
			}
		});
		btn_�߽�.setBounds(62, 116, 290, 105);
		contentPane.add(btn_�߽�);

		JButton btn_ġŲ = new JButton(image.ġŲ1);
		btn_ġŲ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.chickenhandler();

				}

				catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}
			}
		});
		btn_ġŲ.setBounds(427, 116, 290, 105);
		contentPane.add(btn_ġŲ);

		JButton btn_�Ͻ� = new JButton(image.�Ͻ�1);
		btn_�Ͻ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.japanfoodhandler();

				}

				catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}
			}
		});
		btn_�Ͻ�.setBounds(62, 259, 290, 105);
		contentPane.add(btn_�Ͻ�);

		JButton btn_�ѽ�_�н� = new JButton(image.�н�1);
		btn_�ѽ�_�н�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.koreanfoodhandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}

			}
		});
		btn_�ѽ�_�н�.setBounds(427, 259, 290, 105);
		contentPane.add(btn_�ѽ�_�н�);

		JButton btn_����_���� = new JButton(image.����1);
		btn_����_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.figsfeethandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}

			}
		});
		btn_����_����.setBounds(427, 410, 290, 105);
		contentPane.add(btn_����_����);

		JButton btn_���� = new JButton(image.����1);
		btn_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.pizzahandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}

			}
		});
		btn_����.setBounds(427, 557, 290, 105);
		contentPane.add(btn_����);

		JButton btn_��� = new JButton(image.���1);
		btn_���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.westernfoodhandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}
			}
		});
		btn_���.setBounds(62, 410, 290, 105);
		contentPane.add(btn_���);

		JButton btn_��_�� = new JButton(image.��1);
		btn_��_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					p.setPrice(new Integer(tf_money.getText()));
					delivery.steamhandler();
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
				}

			}
		});
		btn_��_��.setBounds(62, 557, 290, 105);
		contentPane.add(btn_��_��);

		JLabel lb_�߽� = new JLabel("\uC911\uC2DD");
		lb_�߽�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�߽�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_�߽�.setBounds(166, 218, 78, 31);
		contentPane.add(lb_�߽�);

		JLabel lb_ġŲ_��� = new JLabel("\uCE58\uD0A8/\uCC1C\uB2ED");
		lb_ġŲ_���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_ġŲ_���.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_ġŲ_���.setBounds(511, 218, 115, 31);
		contentPane.add(lb_ġŲ_���);

		JLabel lb_�Ͻ� = new JLabel("\uC77C\uC2DD");
		lb_�Ͻ�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�Ͻ�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_�Ͻ�.setBounds(166, 361, 78, 31);
		contentPane.add(lb_�Ͻ�);

		JLabel lb_�ѽ�_�н� = new JLabel("\uD55C\uC2DD/\uBD84\uC2DD");
		lb_�ѽ�_�н�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�ѽ�_�н�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_�ѽ�_�н�.setBounds(520, 361, 106, 31);
		contentPane.add(lb_�ѽ�_�н�);

		JLabel lb_��� = new JLabel("\uC591\uC2DD");
		lb_���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_���.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_���.setBounds(166, 511, 78, 31);
		contentPane.add(lb_���);

		JLabel lb_����_���� = new JLabel("\uC871\uBC1C/\uBCF4\uC308");
		lb_����_����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����_����.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_����_����.setBounds(520, 511, 106, 31);
		contentPane.add(lb_����_����);

		JLabel lb_��_�� = new JLabel("\uCC1C/\uD0D5");
		lb_��_��.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��_��.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_��_��.setBounds(166, 662, 78, 31);
		contentPane.add(lb_��_��);

		JLabel lb_����_�н�ƮǪ�� = new JLabel("\uD53C\uC790/\uD328\uC2A4\uD2B8\uD478\uB4DC");
		lb_����_�н�ƮǪ��.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����_�н�ƮǪ��.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 21));
		lb_����_�н�ƮǪ��.setBounds(484, 662, 175, 31);
		contentPane.add(lb_����_�н�ƮǪ��);
	}
}
