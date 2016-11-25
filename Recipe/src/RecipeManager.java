import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RecipeManager extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;

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
		
		JButton btnNewButton = new JButton();
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.inquireshandler();
			}
		});
		btnNewButton.setBounds(32, 29, 158, 59);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uACF5\uC9C0\uC0AC\uD56D : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 135, 107, 48);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uB808\uC2DC\uD53C : ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		label_1.setBounds(12, 340, 107, 48);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uBC30\uB2EC\uC74C\uC2DD : ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		label_2.setBounds(12, 902, 107, 48);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("문의보기");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(32, 40, 158, 59);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();  //공지사항
		comboBox.setFont(new Font("돋움", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"등록", "수정", "삭제"}));
		comboBox.setBounds(115, 135, 100, 48);
		((JLabel) comboBox.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(comboBox);
		
		
		
		
		JComboBox comboBox_1 = new JComboBox(); //레시피
		comboBox_1.setFont(new Font("돋움", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"등록", "수정", "삭제"}));
		comboBox_1.setBounds(115, 339, 100, 48);
		((JLabel) comboBox_1.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(); //배달
		comboBox_2.setFont(new Font("돋움", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"등록", "수정", "삭제"}));
		comboBox_2.setBounds(115, 902, 100, 48);
		((JLabel) comboBox_2.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(comboBox_2);
		

		
		JLabel lblNewLabel_2 = new JLabel("공지 번호");
		lblNewLabel_2.setFont(new Font("돋움", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(302, 109, 93, 26);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(292, 145, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel label_3 = new JLabel("공지 내용");
		label_3.setFont(new Font("돋움", Font.BOLD, 14));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(588, 109, 93, 26);
		contentPane.add(label_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(502, 145, 274, 123);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBorderPainted(false); 	//투명 버튼
		btnNewButton_1.setFocusPainted(false);		//투명 버튼
		btnNewButton_1.setContentAreaFilled(false); //투명 버튼
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.noticehandler(comboBox, textField, textArea);
			}
		});
		btnNewButton_1.setBounds(978, 145, 64, 57);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 974, 50, 41);
		contentPane.add(button);
		
		JLabel label_4 = new JLabel(image.Back);
		label_4.setBounds(12, 974, 50, 41);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uAC00\uAC8C\uC774\uB984");
		label_5.setFont(new Font("돋움", Font.BOLD, 14));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(266, 871, 93, 26);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		label_6.setFont(new Font("돋움", Font.BOLD, 14));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(390, 871, 93, 26);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\uAC00\uACA9");
		label_7.setFont(new Font("돋움", Font.BOLD, 14));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(523, 871, 93, 26);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_8.setFont(new Font("돋움", Font.BOLD, 14));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(648, 871, 93, 26);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		label_9.setFont(new Font("돋움", Font.BOLD, 14));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(789, 871, 93, 26);
		contentPane.add(label_9);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(257, 916, 116, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(382, 916, 116, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(513, 916, 116, 21);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(641, 916, 116, 21);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(780, 916, 116, 21);
		contentPane.add(textField_5);
		
		JLabel label_10 = new JLabel("\uC74C\uC2DD\uC774\uB984");
		label_10.setFont(new Font("돋움", Font.BOLD, 14));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(275, 309, 93, 26);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\uAC00\uACA9");
		label_11.setFont(new Font("돋움", Font.BOLD, 14));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(399, 309, 93, 26);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\uC694\uB9AC\uC21C\uC11C");
		label_12.setFont(new Font("돋움", Font.BOLD, 14));
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(727, 309, 93, 26);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\uC608\uC0C1\uC2DC\uAC04");
		label_13.setFont(new Font("돋움", Font.BOLD, 14));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(530, 309, 93, 26);
		contentPane.add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(266, 354, 116, 21);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(391, 354, 116, 21);
		contentPane.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(523, 354, 116, 21);
		contentPane.add(textField_9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(663, 354, 219, 192);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel lblNewLabel_3 = new JLabel(image.modi);
		lblNewLabel_3.setBounds(978, 145, 64, 57);
		contentPane.add(lblNewLabel_3);
		
		JButton button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = (String)comboBox_1.getSelectedItem();	//콤보박스 내용
				String foodname = new String(textField_6.getText()); //레시피 이름
				Integer price = new Integer(textField_7.getText());	//레시피 가격
				String cooking = new String(textArea_1.getText());	//레시피 순서
				String time= new String(textField_9.getText());		//시간
				if(str == "등록")
					manager.recipehandler(str,foodname,price,cooking,time);
				else if(str == "수정"){
					manager.recipehandler(str, foodname, price, cooking, time);
				}
				else{
					manager.recipehandler(str,foodname);
				}
			}
		});
		button_3.setFocusPainted(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(965, 545, 64, 57);
		contentPane.add(button_3);
		
		JLabel label_14 = new JLabel(image.modi);
		label_14.setBounds(965, 545, 64, 57);
		contentPane.add(label_14);
		
		JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.deliveryhandler(comboBox_2,textField_1,textField_2,textField_3,textField_4,textField_5);
			}
		});
		button_2.setFocusPainted(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBounds(978, 916, 64, 57);
		contentPane.add(button_2);
		
		JLabel label_15 = new JLabel(image.modi);
		label_15.setBounds(978, 916, 64, 57);
		contentPane.add(label_15);
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(663, 615, 219, 200);
		contentPane.add(scrollPane_2);
		
		JList list = new JList();
		scrollPane_2.setViewportView(list);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"\uCC44\uC18C_\uACFC\uC77C", "\uC721\uB958", "\uC218\uC0B0\uBB3C", "\uACE1\uBB3C_\uACAC\uACFC\uB958", "\uC591\uB150_\uC18C\uC2A4", "\uAC00\uACF5_\uC720\uC81C\uD488", "\uAE30\uD0C0"}));
		comboBox_3.setBounds(430, 680, 100, 48);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton_2 = new JButton("\uCD94\uAC00");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.clear();	//JList 의 초기화를 위해서 여기서 clear() 를 해야함.
				mat.add(textField_8.getText());
				try{
					Integer mp = new Integer(textField_10.getText());	//int 형으로 바꿔주기 위해서 쓴다.
					matprice.add(mp);
				} catch (Exception k) {
					JOptionPane.showMessageDialog(null, "가격에 정수를 입력해 주세요.");
				}			
				cat.add((String)comboBox_3.getSelectedItem());

				// 위쪽은 sql 문 만들려고 하는거 아래쪽은 JList 창에 표현 할려고 하는거
				
				for(int i = 0; i < mat.size(); i++)
					model.addElement(mat.get(i)+"    "+matprice.get(i)+"    "+cat.get(i));
				list.setModel(model);
			}	
		});
		JButton button_4 = new JButton("\uC81C\uAC70");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				model.remove(index);
				mat.remove(index);
				matprice.remove(index);
				cat.remove(index);
				
				list.setModel(model); //Jlist 에 다시 값을 보여주기 위해서
			}
		});
		button_4.setBounds(553, 706, 76, 32);
		contentPane.add(button_4);
		
		btnNewButton_2.setBounds(553, 669, 76, 32);
		contentPane.add(btnNewButton_2);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(166, 707, 116, 21);
		contentPane.add(textField_8);
		
		JLabel label_16 = new JLabel("\uC7AC\uB8CC\uC774\uB984");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("돋움", Font.BOLD, 14));
		label_16.setBounds(166, 671, 116, 26);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("\uC7AC\uB8CC\uAC00\uACA9");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("돋움", Font.BOLD, 14));
		label_17.setBounds(302, 671, 116, 26);
		contentPane.add(label_17);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(302, 707, 116, 21);
		contentPane.add(textField_10);
		
		JLabel label_18 = new JLabel("\uC7AC\uB8CC\uBC14\uAD6C\uB2C8");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("돋움", Font.BOLD, 14));
		label_18.setBounds(721, 576, 93, 26);
		contentPane.add(label_18);
		

		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("돋움", Font.BOLD, 14));
		label.setBounds(789, 66, 107, 26);
		contentPane.add(label);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		textField_11.setBounds(908, 70, 116, 21);
		contentPane.add(textField_11);
		
		JButton button_1 = new JButton("\uBCC0\uACBD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerConnection MC = new ManagerConnection();
				MC.makeSQL("update password set pw = '"+textField_11.getText()+"';");
				JOptionPane.showMessageDialog(null,"변경되었습니다.\n 변경된 비밀번호는 = "+textField_11.getText()+"입니다.");
			}
		});
		button_1.setBounds(1035, 69, 97, 23);
		contentPane.add(button_1);
		

		
		
		
	}
}
