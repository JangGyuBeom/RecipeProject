import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;

public class Recipeinquires extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipeinquires frame = new Recipeinquires();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Recipeinquires() {
		
		RecipeImage image = new RecipeImage();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 411);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 10, 411, 309);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
		scrollPane.setViewportView(textArea);
		
		JButton btn_Send = new JButton("");
		btn_Send.setBorderPainted(false); 	//투명 버튼
		btn_Send.setFocusPainted(false);		//투명 버튼
		btn_Send.setContentAreaFilled(false); //투명 버튼
		btn_Send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jdbc ask = new Jdbc();
				String text = new String(textArea.getText());
				int i = ask.returnSQL("select max(ask_num) from ask;");
				i++;
				ask.insertSQL("insert into ask(ask_num,ask_text) values("+i+",'"+text+"');");
				System.out.println(i);
				JOptionPane.showMessageDialog(null,"전송 완료");
			}
		});
		btn_Send.setBounds(293, 321, 130, 42);
		contentPane.add(btn_Send);
		
		JButton btn_back = new JButton();
		btn_back.setBorderPainted(false); 	//투명 버튼
		btn_back.setFocusPainted(false);		//투명 버튼
		btn_back.setContentAreaFilled(false); //투명 버튼
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_back.setBounds(12, 322, 50, 41);
		contentPane.add(btn_back);
		
		JLabel Send_Image = new JLabel(image.Send);
		Send_Image.setBounds(291, 321, 162, 44);
		contentPane.add(Send_Image);
		
		JLabel back_Image = new JLabel(image.Back);
		back_Image.setBounds(12, 322, 50, 41);
		contentPane.add(back_Image);
	}
}
