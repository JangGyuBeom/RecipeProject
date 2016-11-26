import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DeliveryResult extends JFrame {

	private JPanel contentPane;
	
	public DeliveryResult(Vector vec, Integer price) {
		
		RecipeImage image = new RecipeImage();
		DeliveryResultButtonHandler drsult = new DeliveryResultButtonHandler();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1233, 478);
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

		JScrollPane sp_가게이름 = new JScrollPane();
		sp_가게이름.setBounds(30, 82, 217, 297);
		contentPane.add(sp_가게이름);
		JList list_가게이름 = new JList();
		list_가게이름.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		list_가게이름.setListData(vec);

		list_가게이름.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sp_가게이름.setViewportView(list_가게이름);

		JScrollPane sp_배달가능 = new JScrollPane();
		sp_배달가능.setBounds(299, 82, 195, 297);
		contentPane.add(sp_배달가능);

		JTextArea list_배달가능 = new JTextArea();
		sp_배달가능.setViewportView(list_배달가능);
		
		JScrollPane sp_전체메뉴 = new JScrollPane();
		sp_전체메뉴.setBounds(654, 82, 195, 297);
		contentPane.add(sp_전체메뉴);
		
		JTextArea list_전체메뉴 = new JTextArea();
		sp_전체메뉴.setViewportView(list_전체메뉴);

		JTextField tf_전화번호 = new JTextField();
		tf_전화번호.setHorizontalAlignment(SwingConstants.CENTER);
		tf_전화번호.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
		tf_전화번호.setBounds(1009, 82, 157, 35);
		contentPane.add(tf_전화번호);
		tf_전화번호.setColumns(10);
		
		JLabel lb_가게이름 = new JLabel("\uAC00\uAC8C \uC774\uB984");
		lb_가게이름.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가게이름.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_가게이름.setBounds(30, 22, 217, 50);
		contentPane.add(lb_가게이름);
		
		JLabel lb_배달가능 = new JLabel("\uBC30\uB2EC \uAC00\uB2A5 \uBA54\uB274");
		lb_배달가능.setHorizontalAlignment(SwingConstants.CENTER);
		lb_배달가능.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_배달가능.setBounds(299, 22, 195, 50);
		contentPane.add(lb_배달가능);
		
		JLabel lb_전화번호 = new JLabel("\uC804\uD654 \uBC88\uD638");
		lb_전화번호.setHorizontalAlignment(SwingConstants.CENTER);
		lb_전화번호.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_전화번호.setBounds(1009, 22, 157, 50);
		contentPane.add(lb_전화번호);
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 389, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 389, 50, 41);
		contentPane.add(lb_back);
		
		JLabel lb_전체메뉴 = new JLabel("\uC804\uCCB4 \uBA54\uB274");
		lb_전체메뉴.setHorizontalAlignment(SwingConstants.CENTER);
		lb_전체메뉴.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_전체메뉴.setBounds(654, 22, 195, 50);
		contentPane.add(lb_전체메뉴);
		
		JScrollPane sp_가격 = new JScrollPane();
		sp_가격.setBounds(506, 82, 92, 297);
		contentPane.add(sp_가격);
		
		JTextArea ta_가격 = new JTextArea();
		sp_가격.setViewportView(ta_가격);
		
		JScrollPane sp_가격2 = new JScrollPane();
		sp_가격2.setBounds(861, 82, 92, 297);
		contentPane.add(sp_가격2);
		
		JTextArea ta_가격2 = new JTextArea();
		sp_가격2.setViewportView(ta_가격2);
		
		JLabel lb_가격 = new JLabel("\uAC00\uACA9");
		lb_가격.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가격.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_가격.setBounds(506, 22, 92, 50);
		contentPane.add(lb_가격);
		
		JLabel lb_가격2 = new JLabel("\uAC00\uACA9");
		lb_가격2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가격2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_가격2.setBounds(861, 22, 92, 50);
		contentPane.add(lb_가격2);

		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 24, 227, 215);
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String name;
				
				if (!e.getValueIsAdjusting()) {
					name = (String) list_가게이름.getSelectedValue();
					drsult.DeliveryResultHandler(name,tf_전화번호,list_배달가능,price,list_전체메뉴,ta_가격,ta_가격2);
				}
			}
		};
		list_가게이름.addListSelectionListener(ls);
	}
}