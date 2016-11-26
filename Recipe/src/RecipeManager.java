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
		ArrayList<String> mat = new ArrayList<String>();	//재료 이름 저장     세개 묶어서 쓸수 있는데 그러면 클레스를 하나더 늘려서 구조체처럼 만들어야함.
		ArrayList<Integer> matprice = new ArrayList<Integer>();	//재료 가격 저장		
		ArrayList<String> cat = new ArrayList<String>();	//카테고리 저장
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
		
		JButton btn_문의보기 = new JButton();
		btn_문의보기.setFocusPainted(false);
		btn_문의보기.setContentAreaFilled(false);
		btn_문의보기.setBorderPainted(false);
		btn_문의보기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.inquireshandler();
			}
		});
		btn_문의보기.setBounds(32, 29, 158, 59);
		contentPane.add(btn_문의보기);
		
		JLabel lb_공지사항 = new JLabel("\uACF5\uC9C0\uC0AC\uD56D : ");
		lb_공지사항.setHorizontalAlignment(SwingConstants.CENTER);
		lb_공지사항.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		lb_공지사항.setBounds(12, 135, 107, 48);
		contentPane.add(lb_공지사항);
		
		JLabel lb_레시피 = new JLabel("\uB808\uC2DC\uD53C : ");
		lb_레시피.setHorizontalAlignment(SwingConstants.CENTER);
		lb_레시피.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		lb_레시피.setBounds(12, 340, 107, 48);
		contentPane.add(lb_레시피);
		
		JLabel lb_배달음식 = new JLabel("\uBC30\uB2EC\uC74C\uC2DD : ");
		lb_배달음식.setHorizontalAlignment(SwingConstants.CENTER);
		lb_배달음식.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		lb_배달음식.setBounds(12, 902, 107, 48);
		contentPane.add(lb_배달음식);
		
		JLabel lb_문의보기 = new JLabel("문의보기");
		lb_문의보기.setHorizontalAlignment(SwingConstants.CENTER);
		lb_문의보기.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lb_문의보기.setBounds(32, 40, 158, 59);
		contentPane.add(lb_문의보기);
		
		JComboBox cb_공지사항 = new JComboBox();  //공지사항
		cb_공지사항.setFont(new Font("돋움", Font.BOLD, 15));
		cb_공지사항.setModel(new DefaultComboBoxModel(new String[] {"등록", "수정", "삭제"}));
		cb_공지사항.setBounds(115, 135, 100, 48);
		((JLabel) cb_공지사항.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cb_공지사항);
		
		
		
		
		JComboBox cb_레시피 = new JComboBox(); //레시피
		cb_레시피.setFont(new Font("돋움", Font.BOLD, 15));
		cb_레시피.setModel(new DefaultComboBoxModel(new String[] {"등록", "수정", "삭제"}));
		cb_레시피.setBounds(115, 339, 100, 48);
		((JLabel) cb_레시피.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cb_레시피);
		
		JComboBox cb_배달음식 = new JComboBox(); //배달
		cb_배달음식.setFont(new Font("돋움", Font.BOLD, 15));
		cb_배달음식.setModel(new DefaultComboBoxModel(new String[] {"등록", "수정", "삭제"}));
		cb_배달음식.setBounds(115, 902, 100, 48);
		((JLabel) cb_배달음식.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cb_배달음식);
		

		
		JLabel lb_공지번호 = new JLabel("공지 번호");
		lb_공지번호.setFont(new Font("돋움", Font.BOLD, 14));
		lb_공지번호.setHorizontalAlignment(SwingConstants.CENTER);
		lb_공지번호.setBounds(302, 109, 93, 26);
		contentPane.add(lb_공지번호);
		
		JTextField tf_공지번호 = new JTextField();
		tf_공지번호.setHorizontalAlignment(SwingConstants.CENTER);
		tf_공지번호.setBounds(292, 145, 116, 21);
		contentPane.add(tf_공지번호);
		tf_공지번호.setColumns(10);
		
		
		
		JLabel lb_공지내용 = new JLabel("공지 내용");
		lb_공지내용.setFont(new Font("돋움", Font.BOLD, 14));
		lb_공지내용.setHorizontalAlignment(SwingConstants.CENTER);
		lb_공지내용.setBounds(588, 109, 93, 26);
		contentPane.add(lb_공지내용);
		
		JScrollPane sp_공지내용 = new JScrollPane();
		sp_공지내용.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp_공지내용.setBounds(502, 145, 274, 123);
		contentPane.add(sp_공지내용);
		
		JTextArea ta_공지내용 = new JTextArea();
		sp_공지내용.setViewportView(ta_공지내용);
		
		JButton btn_공지사항 = new JButton();
		btn_공지사항.setBorderPainted(false); 	//투명 버튼
		btn_공지사항.setFocusPainted(false);		//투명 버튼
		btn_공지사항.setContentAreaFilled(false); //투명 버튼
		btn_공지사항.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.noticehandler(cb_공지사항, tf_공지번호, ta_공지내용);
			}
		});
		btn_공지사항.setBounds(978, 145, 64, 57);
		contentPane.add(btn_공지사항);
		
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
		
		JLabel lb_가게이름 = new JLabel("\uAC00\uAC8C\uC774\uB984");
		lb_가게이름.setFont(new Font("돋움", Font.BOLD, 14));
		lb_가게이름.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가게이름.setBounds(266, 871, 93, 26);
		contentPane.add(lb_가게이름);
		
		JLabel lb_음식이름 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		lb_음식이름.setFont(new Font("돋움", Font.BOLD, 14));
		lb_음식이름.setHorizontalAlignment(SwingConstants.CENTER);
		lb_음식이름.setBounds(390, 871, 93, 26);
		contentPane.add(lb_음식이름);
		
		JLabel lb_가격 = new JLabel("\uAC00\uACA9");
		lb_가격.setFont(new Font("돋움", Font.BOLD, 14));
		lb_가격.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가격.setBounds(523, 871, 93, 26);
		contentPane.add(lb_가격);
		
		JLabel lb_전화번호 = new JLabel("\uC804\uD654\uBC88\uD638");
		lb_전화번호.setFont(new Font("돋움", Font.BOLD, 14));
		lb_전화번호.setHorizontalAlignment(SwingConstants.CENTER);
		lb_전화번호.setBounds(648, 871, 93, 26);
		contentPane.add(lb_전화번호);
		
		JLabel lb_카테고리 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		lb_카테고리.setFont(new Font("돋움", Font.BOLD, 14));
		lb_카테고리.setHorizontalAlignment(SwingConstants.CENTER);
		lb_카테고리.setBounds(789, 871, 93, 26);
		contentPane.add(lb_카테고리);
		
		JTextField tf_가게이름 = new JTextField();
		tf_가게이름.setHorizontalAlignment(SwingConstants.CENTER);
		tf_가게이름.setColumns(10);
		tf_가게이름.setBounds(257, 916, 116, 21);
		contentPane.add(tf_가게이름);
		
		JTextField tf_음식이름 = new JTextField();
		tf_음식이름.setHorizontalAlignment(SwingConstants.CENTER);
		tf_음식이름.setColumns(10);
		tf_음식이름.setBounds(382, 916, 116, 21);
		contentPane.add(tf_음식이름);
		
		JTextField tf_가격 = new JTextField();
		tf_가격.setHorizontalAlignment(SwingConstants.CENTER);
		tf_가격.setColumns(10);
		tf_가격.setBounds(513, 916, 116, 21);
		contentPane.add(tf_가격);
		
		JTextField tf_전화번호 = new JTextField();
		tf_전화번호.setHorizontalAlignment(SwingConstants.CENTER);
		tf_전화번호.setColumns(10);
		tf_전화번호.setBounds(641, 916, 116, 21);
		contentPane.add(tf_전화번호);
		
		JTextField tf_카테고리 = new JTextField();
		tf_카테고리.setHorizontalAlignment(SwingConstants.CENTER);
		tf_카테고리.setColumns(10);
		tf_카테고리.setBounds(780, 916, 116, 21);
		contentPane.add(tf_카테고리);
		
		JLabel lb_음식이름2 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		lb_음식이름2.setFont(new Font("돋움", Font.BOLD, 14));
		lb_음식이름2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_음식이름2.setBounds(275, 309, 93, 26);
		contentPane.add(lb_음식이름2);
		
		JLabel lb_가격2 = new JLabel("\uAC00\uACA9");
		lb_가격2.setFont(new Font("돋움", Font.BOLD, 14));
		lb_가격2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_가격2.setBounds(399, 309, 93, 26);
		contentPane.add(lb_가격2);
		
		JLabel lb_요리순서 = new JLabel("\uC694\uB9AC\uC21C\uC11C");
		lb_요리순서.setFont(new Font("돋움", Font.BOLD, 14));
		lb_요리순서.setHorizontalAlignment(SwingConstants.CENTER);
		lb_요리순서.setBounds(727, 309, 93, 26);
		contentPane.add(lb_요리순서);
		
		JLabel lb_예상시간 = new JLabel("\uC608\uC0C1\uC2DC\uAC04");
		lb_예상시간.setFont(new Font("돋움", Font.BOLD, 14));
		lb_예상시간.setHorizontalAlignment(SwingConstants.CENTER);
		lb_예상시간.setBounds(530, 309, 93, 26);
		contentPane.add(lb_예상시간);
		
		JTextField tf_음식이름2 = new JTextField();
		tf_음식이름2.setHorizontalAlignment(SwingConstants.CENTER);
		tf_음식이름2.setColumns(10);
		tf_음식이름2.setBounds(266, 354, 116, 21);
		contentPane.add(tf_음식이름2);
		
		JTextField tf_가격2 = new JTextField();
		tf_가격2.setHorizontalAlignment(SwingConstants.CENTER);
		tf_가격2.setColumns(10);
		tf_가격2.setBounds(391, 354, 116, 21);
		contentPane.add(tf_가격2);
		
		JTextField tf_예상시간 = new JTextField();
		tf_예상시간.setHorizontalAlignment(SwingConstants.CENTER);
		tf_예상시간.setColumns(10);
		tf_예상시간.setBounds(523, 354, 116, 21);
		contentPane.add(tf_예상시간);
		
		JScrollPane cp_요리순서 = new JScrollPane();
		cp_요리순서.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		cp_요리순서.setBounds(663, 354, 219, 192);
		contentPane.add(cp_요리순서);
		
		JTextArea ta_요리순서 = new JTextArea();
		cp_요리순서.setViewportView(ta_요리순서);
		
		JLabel lb_공지사항2 = new JLabel(image.modi);
		lb_공지사항2.setBounds(978, 145, 64, 57);
		contentPane.add(lb_공지사항2);
				
		JLabel lb_레시피2 = new JLabel(image.modi);
		lb_레시피2.setBounds(965, 545, 64, 57);
		contentPane.add(lb_레시피2);
		
		JButton btn_배달음식 = new JButton();
		btn_배달음식.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.deliveryhandler(cb_배달음식,tf_가게이름,tf_음식이름,tf_가격,tf_전화번호,tf_카테고리);
			}
		});
		btn_배달음식.setFocusPainted(false);
		btn_배달음식.setContentAreaFilled(false);
		btn_배달음식.setBorderPainted(false);
		btn_배달음식.setBounds(978, 916, 64, 57);
		contentPane.add(btn_배달음식);
		
		JLabel lb_배달음식2 = new JLabel(image.modi);
		lb_배달음식2.setBounds(978, 916, 64, 57);
		contentPane.add(lb_배달음식2);
		
		
		JScrollPane sp_재료바구니 = new JScrollPane();
		sp_재료바구니.setBounds(663, 615, 219, 200);
		contentPane.add(sp_재료바구니);
		
		JList list_재료바구니 = new JList();
		sp_재료바구니.setViewportView(list_재료바구니);
		
		JComboBox cb_카테고리 = new JComboBox();
		cb_카테고리.setModel(new DefaultComboBoxModel(new String[] {"\uCC44\uC18C_\uACFC\uC77C", "\uC721\uB958", "\uC218\uC0B0\uBB3C", "\uACE1\uBB3C_\uACAC\uACFC\uB958", "\uC591\uB150_\uC18C\uC2A4", "\uAC00\uACF5_\uC720\uC81C\uD488", "\uAE30\uD0C0"}));
		cb_카테고리.setBounds(430, 680, 100, 48);
		contentPane.add(cb_카테고리);
		
		JTextField tf_재료이름 = new JTextField();
		tf_재료이름.setHorizontalAlignment(SwingConstants.CENTER);
		tf_재료이름.setColumns(10);
		tf_재료이름.setBounds(166, 707, 116, 21);
		contentPane.add(tf_재료이름);
		
		JTextField tf_재료가격 = new JTextField();
		tf_재료가격.setHorizontalAlignment(SwingConstants.CENTER);
		tf_재료가격.setColumns(10);
		tf_재료가격.setBounds(302, 707, 116, 21);
		contentPane.add(tf_재료가격);
		
		
		
		JButton btn_추가 = new JButton("\uCD94\uAC00");
		btn_추가.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.clear();	//JList 의 초기화를 위해서 여기서 clear() 를 해야함.
				mat.add(tf_재료이름.getText());
				try{
					Integer mp = new Integer(tf_재료가격.getText());	//int 형으로 바꿔주기 위해서 쓴다.
					matprice.add(mp);
				} catch (Exception k) {
					JOptionPane.showMessageDialog(null, "가격에 정수를 입력해 주세요.");
				}			
				cat.add((String)cb_카테고리.getSelectedItem());

				// 위쪽은 sql 문 만들려고 하는거 아래쪽은 JList 창에 표현 할려고 하는거
				
				for(int i = 0; i < mat.size(); i++)
					model.addElement(mat.get(i)+"    "+matprice.get(i)+"    "+cat.get(i));
				list_재료바구니.setModel(model);
			}	
		});
		
		JButton btn_제거 = new JButton("\uC81C\uAC70");
		btn_제거.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list_재료바구니.getSelectedIndex();
				model.remove(index);
				mat.remove(index);
				matprice.remove(index);
				cat.remove(index);
				
				list_재료바구니.setModel(model); //Jlist 에 다시 값을 보여주기 위해서
			}
		});
		
		JButton btn_레시피 = new JButton();
		btn_레시피.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = (String)cb_레시피.getSelectedItem();	//콤보박스 내용
				String foodname = new String(tf_음식이름2.getText()); //레시피 이름
				Integer price;
				String cooking = new String(ta_요리순서.getText());	//레시피 순서
				String time= new String(tf_예상시간.getText());		//시간
				if(str == "등록"){
					price = new Integer(tf_가격2.getText());	//레시피 가격
					manager.recipehandler(str,foodname,price,cooking,time,mat,matprice,cat);
				}
					
				else if(str == "수정"){
					price = new Integer(tf_가격2.getText());	//레시피 가격
					manager.recipehandler(str, foodname, price, cooking, time,mat,matprice,cat);
				}
				else{
					manager.recipehandler(foodname);
				}
			}
		});
		btn_레시피.setFocusPainted(false);
		btn_레시피.setContentAreaFilled(false);
		btn_레시피.setBorderPainted(false);
		btn_레시피.setBounds(965, 545, 64, 57);
		contentPane.add(btn_레시피);
		
		btn_제거.setBounds(553, 706, 76, 32);
		contentPane.add(btn_제거);
		
		btn_추가.setBounds(553, 669, 76, 32);
		contentPane.add(btn_추가);
		
		
		
		JLabel lb_재료이름 = new JLabel("\uC7AC\uB8CC\uC774\uB984");
		lb_재료이름.setHorizontalAlignment(SwingConstants.CENTER);
		lb_재료이름.setFont(new Font("돋움", Font.BOLD, 14));
		lb_재료이름.setBounds(166, 671, 116, 26);
		contentPane.add(lb_재료이름);
		
		JLabel lb_재료가격 = new JLabel("\uC7AC\uB8CC\uAC00\uACA9");
		lb_재료가격.setHorizontalAlignment(SwingConstants.CENTER);
		lb_재료가격.setFont(new Font("돋움", Font.BOLD, 14));
		lb_재료가격.setBounds(302, 671, 116, 26);
		contentPane.add(lb_재료가격);
		
		
		
		JLabel lb_재료바구니 = new JLabel("\uC7AC\uB8CC\uBC14\uAD6C\uB2C8");
		lb_재료바구니.setHorizontalAlignment(SwingConstants.CENTER);
		lb_재료바구니.setFont(new Font("돋움", Font.BOLD, 14));
		lb_재료바구니.setBounds(721, 576, 93, 26);
		contentPane.add(lb_재료바구니);
		

		
		JLabel lb_비밀번호 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		lb_비밀번호.setHorizontalAlignment(SwingConstants.CENTER);
		lb_비밀번호.setFont(new Font("돋움", Font.BOLD, 14));
		lb_비밀번호.setBounds(789, 66, 107, 26);
		contentPane.add(lb_비밀번호);
		
		JTextField tf_비밀번호 = new JTextField();
		tf_비밀번호.setHorizontalAlignment(SwingConstants.CENTER);
		tf_비밀번호.setColumns(10);
		tf_비밀번호.setBounds(908, 70, 116, 21);
		contentPane.add(tf_비밀번호);
		
		JButton btn_비밀번호 = new JButton("\uBCC0\uACBD");
		btn_비밀번호.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.PassWordHandler(tf_비밀번호);
			}
		});
		btn_비밀번호.setBounds(1035, 69, 97, 23);
		contentPane.add(btn_비밀번호);
		

		
		
		
	}
}
