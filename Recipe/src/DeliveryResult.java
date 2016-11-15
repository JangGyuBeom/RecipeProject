import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import handler.*;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class DeliveryResult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(Vector args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(args);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param vec 
	 */
	public DeliveryResult(Vector vec) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(117, 33, 178, 188);
		contentPane.add(scrollPane_1);
		JList list = new JList();
		list.setListData(vec);

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 24, 227, 215);
		
		DeliveryResultButtonHandler handler = new DeliveryResultButtonHandler();
		list.addListSelectionListener(handler);
	}
}