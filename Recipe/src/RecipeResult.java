import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RecipeResult extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	

	public RecipeResult(Vector<String> vec) {
		RecipeImage image = new RecipeImage();
		Material M = new Material();
		
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 70, 217, 406);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setListData(vec);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(270, 253, 708, 223);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane_1.setViewportView(textArea);
		
		JLabel label = new JLabel("\uC694\uB9AC");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label.setBounds(30, 10, 217, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uB808\uC2DC\uD53C");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_1.setBounds(270, 193, 708, 50);
		contentPane.add(label_1);
		
		JButton button = new JButton(image.Back);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vec.clear();
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 495, 50, 41);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel((Icon) null);
		label_2.setBounds(12, 495, 50, 41);
		contentPane.add(label_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(532, 73, 238, 110);
		contentPane.add(scrollPane_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		scrollPane_2.setViewportView(textArea_1);
		
		JLabel label_3 = new JLabel("\uC120\uD0DD\uD55C \uC7AC\uB8CC");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_3.setBounds(270, 10, 238, 50);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(786, 71, 192, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("\uC608\uC0C1 \uC2DC\uAC04");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_4.setBounds(786, 10, 192, 50);
		contentPane.add(label_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(270, 73, 238, 110);
		contentPane.add(scrollPane_3);
		
		
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		scrollPane_3.setViewportView(textArea_2);
		
		for(int i=0; i < M.Material.size(); i++){
			textArea_2.append(M.Material.get(i)+"  ");
		}
		
		JLabel label_5 = new JLabel("\uD544\uC694 \uC7AC\uB8CC");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_5.setBounds(532, 10, 238, 50);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uCD94\uAC00 \uBE44\uC6A9");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_6.setBounds(786, 99, 192, 50);
		contentPane.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(786, 154, 192, 29);
		
		
		contentPane.add(textField_1);
		
		RecipeResultButtonHandler rRsult = new RecipeResultButtonHandler();
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String str;
				
				if (!e.getValueIsAdjusting()) {
					str = (String) list.getSelectedValue();
					rRsult.RecipeResultHandler(str,textArea_1,textArea,textField);
				}
			}
		};
		list.addListSelectionListener(ls);
	}
}
