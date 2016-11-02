import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

	/**
	 * Create the frame.
	 */
	public RecipeSwing() {
		ImageIcon Del = new ImageIcon("Image/테두리.png");
		ImageIcon Cook = new ImageIcon("Image/Cook.jpeg");
		ImageIcon Send = new ImageIcon("Image/Send.jpg");
		ImageIcon background = new ImageIcon("Image/배경.png");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 582);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(background.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(Cook);
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(12, 10, 390, 179);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(Del);
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(439, 10, 390, 179);
		contentPane.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("\uBB38\uC758\uC0AC\uD56D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("궁서체", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 240, 113, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton(Send);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"전송 완료");
				
			}
		});
		btnNewButton_2.setBounds(680, 234, 149, 72);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(137, 234, 531, 72);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel label = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("궁서체", Font.PLAIN, 18));
		label.setBounds(12, 327, 140, 37);
		contentPane.add(label);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(12, 363, 817, 138);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnNewButton_3 = new JButton("\uB05D\uB0B4\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(749, 511, 80, 23);
		contentPane.add(btnNewButton_3);
	}
}
