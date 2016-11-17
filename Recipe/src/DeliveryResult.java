import java.awt.Font;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JFrame;
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
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeliveryResult extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param vec
	 * @param price 
	 */
	public DeliveryResult(Vector vec, Integer price) {
		
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1159, 478);
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
		scrollPane_2.setBounds(270, 82, 323, 297);
		contentPane.add(scrollPane_2);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 13));
		scrollPane_2.setViewportView(textArea);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
		textField.setBounds(962, 82, 157, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uAC8C \uC774\uB984");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		lblNewLabel.setBounds(30, 22, 217, 50);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uBC30\uB2EC \uAC00\uB2A5 \uBA54\uB274");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label.setBounds(270, 22, 323, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC804\uD654 \uBC88\uD638");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_1.setBounds(962, 22, 157, 50);
		contentPane.add(label_1);
		
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
		
		JLabel label_2 = new JLabel(image.Back);
		label_2.setBounds(12, 389, 50, 41);
		contentPane.add(label_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(617, 82, 323, 297);
		contentPane.add(scrollPane_3);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_3.setViewportView(textArea_1);
		
		JLabel label_3 = new JLabel("\uC804\uCCB4 \uBA54\uB274");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_3.setBounds(617, 22, 323, 50);
		contentPane.add(label_3);

		DeliveryResultButtonHandler drsult = new DeliveryResultButtonHandler();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 24, 227, 215);
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String str;
				
				if (!e.getValueIsAdjusting()) {
					str = (String) list.getSelectedValue();
					drsult.DeliveryResultHandler(str,textField,textArea,price,textArea_1);
				}
			}
		};
		list.addListSelectionListener(ls);
	}
}