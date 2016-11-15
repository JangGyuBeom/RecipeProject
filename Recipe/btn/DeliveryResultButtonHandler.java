
import java.awt.*;

import javax.swing.event.*;

public class DeliveryResultButtonHandler implements ListSelectionListener {
	public void valueChanged(ListSelectionEvent e) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryDetail frame = new DeliveryDetail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
