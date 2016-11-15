import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;

import handler.*;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeliveryResult extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	public DeliveryResult(Vector vec) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 33, 178, 188);
		contentPane.add(scrollPane_1);
		JList list = new JList();
		list.setListData(vec);

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(202, 33, 178, 188);
		contentPane.add(scrollPane_2);

		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);

		textField = new JTextField();
		textField.setBounds(392, 35, 137, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		DeliveryResultButtonHandler drsult = new DeliveryResultButtonHandler();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 24, 227, 215);
		ListSelectionListener ls = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String str;
				if (!e.getValueIsAdjusting()) {
					str = (String) list.getSelectedValue();
					drsult.DeliveryResultHandler(str,textField,textArea);
				}
			}
		};
		list.addListSelectionListener(ls);
	}
}