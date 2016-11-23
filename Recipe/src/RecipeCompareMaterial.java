
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RecipeCompareMaterial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 * @param matName 
	 * @param str 
	 */
	public RecipeCompareMaterial(String rName) {
		
		RecipeImage image = new RecipeImage();
		RecipeResultButtonHandler rb = new RecipeResultButtonHandler();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 595);
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
		
		JLabel label = new JLabel("\uC7AC\uB8CC");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 28));
		label.setBounds(31, 23, 136, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uBE45\uB9C8\uD2B8");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		label_1.setBounds(231, 23, 79, 50);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uD648\uB9C8\uD2B8");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 25));
		label_2.setBounds(334, 23, 79, 50);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uD3EC\uC2A4\uB9C8\uD2B8");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 19));
		label_3.setBounds(439, 23, 79, 50);
		contentPane.add(label_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 83, 136, 394);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(231, 83, 79, 394);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(334, 83, 79, 394);
		contentPane.add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(439, 83, 79, 394);
		contentPane.add(scrollPane_3);
		
		JTextArea textArea_3 = new JTextArea();
		scrollPane_3.setViewportView(textArea_3);
	
		rb.RecipeCompareMaterialHandler(rName,textArea,textArea_1,textArea_2,textArea_3); 
		
		JButton button = new JButton(image.Back);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(12, 506, 50, 41);
		contentPane.add(button);
	}
}
