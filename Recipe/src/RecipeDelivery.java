import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class RecipeDelivery extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeDelivery frame = new RecipeDelivery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RecipeDelivery() {
		ImageIcon background = new ImageIcon("Image/¹è°æ.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 455);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(background.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uAE08\uC561");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 29, 77, 47);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnNewButton.setBounds(12, 384, 68, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(94, 33, 420, 43);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("\uAC80\uC0C9");
		btnNewButton_1.setBounds(526, 33, 97, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCC1C,\uD0D5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(27, 100, 276, 43);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("\uC911\uC2DD");
		button.setBounds(27, 167, 276, 43);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uC77C\uC2DD");
		button_1.setBounds(27, 234, 276, 43);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\uC591\uC2DD");
		button_2.setBounds(27, 302, 276, 43);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\uCE58\uD0A8,\uCC1C\uB2ED");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(347, 100, 276, 43);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\uD55C\uC2DD,\uBD84\uC2DD");
		button_4.setBounds(347, 167, 276, 43);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\uC871\uBC1C,\uBCF4\uC308");
		button_5.setBounds(347, 234, 276, 43);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\uD53C\uC790");
		button_6.setBounds(347, 302, 276, 43);
		contentPane.add(button_6);
	}

}
