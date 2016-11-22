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

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 82, 217, 297);
		contentPane.add(scrollPane_1);
		JList list = new JList();
		list.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		list.setListData(vec);

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(299, 82, 195, 297);
		contentPane.add(scrollPane_2);

		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(654, 82, 195, 297);
		contentPane.add(scrollPane_3);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_3.setViewportView(textArea_1);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
		textField.setBounds(1009, 82, 157, 35);
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
		label.setBounds(299, 22, 195, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC804\uD654 \uBC88\uD638");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_1.setBounds(1009, 22, 157, 50);
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
		
		JLabel label_3 = new JLabel("\uC804\uCCB4 \uBA54\uB274");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_3.setBounds(654, 22, 195, 50);
		contentPane.add(label_3);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(506, 82, 92, 297);
		contentPane.add(scrollPane_4);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_4.setViewportView(textArea_2);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(861, 82, 92, 297);
		contentPane.add(scrollPane_5);
		
		JTextArea textArea_3 = new JTextArea();
		scrollPane_5.setViewportView(textArea_3);
		
		JLabel label_4 = new JLabel("\uAC00\uACA9");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_4.setBounds(506, 22, 92, 50);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uAC00\uACA9");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label_5.setBounds(861, 22, 92, 50);
		contentPane.add(label_5);

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