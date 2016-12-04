import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DeliveryButtonHandler extends Price {
	CookConnection cc = new CookConnection();
	String sql;
	Vector<?> vec;
	int price;

	public void chinahandler() { 

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

	public void chickenhandler() { 

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

	public void japanfoodhandler() { 

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

	public void koreanfoodhandler() { 

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

	public void westernfoodhandler() { 

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

	public void figsfeethandler() { 

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

	public void steamhandler() {

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

	public void pizzahandler() {

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
