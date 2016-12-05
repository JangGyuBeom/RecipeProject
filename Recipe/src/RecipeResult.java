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
		
		JScrollPane sp_�丮 = new JScrollPane();
		sp_�丮.setBounds(30, 70, 217, 406);
		contentPane.add(sp_�丮);
		
		JList list_�丮 = new JList();
		sp_�丮.setViewportView(list_�丮);
		list_�丮.setListData(vec);
		
		JScrollPane sp_������ = new JScrollPane();
		sp_������.setBounds(270, 253, 708, 223);
		contentPane.add(sp_������);
		
		JTextArea ta_������ = new JTextArea();
		ta_������.setLineWrap(true);
		sp_������.setViewportView(ta_������);
		
		JLabel lb_�丮 = new JLabel("\uC694\uB9AC");
		lb_�丮.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�丮.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_�丮.setBounds(30, 10, 217, 50);
		contentPane.add(lb_�丮);
		
		JLabel lb_������ = new JLabel("\uB808\uC2DC\uD53C");
		lb_������.setHorizontalAlignment(SwingConstants.CENTER);
		lb_������.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_������.setBounds(270, 193, 708, 50);
		contentPane.add(lb_������);
		
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
		
		JScrollPane sp_�ʿ���� = new JScrollPane();
		sp_�ʿ����.setBounds(532, 70, 238, 113);
		contentPane.add(sp_�ʿ����);
		
		JTextArea ta_�ʿ���� = new JTextArea();
		ta_�ʿ����.setLineWrap(true);
		sp_�ʿ����.setViewportView(ta_�ʿ����);
		
		JLabel lb_������� = new JLabel("\uC120\uD0DD\uD55C \uC7AC\uB8CC");
		lb_�������.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�������.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_�������.setBounds(270, 10, 238, 50);
		contentPane.add(lb_�������);
		
		JTextField tf_����ð� = new JTextField();
		tf_����ð�.setHorizontalAlignment(SwingConstants.CENTER);
		tf_����ð�.setBounds(786, 70, 192, 29);
		contentPane.add(tf_����ð�);
		tf_����ð�.setColumns(10);
		
		JLabel lb_����ð� = new JLabel("\uC608\uC0C1 \uC2DC\uAC04");
		lb_����ð�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����ð�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_����ð�.setBounds(786, 10, 192, 50);
		contentPane.add(lb_����ð�);
		
		JScrollPane sp_������� = new JScrollPane();
		sp_�������.setBounds(270, 70, 238, 113);
		contentPane.add(sp_�������);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		sp_�������.setViewportView(textArea_2);
		
		for(int i=0; i < M.Material.size(); i++){
			textArea_2.append(M.Material.get(i)+"  ");
		}
		
		JLabel lb_�ʿ���� = new JLabel("\uD544\uC694 \uC7AC\uB8CC");
		lb_�ʿ����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�ʿ����.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_�ʿ����.setBounds(563, 10, 158, 50);
		contentPane.add(lb_�ʿ����);
		
		JLabel lb_�߰���� = new JLabel("\uC608\uC0C1 \uCD94\uAC00 \uBE44\uC6A9");
		lb_�߰����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�߰����.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_�߰����.setBounds(786, 99, 192, 50);
		contentPane.add(lb_�߰����);
		
		JTextField tf_�߰���� = new JTextField();
		tf_�߰����.setHorizontalAlignment(SwingConstants.CENTER);
		tf_�߰����.setColumns(10);
		tf_�߰����.setBounds(786, 154, 192, 29);		
		contentPane.add(tf_�߰����);
			
		
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String str;
				if (!e.getValueIsAdjusting()) {
					str = (String) list_�丮.getSelectedValue();
					rName = str; 
					rRsult.RecipeResultHandler(str,ta_�ʿ����,ta_������,tf_����ð�,tf_�߰����);
				}
			}
		};
		list_�丮.addListSelectionListener(ls);
		
		JButton btn_��Ʈ������ = new JButton(image.ComMoney);
		btn_��Ʈ������.addActionListener(new ActionListener() {
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
		btn_��Ʈ������.setFocusPainted(false);
		btn_��Ʈ������.setContentAreaFilled(false);
		btn_��Ʈ������.setBorderPainted(false);
		btn_��Ʈ������.setBounds(720, 13, 33, 47);
		contentPane.add(btn_��Ʈ������);
	}
}
