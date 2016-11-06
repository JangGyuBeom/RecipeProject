import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;

public class RecipeManager_connect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeManager_connect frame = new RecipeManager_connect();
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
	public RecipeManager_connect() {
		RecipeImage image = new RecipeImage();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 88);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea ta_password = new JTextArea();
		ta_password.setBounds(12, 10, 156, 32);
		contentPane.add(ta_password);
		
		JButton btn_lock = new JButton("");
		btn_lock.setFocusPainted(false);
		btn_lock.setContentAreaFilled(false);
		btn_lock.setBorderPainted(false);
		btn_lock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								RecipeManager frame = new RecipeManager();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			
		});
		btn_lock.setBounds(180, 10, 30, 32);
		contentPane.add(btn_lock);
		
		JLabel lock_image = new JLabel(image.lc);
		lock_image.setBounds(180, 10, 30, 32);
		contentPane.add(lock_image);
		
		JButton btn_back = new JButton();
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setFocusPainted(false);
		btn_back.setContentAreaFilled(false);
		btn_back.setBorderPainted(false);
		btn_back.setBounds(222, 10, 32, 32);
		contentPane.add(btn_back);
		
		JLabel back_image = new JLabel(image.Back_black);
		back_image.setBounds(222, 10, 30, 32);
		contentPane.add(back_image);
	}
}
