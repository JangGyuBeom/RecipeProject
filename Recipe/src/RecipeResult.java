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
	
	

	public RecipeResult(Vector<String> vec) {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 525);
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
		scrollPane.setBounds(30, 70, 217, 297);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setListData(vec);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(270, 179, 500, 297);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JLabel label = new JLabel("\uC694\uB9AC");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label.setBounds(30, 10, 217, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uB808\uC2DC\uD53C");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_1.setBounds(270, 119, 500, 50);
		contentPane.add(label_1);
		
		JButton button = new JButton(image.Back);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 388, 50, 41);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel((Icon) null);
		label_2.setBounds(12, 388, 50, 41);
		contentPane.add(label_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(270, 73, 500, 50);
		contentPane.add(scrollPane_2);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_2.setViewportView(textArea_1);
		
		JLabel label_3 = new JLabel("\uC7AC\uB8CC");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_3.setBounds(270, 10, 500, 50);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(786, 75, 192, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("\uC608\uC0C1\uC2DC\uAC04");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_4.setBounds(802, 10, 158, 50);
		contentPane.add(label_4);
		
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
