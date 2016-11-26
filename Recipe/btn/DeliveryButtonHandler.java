import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DeliveryButtonHandler extends Price {
	CookConnection cc = new CookConnection();
	String sql;
	Vector<?> vec;
	int price;
	
	public void chinahandler() { // �߽�
		try {
			
			price = getPrice();
			
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

	public void chickenhandler() { // ġŲ

		try {
			price = getPrice();

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

	public void japanfoodhandler() { // �Ͻ�
		try {
			price = getPrice();

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

	public void koreanfoodhandler() { // �ѽ�

		try {
			price = getPrice();

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

	public void westernfoodhandler() { // ���

		try {
			price = getPrice();

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

	public void figsfeethandler() { // ����

		try {
			price = getPrice();

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

	public void steamhandler() { // ��

		try {
			price = getPrice();

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

	public void pizzahandler() { // ����

		try {
			price = getPrice();

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
