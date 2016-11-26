import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeManager extends JFrame {

	private JPanel contentPane;
	
	public RecipeManager() {
		RecipeImage image = new RecipeImage();
		ManagerButtonHandler manager = new ManagerButtonHandler();
		ArrayList<String> mat = new ArrayList<String>();	//��� �̸� ����     ���� ��� ���� �ִµ� �׷��� Ŭ������ �ϳ��� �÷��� ����üó�� ��������.
		ArrayList<Integer> matprice = new ArrayList<Integer>();	//��� ���� ����		
		ArrayList<String> cat = new ArrayList<String>();	//ī�װ� ����
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 1063);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(image.background_bl.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_���Ǻ��� = new JButton();
		btn_���Ǻ���.setFocusPainted(false);
		btn_���Ǻ���.setContentAreaFilled(false);
		btn_���Ǻ���.setBorderPainted(false);
		btn_���Ǻ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.inquireshandler();
			}
		});
		btn_���Ǻ���.setBounds(32, 29, 158, 59);
		contentPane.add(btn_���Ǻ���);
		
		JLabel lb_�������� = new JLabel("\uACF5\uC9C0\uC0AC\uD56D : ");
		lb_��������.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��������.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 15));
		lb_��������.setBounds(12, 135, 107, 48);
		contentPane.add(lb_��������);
		
		JLabel lb_������ = new JLabel("\uB808\uC2DC\uD53C : ");
		lb_������.setHorizontalAlignment(SwingConstants.CENTER);
		lb_������.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 15));
		lb_������.setBounds(12, 340, 107, 48);
		contentPane.add(lb_������);
		
		JLabel lb_������� = new JLabel("\uBC30\uB2EC\uC74C\uC2DD : ");
		lb_�������.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�������.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 15));
		lb_�������.setBounds(12, 902, 107, 48);
		contentPane.add(lb_�������);
		
		JLabel lb_���Ǻ��� = new JLabel("���Ǻ���");
		lb_���Ǻ���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_���Ǻ���.setFont(new Font("Ÿ����_�ֹ��� B", Font.PLAIN, 30));
		lb_���Ǻ���.setBounds(32, 40, 158, 59);
		contentPane.add(lb_���Ǻ���);
		
		JComboBox cb_�������� = new JComboBox();  //��������
		cb_��������.setFont(new Font("����", Font.BOLD, 15));
		cb_��������.setModel(new DefaultComboBoxModel(new String[] {"���", "����", "����"}));
		cb_��������.setBounds(115, 135, 100, 48);
		((JLabel) cb_��������.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cb_��������);
		
		
		
		
		JComboBox cb_������ = new JComboBox(); //������
		cb_������.setFont(new Font("����", Font.BOLD, 15));
		cb_������.setModel(new DefaultComboBoxModel(new String[] {"���", "����", "����"}));
		cb_������.setBounds(115, 339, 100, 48);
		((JLabel) cb_������.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cb_������);
		
		JComboBox cb_������� = new JComboBox(); //���
		cb_�������.setFont(new Font("����", Font.BOLD, 15));
		cb_�������.setModel(new DefaultComboBoxModel(new String[] {"���", "����", "����"}));
		cb_�������.setBounds(115, 902, 100, 48);
		((JLabel) cb_�������.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cb_�������);
		

		
		JLabel lb_������ȣ = new JLabel("���� ��ȣ");
		lb_������ȣ.setFont(new Font("����", Font.BOLD, 14));
		lb_������ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_������ȣ.setBounds(302, 109, 93, 26);
		contentPane.add(lb_������ȣ);
		
		JTextField tf_������ȣ = new JTextField();
		tf_������ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		tf_������ȣ.setBounds(292, 145, 116, 21);
		contentPane.add(tf_������ȣ);
		tf_������ȣ.setColumns(10);
		
		
		
		JLabel lb_�������� = new JLabel("���� ����");
		lb_��������.setFont(new Font("����", Font.BOLD, 14));
		lb_��������.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��������.setBounds(588, 109, 93, 26);
		contentPane.add(lb_��������);
		
		JScrollPane sp_�������� = new JScrollPane();
		sp_��������.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp_��������.setBounds(502, 145, 274, 123);
		contentPane.add(sp_��������);
		
		JTextArea ta_�������� = new JTextArea();
		sp_��������.setViewportView(ta_��������);
		
		JButton btn_�������� = new JButton();
		btn_��������.setBorderPainted(false); 	//���� ��ư
		btn_��������.setFocusPainted(false);		//���� ��ư
		btn_��������.setContentAreaFilled(false); //���� ��ư
		btn_��������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.noticehandler(cb_��������, tf_������ȣ, ta_��������);
			}
		});
		btn_��������.setBounds(978, 145, 64, 57);
		contentPane.add(btn_��������);
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(12, 974, 50, 41);
		contentPane.add(btn_back);
		
		JLabel lb_back = new JLabel(image.Back);
		lb_back.setBounds(12, 974, 50, 41);
		contentPane.add(lb_back);
		
		JLabel lb_�����̸� = new JLabel("\uAC00\uAC8C\uC774\uB984");
		lb_�����̸�.setFont(new Font("����", Font.BOLD, 14));
		lb_�����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�����̸�.setBounds(266, 871, 93, 26);
		contentPane.add(lb_�����̸�);
		
		JLabel lb_�����̸� = new JLabel("\uC74C\uC2DD\uC774\uB984");
		lb_�����̸�.setFont(new Font("����", Font.BOLD, 14));
		lb_�����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�����̸�.setBounds(390, 871, 93, 26);
		contentPane.add(lb_�����̸�);
		
		JLabel lb_���� = new JLabel("\uAC00\uACA9");
		lb_����.setFont(new Font("����", Font.BOLD, 14));
		lb_����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����.setBounds(523, 871, 93, 26);
		contentPane.add(lb_����);
		
		JLabel lb_��ȭ��ȣ = new JLabel("\uC804\uD654\uBC88\uD638");
		lb_��ȭ��ȣ.setFont(new Font("����", Font.BOLD, 14));
		lb_��ȭ��ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��ȭ��ȣ.setBounds(648, 871, 93, 26);
		contentPane.add(lb_��ȭ��ȣ);
		
		JLabel lb_ī�װ� = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		lb_ī�װ�.setFont(new Font("����", Font.BOLD, 14));
		lb_ī�װ�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_ī�װ�.setBounds(789, 871, 93, 26);
		contentPane.add(lb_ī�װ�);
		
		JTextField tf_�����̸� = new JTextField();
		tf_�����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		tf_�����̸�.setColumns(10);
		tf_�����̸�.setBounds(257, 916, 116, 21);
		contentPane.add(tf_�����̸�);
		
		JTextField tf_�����̸� = new JTextField();
		tf_�����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		tf_�����̸�.setColumns(10);
		tf_�����̸�.setBounds(382, 916, 116, 21);
		contentPane.add(tf_�����̸�);
		
		JTextField tf_���� = new JTextField();
		tf_����.setHorizontalAlignment(SwingConstants.CENTER);
		tf_����.setColumns(10);
		tf_����.setBounds(513, 916, 116, 21);
		contentPane.add(tf_����);
		
		JTextField tf_��ȭ��ȣ = new JTextField();
		tf_��ȭ��ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		tf_��ȭ��ȣ.setColumns(10);
		tf_��ȭ��ȣ.setBounds(641, 916, 116, 21);
		contentPane.add(tf_��ȭ��ȣ);
		
		JTextField tf_ī�װ� = new JTextField();
		tf_ī�װ�.setHorizontalAlignment(SwingConstants.CENTER);
		tf_ī�װ�.setColumns(10);
		tf_ī�װ�.setBounds(780, 916, 116, 21);
		contentPane.add(tf_ī�װ�);
		
		JLabel lb_�����̸�2 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		lb_�����̸�2.setFont(new Font("����", Font.BOLD, 14));
		lb_�����̸�2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�����̸�2.setBounds(275, 309, 93, 26);
		contentPane.add(lb_�����̸�2);
		
		JLabel lb_����2 = new JLabel("\uAC00\uACA9");
		lb_����2.setFont(new Font("����", Font.BOLD, 14));
		lb_����2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����2.setBounds(399, 309, 93, 26);
		contentPane.add(lb_����2);
		
		JLabel lb_�丮���� = new JLabel("\uC694\uB9AC\uC21C\uC11C");
		lb_�丮����.setFont(new Font("����", Font.BOLD, 14));
		lb_�丮����.setHorizontalAlignment(SwingConstants.CENTER);
		lb_�丮����.setBounds(727, 309, 93, 26);
		contentPane.add(lb_�丮����);
		
		JLabel lb_����ð� = new JLabel("\uC608\uC0C1\uC2DC\uAC04");
		lb_����ð�.setFont(new Font("����", Font.BOLD, 14));
		lb_����ð�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����ð�.setBounds(530, 309, 93, 26);
		contentPane.add(lb_����ð�);
		
		JTextField tf_�����̸�2 = new JTextField();
		tf_�����̸�2.setHorizontalAlignment(SwingConstants.CENTER);
		tf_�����̸�2.setColumns(10);
		tf_�����̸�2.setBounds(266, 354, 116, 21);
		contentPane.add(tf_�����̸�2);
		
		JTextField tf_����2 = new JTextField();
		tf_����2.setHorizontalAlignment(SwingConstants.CENTER);
		tf_����2.setColumns(10);
		tf_����2.setBounds(391, 354, 116, 21);
		contentPane.add(tf_����2);
		
		JTextField tf_����ð� = new JTextField();
		tf_����ð�.setHorizontalAlignment(SwingConstants.CENTER);
		tf_����ð�.setColumns(10);
		tf_����ð�.setBounds(523, 354, 116, 21);
		contentPane.add(tf_����ð�);
		
		JScrollPane cp_�丮���� = new JScrollPane();
		cp_�丮����.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		cp_�丮����.setBounds(663, 354, 219, 192);
		contentPane.add(cp_�丮����);
		
		JTextArea ta_�丮���� = new JTextArea();
		cp_�丮����.setViewportView(ta_�丮����);
		
		JLabel lb_��������2 = new JLabel(image.modi);
		lb_��������2.setBounds(978, 145, 64, 57);
		contentPane.add(lb_��������2);
				
		JLabel lb_������2 = new JLabel(image.modi);
		lb_������2.setBounds(965, 545, 64, 57);
		contentPane.add(lb_������2);
		
		JButton btn_������� = new JButton();
		btn_�������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.deliveryhandler(cb_�������,tf_�����̸�,tf_�����̸�,tf_����,tf_��ȭ��ȣ,tf_ī�װ�);
			}
		});
		btn_�������.setFocusPainted(false);
		btn_�������.setContentAreaFilled(false);
		btn_�������.setBorderPainted(false);
		btn_�������.setBounds(978, 916, 64, 57);
		contentPane.add(btn_�������);
		
		JLabel lb_�������2 = new JLabel(image.modi);
		lb_�������2.setBounds(978, 916, 64, 57);
		contentPane.add(lb_�������2);
		
		
		JScrollPane sp_���ٱ��� = new JScrollPane();
		sp_���ٱ���.setBounds(663, 615, 219, 200);
		contentPane.add(sp_���ٱ���);
		
		JList list_���ٱ��� = new JList();
		sp_���ٱ���.setViewportView(list_���ٱ���);
		
		JComboBox cb_ī�װ� = new JComboBox();
		cb_ī�װ�.setModel(new DefaultComboBoxModel(new String[] {"\uCC44\uC18C_\uACFC\uC77C", "\uC721\uB958", "\uC218\uC0B0\uBB3C", "\uACE1\uBB3C_\uACAC\uACFC\uB958", "\uC591\uB150_\uC18C\uC2A4", "\uAC00\uACF5_\uC720\uC81C\uD488", "\uAE30\uD0C0"}));
		cb_ī�װ�.setBounds(430, 680, 100, 48);
		contentPane.add(cb_ī�װ�);
		
		JTextField tf_����̸� = new JTextField();
		tf_����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		tf_����̸�.setColumns(10);
		tf_����̸�.setBounds(166, 707, 116, 21);
		contentPane.add(tf_����̸�);
		
		JTextField tf_��ᰡ�� = new JTextField();
		tf_��ᰡ��.setHorizontalAlignment(SwingConstants.CENTER);
		tf_��ᰡ��.setColumns(10);
		tf_��ᰡ��.setBounds(302, 707, 116, 21);
		contentPane.add(tf_��ᰡ��);
		
		
		
		JButton btn_�߰� = new JButton("\uCD94\uAC00");
		btn_�߰�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.clear();	//JList �� �ʱ�ȭ�� ���ؼ� ���⼭ clear() �� �ؾ���.
				mat.add(tf_����̸�.getText());
				try{
					Integer mp = new Integer(tf_��ᰡ��.getText());	//int ������ �ٲ��ֱ� ���ؼ� ����.
					matprice.add(mp);
				} catch (Exception k) {
					JOptionPane.showMessageDialog(null, "���ݿ� ������ �Է��� �ּ���.");
				}			
				cat.add((String)cb_ī�װ�.getSelectedItem());

				// ������ sql �� ������� �ϴ°� �Ʒ����� JList â�� ǥ�� �ҷ��� �ϴ°�
				
				for(int i = 0; i < mat.size(); i++)
					model.addElement(mat.get(i)+"    "+matprice.get(i)+"    "+cat.get(i));
				list_���ٱ���.setModel(model);
			}	
		});
		
		JButton btn_���� = new JButton("\uC81C\uAC70");
		btn_����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list_���ٱ���.getSelectedIndex();
				model.remove(index);
				mat.remove(index);
				matprice.remove(index);
				cat.remove(index);
				
				list_���ٱ���.setModel(model); //Jlist �� �ٽ� ���� �����ֱ� ���ؼ�
			}
		});
		
		JButton btn_������ = new JButton();
		btn_������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = (String)cb_������.getSelectedItem();	//�޺��ڽ� ����
				String foodname = new String(tf_�����̸�2.getText()); //������ �̸�
				Integer price;
				String cooking = new String(ta_�丮����.getText());	//������ ����
				String time= new String(tf_����ð�.getText());		//�ð�
				if(str == "���"){
					price = new Integer(tf_����2.getText());	//������ ����
					manager.recipehandler(str,foodname,price,cooking,time,mat,matprice,cat);
				}
					
				else if(str == "����"){
					price = new Integer(tf_����2.getText());	//������ ����
					manager.recipehandler(str, foodname, price, cooking, time,mat,matprice,cat);
				}
				else{
					manager.recipehandler(foodname);
				}
			}
		});
		btn_������.setFocusPainted(false);
		btn_������.setContentAreaFilled(false);
		btn_������.setBorderPainted(false);
		btn_������.setBounds(965, 545, 64, 57);
		contentPane.add(btn_������);
		
		btn_����.setBounds(553, 706, 76, 32);
		contentPane.add(btn_����);
		
		btn_�߰�.setBounds(553, 669, 76, 32);
		contentPane.add(btn_�߰�);
		
		
		
		JLabel lb_����̸� = new JLabel("\uC7AC\uB8CC\uC774\uB984");
		lb_����̸�.setHorizontalAlignment(SwingConstants.CENTER);
		lb_����̸�.setFont(new Font("����", Font.BOLD, 14));
		lb_����̸�.setBounds(166, 671, 116, 26);
		contentPane.add(lb_����̸�);
		
		JLabel lb_��ᰡ�� = new JLabel("\uC7AC\uB8CC\uAC00\uACA9");
		lb_��ᰡ��.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��ᰡ��.setFont(new Font("����", Font.BOLD, 14));
		lb_��ᰡ��.setBounds(302, 671, 116, 26);
		contentPane.add(lb_��ᰡ��);
		
		
		
		JLabel lb_���ٱ��� = new JLabel("\uC7AC\uB8CC\uBC14\uAD6C\uB2C8");
		lb_���ٱ���.setHorizontalAlignment(SwingConstants.CENTER);
		lb_���ٱ���.setFont(new Font("����", Font.BOLD, 14));
		lb_���ٱ���.setBounds(721, 576, 93, 26);
		contentPane.add(lb_���ٱ���);
		

		
		JLabel lb_��й�ȣ = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		lb_��й�ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		lb_��й�ȣ.setFont(new Font("����", Font.BOLD, 14));
		lb_��й�ȣ.setBounds(789, 66, 107, 26);
		contentPane.add(lb_��й�ȣ);
		
		JTextField tf_��й�ȣ = new JTextField();
		tf_��й�ȣ.setHorizontalAlignment(SwingConstants.CENTER);
		tf_��й�ȣ.setColumns(10);
		tf_��й�ȣ.setBounds(908, 70, 116, 21);
		contentPane.add(tf_��й�ȣ);
		
		JButton btn_��й�ȣ = new JButton("\uBCC0\uACBD");
		btn_��й�ȣ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.PassWordHandler(tf_��й�ȣ);
			}
		});
		btn_��й�ȣ.setBounds(1035, 69, 97, 23);
		contentPane.add(btn_��й�ȣ);
		

		
		
		
	}
}
