import java.awt.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeliveryButtonHandler {
	CookConnection cc = new CookConnection();
	String sql;
	Vector vec;
	Integer price;
	public void chinahandler(JTextField textField) { // �߽�
		try {
			price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='�߽�'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}

	}

	public void chickenhandler(JTextField textField) { // ġŲ

		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='ġŲ'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}

	}

	public void japanfoodhandler(JTextField textField) { // �Ͻ�
		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='�Ͻ�'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}
	}

	public void koreanfoodhandler(JTextField textField) { // �ѽ�

		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='�ѽ�/�н�'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}

	}

	public void westernfoodhandler(JTextField textField) { // ���

		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='���'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}

	}

	public void figsfeethandler(JTextField textField) { // ����

		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='����/����'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}

	}

	public void steamhandler(JTextField textField) { // ��

		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='��/��'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}
	}

	public void pizzahandler(JTextField textField) { // ����

		try {
			Integer price = new Integer(textField.getText());

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='����'";
			vec = cc.makeD_SQL(sql);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeliveryResult frame = new DeliveryResult(vec,price);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'����'�� �Է��� �ּ���");
		}
	}
}
