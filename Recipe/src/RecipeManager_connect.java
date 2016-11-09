

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeManager_connect extends JFrame {

	private JPanel contentPane;
	private JTextField tf_password;

	
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

	
	public RecipeManager_connect() {
		RecipeImage image = new RecipeImage();
		ManagerConnectButtonHandler man_con = new ManagerConnectButtonHandler();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 88);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_lock = new JButton("");
		btn_lock.setFocusPainted(false);
		btn_lock.setContentAreaFilled(false);
		btn_lock.setBorderPainted(false);
		btn_lock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				man_con.lockhandler(tf_password);
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
		
		tf_password = new JTextField();
		tf_password.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		tf_password.setHorizontalAlignment(SwingConstants.CENTER);
		tf_password.setBounds(12, 10, 154, 32);
		contentPane.add(tf_password);
		tf_password.setColumns(10);
	}
}
