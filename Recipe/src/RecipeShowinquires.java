import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

public class RecipeShowinquires extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeShowinquires frame = new RecipeShowinquires();
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
	public RecipeShowinquires() {
		RecipeImage image = new RecipeImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 403);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(image.background_gr.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 314, 50, 41);
		contentPane.add(button);
		
		JLabel label = new JLabel(image.Back);
		label.setBounds(12, 314, 50, 41);
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 22, 537, 283);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("바탕", Font.BOLD, 17));
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		try {
			Connection conn = null;

			conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/recipe?useSSL=false",
					"hoonju", "19950905"); // Xshell
			/*conn = DriverManager.getConnection("jdbc:mysql://165.229.88.102:3306/recipe?useSSL=false",
					"hoonju", "19950905");  // 학교
*/			
			

			java.sql.Statement st = null;
			ResultSet rset = null;
			st = conn.createStatement();
			String sql = "select ask_num,ask_text from ask order by ask_num desc;";
			rset = st.executeQuery(sql);
			System.out.println(sql);
			/*if (st.execute("select del_name from delivery where del_price>50000;")) {
				rset = st.getResultSet();
			}*/

			while (rset.next()) {
				//String str = rset.getNString(1);
				System.out.println("NUM : "+rset.getInt(1)+" | Text :"+rset.getString(2)+"\n");
				textArea.append("NUM : "+rset.getInt(1)+" | Text :"+rset.getString(2)+"\n");
			}
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}

		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jdbc ask = new Jdbc();
				String text = new String(textArea.getText());
				int i = ask.returnSQL("select max(ask_num) from ask;");
				ask.insertSQL("delete from ask where ask_num = "+i+";");
				JOptionPane.showMessageDialog(null,"삭제 완료");
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(446, 314, 103, 41);
		contentPane.add(btnNewButton);
		
		JLabel lb_문의삭제 = new JLabel("\uBB38\uC758\uC0AD\uC81C");
		lb_문의삭제.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 17));
		lb_문의삭제.setHorizontalAlignment(SwingConstants.CENTER);
		lb_문의삭제.setBounds(446, 314, 103, 41);
		contentPane.add(lb_문의삭제);
	}
}
