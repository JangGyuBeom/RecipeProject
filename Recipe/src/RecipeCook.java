import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Color;

public class RecipeCook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeCook frame = new RecipeCook();
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
	public RecipeCook() {
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
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(12, 384, 71, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\uAE08\uC561");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 32, 77, 47);
		contentPane.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(97, 32, 420, 43);
		contentPane.add(textArea);
		
		JButton button = new JButton("\uAC80\uC0C9");
		button.setBounds(531, 32, 97, 43);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setToolTipText("");
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		panel.setBounds(32, 100, 582, 33);
		contentPane.add(panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\uC7AC\uB8CC1");
		panel.add(checkBox_6);
	}
}
