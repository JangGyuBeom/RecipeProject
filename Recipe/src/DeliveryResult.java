import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;

import handler.*;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DeliveryResult extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	public DeliveryResult(Vector vec) {
		
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 478);
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

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 82, 217, 297);
		contentPane.add(scrollPane_1);
		JList list = new JList();
		list.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		list.setListData(vec);

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(270, 82, 365, 297);
		contentPane.add(scrollPane_2);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 13));
		scrollPane_2.setViewportView(textArea);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
		textField.setBounds(647, 82, 157, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 389, 50, 41);
		contentPane.add(button);
		
		JLabel label = new JLabel(image.Back);
		label.setBounds(12, 389, 50, 41);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uC804\uD654 \uBC88\uD638");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(647, 34, 137, 38);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uAC00\uAC8C \uC774\uB984");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		label_1.setBounds(61, 34, 137, 38);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uBA54\uB274");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		label_2.setBounds(380, 34, 137, 38);
		contentPane.add(label_2);

		DeliveryResultButtonHandler drsult = new DeliveryResultButtonHandler();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 24, 227, 215);
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String str;
				if (!e.getValueIsAdjusting()) {
					str = (String) list.getSelectedValue();
					drsult.DeliveryResultHandler(str,textField,textArea);
				}
			}
		};
		list.addListSelectionListener(ls);
	}
}