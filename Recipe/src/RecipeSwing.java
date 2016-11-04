import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeSwing frame = new RecipeSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public RecipeSwing() {
		ImageIcon Del = new ImageIcon("Image/delivery.png");
		ImageIcon Cook = new ImageIcon("Image/Cook.png");
		ImageIcon exit = new ImageIcon("Image/종료.png");
		ImageIcon inq = new ImageIcon("Image/문의.png");
		ImageIcon Not = new ImageIcon("Image/notice.png");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 653);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(190, 385, 734, 159);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setBackground(new Color(255, 250, 205));
		
		JButton btn_Recipe = new JButton();
		btn_Recipe.setBorderPainted(false); 	//투명 버튼
		btn_Recipe.setFocusPainted(false);		//투명 버튼
		btn_Recipe.setContentAreaFilled(false); //투명 버튼
		btn_Recipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btn_Recipe.setForeground(Color.BLACK);
		btn_Recipe.setBounds(137, 53, 265, 280);
		contentPane.add(btn_Recipe);
		
		JButton btn_Exit = new JButton();
		btn_Exit.setForeground(Color.BLACK);
		btn_Exit.setBackground(Color.WHITE);
		btn_Exit.setBorderPainted(false); 	//투명 버튼
		btn_Exit.setFocusPainted(false);		//투명 버튼
		btn_Exit.setContentAreaFilled(false); //투명 버튼
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton btn_delivery = new JButton();
		btn_delivery.setBorderPainted(false); 	//투명 버튼
		btn_delivery.setFocusPainted(false);		//투명 버튼
		btn_delivery.setContentAreaFilled(false); //투명 버튼
		btn_delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btn_delivery.setBounds(569, 62, 278, 271);
		contentPane.add(btn_delivery);
		
		JButton btn_Inquire = new JButton();
		btn_Inquire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Recipeinquires frame = new Recipeinquires();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btn_Inquire.setForeground(Color.BLACK);
		btn_Inquire.setFocusPainted(false);
		btn_Inquire.setContentAreaFilled(false);
		btn_Inquire.setBorderPainted(false);
		btn_Inquire.setBackground(Color.WHITE);
		btn_Inquire.setBounds(822, 554, 57, 51);
		contentPane.add(btn_Inquire);
		btn_Exit.setBounds(886, 554, 57, 51);
		contentPane.add(btn_Exit);
		
		JButton btn_manager = new JButton();
		btn_manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RecipeManager_connect frame = new RecipeManager_connect();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_manager.setFocusPainted(false);
		btn_manager.setContentAreaFilled(false);
		btn_manager.setBorderPainted(false);
		btn_manager.setBounds(35, 402, 131, 120);
		contentPane.add(btn_manager);
		
		JLabel Exit_image = new JLabel(exit);
		Exit_image.setBounds(886, 557, 57, 48);
		contentPane.add(Exit_image);
		
		JLabel inquire_image = new JLabel(inq);
		inquire_image.setBounds(822, 559, 58, 46);
		contentPane.add(inquire_image);
		
		JLabel Recipe_image = new JLabel(Cook);
		Recipe_image.setBounds(152, 62, 259, 271);
		contentPane.add(Recipe_image);
		
		JLabel delivery_image = new JLabel(Del);
		delivery_image.setBounds(592, 73, 287, 260);
		contentPane.add(delivery_image);
		
		JLabel notice_image = new JLabel(Not);
		notice_image.setHorizontalAlignment(SwingConstants.LEFT);
		notice_image.setFont(new Font("궁서체", Font.PLAIN, 18));
		notice_image.setBounds(35, 402, 131, 120);
		contentPane.add(notice_image);
	}
}
