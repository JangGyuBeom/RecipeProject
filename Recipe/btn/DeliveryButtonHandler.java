import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DeliveryButtonHandler extends Price {
	CookConnection cc = new CookConnection();
	String sql;
	Vector<?> vec;
	int price;
	
	public void chinahandler() { // 중식
		try {
			
			price = getPrice();
			
			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='중식'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}

	}

	public void chickenhandler() { // 치킨

		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='치킨'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}

	}

	public void japanfoodhandler() { // 일식
		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='일식'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}
	}

	public void koreanfoodhandler() { // 한식

		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='한식/분식'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}

	}

	public void westernfoodhandler() { // 양식

		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='양식'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}

	}

	public void figsfeethandler() { // 족발

		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='족발/보쌈'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}

	}

	public void steamhandler() { // 찜

		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='찜/탕'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}
	}

	public void pizzahandler() { // 피자

		try {
			price = getPrice();

			sql = "select distinct d_name from delivery where d_price<=" + price + " and d_group='피자'";
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
			JOptionPane.showMessageDialog(null, "'가격'을 입력해 주세요");
		}
	}
}
