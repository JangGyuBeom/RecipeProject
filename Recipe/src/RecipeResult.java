import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RecipeResult extends JFrame {

	private JPanel contentPane;
	String rName;
	

	public RecipeResult(Vector<String> vec) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/RecipeLogo.png"));
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		RecipeResultButtonHandler rRsult = new RecipeResultButtonHandler();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 584);
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
		
		JScrollPane sp_요리 = new JScrollPane();
		sp_요리.setBounds(30, 70, 217, 406);
		contentPane.add(sp_요리);
		
		JList list_요리 = new JList();
		sp_요리.setViewportView(list_요리);
		list_요리.setListData(vec);
		
		JScrollPane sp_레시피 = new JScrollPane();
		sp_레시피.setBounds(270, 253, 708, 223);
		contentPane.add(sp_레시피);
		
		JTextArea ta_레시피 = new JTextArea();
		ta_레시피.setLineWrap(true);
		sp_레시피.setViewportView(ta_레시피);
		
		JLabel lb_요리 = new JLabel("\uC694\uB9AC");
		lb_요리.setHorizontalAlignment(SwingConstants.CENTER);
		lb_요리.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_요리.setBounds(30, 10, 217, 50);
		contentPane.add(lb_요리);
		
		JLabel lb_레시피 = new JLabel("\uB808\uC2DC\uD53C");
		lb_레시피.setHorizontalAlignment(SwingConstants.CENTER);
		lb_레시피.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_레시피.setBounds(270, 193, 708, 50);
		contentPane.add(lb_레시피);
		
		JButton btn_back = new JButton(image.Back);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vec.clear();
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 495, 50, 41);
		contentPane.add(btn_back);
		
		JScrollPane sp_필요재료 = new JScrollPane();
		sp_필요재료.setBounds(532, 70, 238, 113);
		contentPane.add(sp_필요재료);
		
		JTextArea ta_필요재료 = new JTextArea();
		ta_필요재료.setLineWrap(true);
		sp_필요재료.setViewportView(ta_필요재료);
		
		JLabel lb_선택재료 = new JLabel("\uC120\uD0DD\uD55C \uC7AC\uB8CC");
		lb_선택재료.setHorizontalAlignment(SwingConstants.CENTER);
		lb_선택재료.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_선택재료.setBounds(270, 10, 238, 50);
		contentPane.add(lb_선택재료);
		
		JTextField tf_예상시간 = new JTextField();
		tf_예상시간.setHorizontalAlignment(SwingConstants.CENTER);
		tf_예상시간.setBounds(786, 70, 192, 29);
		contentPane.add(tf_예상시간);
		tf_예상시간.setColumns(10);
		
		JLabel lb_예상시간 = new JLabel("\uC608\uC0C1 \uC2DC\uAC04");
		lb_예상시간.setHorizontalAlignment(SwingConstants.CENTER);
		lb_예상시간.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_예상시간.setBounds(786, 10, 192, 50);
		contentPane.add(lb_예상시간);
		
		JScrollPane sp_선택재료 = new JScrollPane();
		sp_선택재료.setBounds(270, 70, 238, 113);
		contentPane.add(sp_선택재료);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		sp_선택재료.setViewportView(textArea_2);
		
		for(int i=0; i < M.Material.size(); i++){
			textArea_2.append(M.Material.get(i)+"  ");
		}
		
		JLabel lb_필요재료 = new JLabel("\uD544\uC694 \uC7AC\uB8CC");
		lb_필요재료.setHorizontalAlignment(SwingConstants.CENTER);
		lb_필요재료.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_필요재료.setBounds(563, 10, 158, 50);
		contentPane.add(lb_필요재료);
		
		JLabel lb_추가비용 = new JLabel("\uC608\uC0C1 \uCD94\uAC00 \uBE44\uC6A9");
		lb_추가비용.setHorizontalAlignment(SwingConstants.CENTER);
		lb_추가비용.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lb_추가비용.setBounds(786, 99, 192, 50);
		contentPane.add(lb_추가비용);
		
		JTextField tf_추가비용 = new JTextField();
		tf_추가비용.setHorizontalAlignment(SwingConstants.CENTER);
		tf_추가비용.setColumns(10);
		tf_추가비용.setBounds(786, 154, 192, 29);		
		contentPane.add(tf_추가비용);
			
		
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String str;
				if (!e.getValueIsAdjusting()) {
					str = (String) list_요리.getSelectedValue();
					rName = str; 
					rRsult.RecipeResultHandler(str,ta_필요재료,ta_레시피,tf_예상시간,tf_추가비용);
				}
			}
		};
		list_요리.addListSelectionListener(ls);
		
		JButton btn_마트별가격 = new JButton(image.ComMoney);
		btn_마트별가격.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								RecipeCompareMaterial frame = new RecipeCompareMaterial(rName); 
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
		});
		btn_마트별가격.setFocusPainted(false);
		btn_마트별가격.setContentAreaFilled(false);
		btn_마트별가격.setBorderPainted(false);
		btn_마트별가격.setBounds(720, 13, 33, 47);
		contentPane.add(btn_마트별가격);
	}
}
