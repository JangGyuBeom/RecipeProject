import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeCompareMaterial extends JFrame {

	private JPanel contentPane;

	
	public RecipeCompareMaterial(String rName) {
		
		RecipeImage image = new RecipeImage();
		RecipeResultButtonHandler rb = new RecipeResultButtonHandler();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 595);
		contentPane = new JPanel(){
 			public void paintComponent(Graphics g){
 				g.drawImage(image.background_ora.getImage(),0,0,null);
 				setOpaque(false);
 				super.paintComponent(g);
 			}
 		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_재료 = new JLabel("\uC7AC\uB8CC");
		lb_재료.setHorizontalAlignment(SwingConstants.CENTER);
		lb_재료.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_재료.setBounds(31, 23, 136, 50);
		contentPane.add(lb_재료);
		
		JLabel lb_빅마트 = new JLabel("\uBE45\uB9C8\uD2B8");
		lb_빅마트.setHorizontalAlignment(SwingConstants.CENTER);
		lb_빅마트.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		lb_빅마트.setBounds(231, 23, 79, 50);
		contentPane.add(lb_빅마트);
		
		JLabel lb_홈마트 = new JLabel("\uD648\uB9C8\uD2B8");
		lb_홈마트.setHorizontalAlignment(SwingConstants.CENTER);
		lb_홈마트.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		lb_홈마트.setBounds(334, 23, 79, 50);
		contentPane.add(lb_홈마트);
		
		JLabel lb_포스마트 = new JLabel("\uD3EC\uC2A4\uB9C8\uD2B8");
		lb_포스마트.setHorizontalAlignment(SwingConstants.CENTER);
		lb_포스마트.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 19));
		lb_포스마트.setBounds(439, 23, 79, 50);
		contentPane.add(lb_포스마트);
		
		JScrollPane sp_재료 = new JScrollPane();
		sp_재료.setBounds(31, 83, 136, 394);
		contentPane.add(sp_재료);
		
		JTextArea ta_재료 = new JTextArea();
		sp_재료.setViewportView(ta_재료);

		JScrollPane sp_빅마트 = new JScrollPane();
		sp_빅마트.setBounds(231, 83, 79, 394);
		contentPane.add(sp_빅마트);
		
		JTextArea ta_빅마트 = new JTextArea();
		sp_빅마트.setViewportView(ta_빅마트);
		
		JScrollPane sp_홈마트 = new JScrollPane();
		sp_홈마트.setBounds(334, 83, 79, 394);
		contentPane.add(sp_홈마트);
		
		JTextArea ta_홈마트 = new JTextArea();
		sp_홈마트.setViewportView(ta_홈마트);
		
		JScrollPane sp_포스마트 = new JScrollPane();
		sp_포스마트.setBounds(439, 83, 79, 394);
		contentPane.add(sp_포스마트);
		
		JTextArea ta_포스마트 = new JTextArea();
		sp_포스마트.setViewportView(ta_포스마트);
	
		rb.RecipeCompareMaterialHandler(rName,ta_재료,ta_빅마트,ta_홈마트,ta_포스마트); 
		
		JButton btn_back = new JButton(image.Back);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 506, 50, 41);
		contentPane.add(btn_back);
	}
}
