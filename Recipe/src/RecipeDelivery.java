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
		
		JButton btn_search = new JButton("");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_search.setFocusPainted(false);
		btn_search.setContentAreaFilled(false);
		btn_search.setBorderPainted(false);
		btn_search.setBounds(652, 10, 87, 63);
		contentPane.add(btn_search);
		
		
		JLabel money_image = new JLabel(image.Money);
		money_image.setHorizontalAlignment(SwingConstants.CENTER);
		money_image.setBounds(12, 21, 202, 59);
		contentPane.add(money_image);
		
		JLabel search_image = new JLabel(image.Search);
		search_image.setBounds(662, 19, 67, 61);
		contentPane.add(search_image);
		
		JLabel back_image = new JLabel(image.Back);
		back_image.setBounds(12, 713, 50, 41);
		contentPane.add(back_image);
		
		textField = new JTextField();
		
		textField.setBackground(new Color(245, 245, 245));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("�޸յձ�������", Font.PLAIN, 38));
		textField.setBounds(204, 21, 436, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_�߽� = new JButton(image.�߽�1);
		btn_�߽�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_�߽�.setBounds(62, 116, 290, 105);
		contentPane.add(btn_�߽�);
		
		JButton btn_ġŲ = new JButton(image.ġŲ1);
	
		btn_ġŲ.setBounds(427, 116, 290, 105);
		contentPane.add(btn_ġŲ);
		
		JButton btn_�Ͻ� = new JButton(image.�Ͻ�1);
		btn_�Ͻ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_�Ͻ�.setBounds(62, 259, 290, 105);
		contentPane.add(btn_�Ͻ�);
		
		JButton btn_�ѽ�_�н� = new JButton(image.�н�1);
		btn_�ѽ�_�н�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_�ѽ�_�н�.setBounds(427, 259, 290, 105);
		contentPane.add(btn_�ѽ�_�н�);
		
		JButton btn_����_���� = new JButton(image.����1);
		btn_����_����.setBounds(427, 410, 290, 105);
		contentPane.add(btn_����_����);
		
		JButton btn_���� = new JButton(image.����1);
		btn_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_����.setBounds(427, 557, 290, 105);
		contentPane.add(btn_����);
		
		JButton btn_��� = new JButton(image.���1);
		btn_���.setBounds(62, 410, 290, 105);
		contentPane.add(btn_���);
		
		JButton btn_��_�� = new JButton(image.��1);
		btn_��_��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_��_��.setBounds(62, 557, 290, 105);
		contentPane.add(btn_��_��);
	}
}
