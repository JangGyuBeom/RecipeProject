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

		JScrollPane sp_�����̸� = new JScrollPane();
		sp_�����̸�.setBounds(30, 82, 217, 297);
		contentPane.add(sp_�����̸�);
		JList list_�����̸� = new JList();
		list_�����̸�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 15));
		list_�����̸�.setListData(vec);

		list_�����̸�.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sp_�����̸�.setViewportView(list_�����̸�);

		JScrollPane sp_��ް��� = new JScrollPane();
		sp_��ް���.setBounds(299, 82, 195, 297);
		contentPane.add(sp_��ް���);

		JTextArea list_��ް��� = new JTextArea();
		sp_��ް���.setViewportView(list_��ް���);
		
		JScrollPane sp_��ü�޴� = new JScrollPane();
		sp_��ü�޴�.setBounds(654, 82, 195, 297);
		contentPane.add(sp_��ü�޴�);
		
		JTextArea list_��ü�޴� = new JTextArea();
		sp_��ü�޴�.setViewportView(list_��ü�޴�);

		JTextField tf_��ȭ��ȣ = new JTextField();
		tf_��ȭ��ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		tf_��ȭ��ȣ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 14));
		tf_��ȭ��ȣ.setBounds(1009, 82, 157, 35);
		contentPane.add(tf_��ȭ��ȣ);
		tf_��ȭ��ȣ.setColumns(10);
		
		JLabel lb_�����̸� = new JLabel("\uAC00\uAC8C \uC774\uB984");
		lb_�����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�����̸�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_�����̸�.setBounds(30, 22, 217, 50);
		contentPane.add(lb_�����̸�);
		
		JLabel lb_��ް��� = new JLabel("\uBC30\uB2EC \uAC00\uB2A5 \uBA54\uB274");
		lb_��ް���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��ް���.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_��ް���.setBounds(299, 22, 195, 50);
		contentPane.add(lb_��ް���);
		
		JLabel lb_��ȭ��ȣ = new JLabel("\uC804\uD654 \uBC88\uD638");
		lb_��ȭ��ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��ȭ��ȣ.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_��ȭ��ȣ.setBounds(1009, 22, 157, 50);
		contentPane.add(lb_��ȭ��ȣ);
		
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
		
		JLabel lb_��ü�޴� = new JLabel("\uC804\uCCB4 \uBA54\uB274");
		lb_��ü�޴�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��ü�޴�.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_��ü�޴�.setBounds(654, 22, 195, 50);
		contentPane.add(lb_��ü�޴�);
		
		JScrollPane sp_���� = new JScrollPane();
		sp_����.setBounds(506, 82, 92, 297);
		contentPane.add(sp_����);
		
		JTextArea ta_���� = new JTextArea();
		sp_����.setViewportView(ta_����);
		
		JScrollPane sp_����2 = new JScrollPane();
		sp_����2.setBounds(861, 82, 92, 297);
		contentPane.add(sp_����2);
		
		JTextArea ta_����2 = new JTextArea();
		sp_����2.setViewportView(ta_����2);
		
		JLabel lb_���� = new JLabel("\uAC00\uACA9");
		lb_����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_����.setBounds(506, 22, 92, 50);
		contentPane.add(lb_����);
		
		JLabel lb_����2 = new JLabel("\uAC00\uACA9");
		lb_����2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����2.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 28));
		lb_����2.setBounds(861, 22, 92, 50);
		contentPane.add(lb_����2);

		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 24, 227, 215);
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String name;
				
				if (!e.getValueIsAdjusting()) {
					name = (String) list_�����̸�.getSelectedValue();
					drsult.DeliveryResultHandler(name,tf_��ȭ��ȣ,list_��ް���,price,list_��ü�޴�,ta_����,ta_����2);
				}
			}
		};
		list_�����̸�.addListSelectionListener(ls);
	}
}