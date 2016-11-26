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
		
		JLabel lb_��� = new JLabel("\uC7AC\uB8CC");
		lb_���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_���.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_���.setBounds(31, 23, 136, 50);
		contentPane.add(lb_���);
		
		JLabel lb_��Ʈ = new JLabel("\uBE45\uB9C8\uD2B8");
		lb_��Ʈ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��Ʈ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 25));
		lb_��Ʈ.setBounds(231, 23, 79, 50);
		contentPane.add(lb_��Ʈ);
		
		JLabel lb_Ȩ��Ʈ = new JLabel("\uD648\uB9C8\uD2B8");
		lb_Ȩ��Ʈ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_Ȩ��Ʈ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 25));
		lb_Ȩ��Ʈ.setBounds(334, 23, 79, 50);
		contentPane.add(lb_Ȩ��Ʈ);
		
		JLabel lb_������Ʈ = new JLabel("\uD3EC\uC2A4\uB9C8\uD2B8");
		lb_������Ʈ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_������Ʈ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 19));
		lb_������Ʈ.setBounds(439, 23, 79, 50);
		contentPane.add(lb_������Ʈ);
		
		JScrollPane sp_��� = new JScrollPane();
		sp_���.setBounds(31, 83, 136, 394);
		contentPane.add(sp_���);
		
		JTextArea ta_��� = new JTextArea();
		sp_���.setViewportView(ta_���);

		JScrollPane sp_��Ʈ = new JScrollPane();
		sp_��Ʈ.setBounds(231, 83, 79, 394);
		contentPane.add(sp_��Ʈ);
		
		JTextArea ta_��Ʈ = new JTextArea();
		sp_��Ʈ.setViewportView(ta_��Ʈ);
		
		JScrollPane sp_Ȩ��Ʈ = new JScrollPane();
		sp_Ȩ��Ʈ.setBounds(334, 83, 79, 394);
		contentPane.add(sp_Ȩ��Ʈ);
		
		JTextArea ta_Ȩ��Ʈ = new JTextArea();
		sp_Ȩ��Ʈ.setViewportView(ta_Ȩ��Ʈ);
		
		JScrollPane sp_������Ʈ = new JScrollPane();
		sp_������Ʈ.setBounds(439, 83, 79, 394);
		contentPane.add(sp_������Ʈ);
		
		JTextArea ta_������Ʈ = new JTextArea();
		sp_������Ʈ.setViewportView(ta_������Ʈ);
	
		rb.RecipeCompareMaterialHandler(rName,ta_���,ta_��Ʈ,ta_Ȩ��Ʈ,ta_������Ʈ); 
		
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
