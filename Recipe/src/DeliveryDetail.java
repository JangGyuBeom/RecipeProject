import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class DeliveryDetail extends JFrame {

	private JPanel contentPane;


	public DeliveryDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
