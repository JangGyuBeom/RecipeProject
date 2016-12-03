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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Recipeinquires extends JFrame {

	private JPanel contentPane;
	
	public Recipeinquires() {
		
		RecipeImage image = new RecipeImage();
		WriteInquiresButtonHandler inq = new WriteInquiresButtonHandler();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 411);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(image.background_gr.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane sp_문의창 = new JScrollPane();
		sp_문의창.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp_문의창.setBounds(12, 10, 411, 309);
		contentPane.add(sp_문의창);
		
		JTextArea ta_문의창 = new JTextArea();
		ta_문의창.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		sp_문의창.setViewportView(ta_문의창);
		
		JButton btn_Send = new JButton("");
		btn_Send.setBorderPainted(false); 	
		btn_Send.setFocusPainted(false);	
		btn_Send.setContentAreaFilled(false); 
		btn_Send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inq.sendhandler(ta_문의창);
				
			}
		});
		btn_Send.setBounds(293, 321, 130, 42);
		contentPane.add(btn_Send);
		
		JButton btn_back = new JButton();
		btn_back.setBorderPainted(false); 	
		btn_back.setFocusPainted(false);		
		btn_back.setContentAreaFilled(false); 
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setBounds(12, 322, 50, 41);
		contentPane.add(btn_back);
		
		JLabel Send_Image = new JLabel(image.Send);
		Send_Image.setBounds(291, 321, 162, 44);
		contentPane.add(Send_Image);
		
		JLabel back_Image = new JLabel(image.Back);
		back_Image.setBounds(12, 322, 50, 41);
		contentPane.add(back_Image);
	}
}
