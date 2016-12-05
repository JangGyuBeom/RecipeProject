import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeShowinquires extends JFrame {

	private JPanel contentPane;


	public RecipeShowinquires() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/RecipeLogo.png"));
		RecipeImage image = new RecipeImage();
		ShowInquiresButtonHandler sinq = new ShowInquiresButtonHandler();
		ShowInquiresConnection sc = new ShowInquiresConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 403);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(image.background_gr.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
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
		btn_back.setBounds(12, 314, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 314, 50, 41);
		contentPane.add(lb_back);
		
		JScrollPane sp_문의창 = new JScrollPane();
		sp_문의창.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp_문의창.setBounds(12, 22, 537, 283);
		contentPane.add(sp_문의창);
		
		JTextArea ta_문의창 = new JTextArea();
		ta_문의창.setFont(new Font("바탕", Font.BOLD, 17));
		

		
		sc.makeSQL(ta_문의창);
		sp_문의창.setViewportView(ta_문의창);
		
		JButton btn_문의삭제 = new JButton();
		btn_문의삭제.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinq.deletehandler();
			}
		});
		btn_문의삭제.setFocusPainted(false);
		btn_문의삭제.setContentAreaFilled(false);
		btn_문의삭제.setBorderPainted(false);
		btn_문의삭제.setBounds(446, 314, 103, 41);
		contentPane.add(btn_문의삭제);
		
		JLabel lb_문의삭제 = new JLabel("\uBB38\uC758\uC0AD\uC81C");
		lb_문의삭제.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 17));
		lb_문의삭제.setHorizontalAlignment(SwingConstants.CENTER);
		lb_문의삭제.setBounds(446, 314, 103, 41);
		contentPane.add(lb_문의삭제);
	}
}
