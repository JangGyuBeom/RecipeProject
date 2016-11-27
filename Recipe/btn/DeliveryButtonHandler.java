import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DeliveryButtonHandler extends Price {
	CookConnection cc = new CookConnection();
	String sql;
	Vector<?> vec;
	int price;

	public void chinahandler() { // 중식

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='중식'";
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

	public void chickenhandler() { // 치킨

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='치킨'";
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

	public void japanfoodhandler() { // 일식

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='일식'";
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

	public void koreanfoodhandler() { // 한식

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='한식/분식'";
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

	public void westernfoodhandler() { // 양식

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='양식'";
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

	public void figsfeethandler() { // 족발

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='족발/보쌈'";
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

	public void steamhandler() { // 찜

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='찜/탕'";
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

	public void pizzahandler() { // 피자

		price = getPrice();

		sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='피자'";
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
