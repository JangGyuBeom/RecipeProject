import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DeliveryButtonHandler extends Price {
	CookConnection cc = new CookConnection();
	String sql;
	Vector<?> vec;
	int price;

	public void chinahandler() { // �߽�

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='�߽�'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void chickenhandler() { // ġŲ

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='ġŲ'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void japanfoodhandler() { // �Ͻ�

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='�Ͻ�'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void koreanfoodhandler() { // �ѽ�

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='�ѽ�/�н�'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void westernfoodhandler() { // ���

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='���'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void figsfeethandler() { // ����

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='����/����'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void steamhandler() { // ��

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='��/��'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void pizzahandler() { // ����

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='����'";
		vec = cc.makeD_SQL(sql);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryResult frame = new DeliveryResult(vec, price);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
