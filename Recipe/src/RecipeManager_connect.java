

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RecipeManager_connect extends JFrame {

	private JPanel contentPane;
	private final JPasswordField pf_비밀번호 = new JPasswordField();

	public RecipeManager_connect() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/RecipeLogo.png"));
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
				man_con.lockhandler(pf_비밀번호);
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
		pf_비밀번호.setHorizontalAlignment(SwingConstants.CENTER);
		pf_비밀번호.setBounds(12, 10, 154, 32);
		contentPane.add(pf_비밀번호);
	}
}
