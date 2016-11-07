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
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class RecipeCook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		RecipeImage image = new RecipeImage();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 502);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(image.background_ora.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBackground(new Color(255, 255, 255));
		//contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 413, 50, 41);
		contentPane.add(btn_back);
		
		JButton btn_search = new JButton("");
		btn_search.setBorderPainted(false); 	//���� ��ư
		btn_search.setFocusPainted(false);		//���� ��ư
		btn_search.setContentAreaFilled(false); //���� ��ư
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_search.setBounds(531, 21, 97, 54);
		contentPane.add(btn_search);
		
		JLabel back_image = new JLabel(image.Back);
		back_image.setBounds(12, 413, 50, 41);
		contentPane.add(back_image);
		
		JLabel serach_image = new JLabel(image.Search);
		serach_image.setBounds(529, 10, 86, 73);
		contentPane.add(serach_image);
		
		JLabel money_image = new JLabel(image.Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(new Color(245, 245, 245));
		textField.setFont(new Font("�޸յձ�������", Font.PLAIN, 38));
		textField.setColumns(10);
		textField.setBounds(198, 21, 321, 54);
		contentPane.add(textField);
		
		JButton btn_ä��_���� = new JButton();
		btn_ä��_����.setFocusPainted(false);
		btn_ä��_����.setContentAreaFilled(false);
		btn_ä��_����.setBorderPainted(false);
		btn_ä��_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipeä��_���� frame = new Recipeä��_����();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_ä��_����.setBounds(91, 119, 161, 41);
		contentPane.add(btn_ä��_����);
		
		JLabel lblNewLabel = new JLabel("\uCC44\uC18C/\uACFC\uC77C");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(91, 119, 161, 47);
		contentPane.add(lblNewLabel);
		
		JButton btn_���� = new JButton();
		btn_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe���� frame = new Recipe����();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_����.setFocusPainted(false);
		btn_����.setContentAreaFilled(false);
		btn_����.setBorderPainted(false);
		btn_����.setBounds(379, 119, 161, 41);
		contentPane.add(btn_����);
		
		JLabel label = new JLabel("\uC721\uB958");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		label.setBounds(379, 119, 161, 47);
		contentPane.add(label);
		
		JButton btn_���깰 = new JButton();
		btn_���깰.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 12));
		btn_���깰.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe���깰 frame = new Recipe���깰();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_���깰.setFocusPainted(false);
		btn_���깰.setContentAreaFilled(false);
		btn_���깰.setBorderPainted(false);
		btn_���깰.setBounds(91, 192, 161, 41);
		contentPane.add(btn_���깰);
		
		JLabel label_1 = new JLabel("\uC218\uC0B0\uBB3C");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		label_1.setBounds(91, 192, 161, 47);
		contentPane.add(label_1);
		
		JButton btn_�_�߰��� = new JButton();
		btn_�_�߰���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe�_�߰��� frame = new Recipe�_�߰���();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_�_�߰���.setFocusPainted(false);
		btn_�_�߰���.setContentAreaFilled(false);
		btn_�_�߰���.setBorderPainted(false);
		btn_�_�߰���.setBounds(379, 192, 182, 54);
		contentPane.add(btn_�_�߰���);
		
		JLabel label_2 = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		label_2.setBounds(356, 192, 214, 47);
		contentPane.add(label_2);
		
		JButton btn_���_�ҽ� = new JButton();
		btn_���_�ҽ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe���_�ҽ� frame = new Recipe���_�ҽ�();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_���_�ҽ�.setFocusPainted(false);
		btn_���_�ҽ�.setContentAreaFilled(false);
		btn_���_�ҽ�.setBorderPainted(false);
		btn_���_�ҽ�.setBounds(91, 261, 161, 41);
		contentPane.add(btn_���_�ҽ�);
		
		JLabel label_3 = new JLabel("\uC591\uB150/\uC18C\uC2A4");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		label_3.setBounds(91, 261, 161, 47);
		contentPane.add(label_3);
		
		JButton btn_����_����ǰ = new JButton();
		btn_����_����ǰ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe����_����ǰ frame = new Recipe����_����ǰ();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_����_����ǰ.setFocusPainted(false);
		btn_����_����ǰ.setContentAreaFilled(false);
		btn_����_����ǰ.setBorderPainted(false);
		btn_����_����ǰ.setBounds(79, 330, 189, 47);
		contentPane.add(btn_����_����ǰ);
		
		JLabel label_4 = new JLabel("\uAC00\uACF5/\uC720\uC81C\uD488");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		label_4.setBounds(79, 318, 189, 59);
		contentPane.add(label_4);
		
		JButton btn_��Ÿ = new JButton();
		btn_��Ÿ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe��Ÿ frame = new Recipe��Ÿ();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_��Ÿ.setFocusPainted(false);
		btn_��Ÿ.setContentAreaFilled(false);
		btn_��Ÿ.setBorderPainted(false);
		btn_��Ÿ.setBounds(379, 255, 161, 41);
		contentPane.add(btn_��Ÿ);
		
		JLabel label_5 = new JLabel("\uAE30\uD0C0");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		label_5.setBounds(379, 255, 161, 47);
		contentPane.add(label_5);
	}
}
