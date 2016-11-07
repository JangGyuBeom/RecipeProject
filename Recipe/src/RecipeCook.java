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
		btn_search.setBorderPainted(false); 	//투명 버튼
		btn_search.setFocusPainted(false);		//투명 버튼
		btn_search.setContentAreaFilled(false); //투명 버튼
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
		textField.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		textField.setColumns(10);
		textField.setBounds(198, 21, 321, 54);
		contentPane.add(textField);
		
		JButton btn_채소_과일 = new JButton();
		btn_채소_과일.setFocusPainted(false);
		btn_채소_과일.setContentAreaFilled(false);
		btn_채소_과일.setBorderPainted(false);
		btn_채소_과일.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe채소_과일 frame = new Recipe채소_과일();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_채소_과일.setBounds(91, 119, 161, 41);
		contentPane.add(btn_채소_과일);
		
		JLabel lblNewLabel = new JLabel("\uCC44\uC18C/\uACFC\uC77C");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(91, 119, 161, 47);
		contentPane.add(lblNewLabel);
		
		JButton btn_육류 = new JButton();
		btn_육류.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe육류 frame = new Recipe육류();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_육류.setFocusPainted(false);
		btn_육류.setContentAreaFilled(false);
		btn_육류.setBorderPainted(false);
		btn_육류.setBounds(379, 119, 161, 41);
		contentPane.add(btn_육류);
		
		JLabel label = new JLabel("\uC721\uB958");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		label.setBounds(379, 119, 161, 47);
		contentPane.add(label);
		
		JButton btn_수산물 = new JButton();
		btn_수산물.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 12));
		btn_수산물.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe수산물 frame = new Recipe수산물();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_수산물.setFocusPainted(false);
		btn_수산물.setContentAreaFilled(false);
		btn_수산물.setBorderPainted(false);
		btn_수산물.setBounds(91, 192, 161, 41);
		contentPane.add(btn_수산물);
		
		JLabel label_1 = new JLabel("\uC218\uC0B0\uBB3C");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		label_1.setBounds(91, 192, 161, 47);
		contentPane.add(label_1);
		
		JButton btn_곡물_견과류 = new JButton();
		btn_곡물_견과류.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe곡물_견과류 frame = new Recipe곡물_견과류();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_곡물_견과류.setFocusPainted(false);
		btn_곡물_견과류.setContentAreaFilled(false);
		btn_곡물_견과류.setBorderPainted(false);
		btn_곡물_견과류.setBounds(379, 192, 182, 54);
		contentPane.add(btn_곡물_견과류);
		
		JLabel label_2 = new JLabel("\uACE1\uBB3C/\uACAC\uACFC\uB958");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		label_2.setBounds(356, 192, 214, 47);
		contentPane.add(label_2);
		
		JButton btn_양념_소스 = new JButton();
		btn_양념_소스.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe양념_소스 frame = new Recipe양념_소스();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_양념_소스.setFocusPainted(false);
		btn_양념_소스.setContentAreaFilled(false);
		btn_양념_소스.setBorderPainted(false);
		btn_양념_소스.setBounds(91, 261, 161, 41);
		contentPane.add(btn_양념_소스);
		
		JLabel label_3 = new JLabel("\uC591\uB150/\uC18C\uC2A4");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		label_3.setBounds(91, 261, 161, 47);
		contentPane.add(label_3);
		
		JButton btn_가공_유제품 = new JButton();
		btn_가공_유제품.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe가공_유제품 frame = new Recipe가공_유제품();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_가공_유제품.setFocusPainted(false);
		btn_가공_유제품.setContentAreaFilled(false);
		btn_가공_유제품.setBorderPainted(false);
		btn_가공_유제품.setBounds(79, 330, 189, 47);
		contentPane.add(btn_가공_유제품);
		
		JLabel label_4 = new JLabel("\uAC00\uACF5/\uC720\uC81C\uD488");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		label_4.setBounds(79, 318, 189, 59);
		contentPane.add(label_4);
		
		JButton btn_기타 = new JButton();
		btn_기타.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipe기타 frame = new Recipe기타();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_기타.setFocusPainted(false);
		btn_기타.setContentAreaFilled(false);
		btn_기타.setBorderPainted(false);
		btn_기타.setBounds(379, 255, 161, 41);
		contentPane.add(btn_기타);
		
		JLabel label_5 = new JLabel("\uAE30\uD0C0");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		label_5.setBounds(379, 255, 161, 47);
		contentPane.add(label_5);
	}
}
