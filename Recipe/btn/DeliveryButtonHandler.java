import java.awt.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeliveryButtonHandler {
	CookConnection cc = new CookConnection();
	String sql;
	Vector vec;
	Integer price;
	public void chinahandler(JTextField textField) { // 중식
		try {
			price = new Integer(textField.getText());

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

	public void chickenhandler(JTextField textField) { // 치킨

		try {
			Integer price = new Integer(textField.getText());

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

	public void japanfoodhandler(JTextField textField) { // 일식
		try {
			Integer price = new Integer(textField.getText());

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

	public void koreanfoodhandler(JTextField textField) { // 한식

		try {
			Integer price = new Integer(textField.getText());

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

	public void westernfoodhandler(JTextField textField) { // 양식

		try {
			Integer price = new Integer(textField.getText());

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

	public void figsfeethandler(JTextField textField) { // 족발

		try {
			Integer price = new Integer(textField.getText());

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

	public void steamhandler(JTextField textField) { // 찜

		try {
			Integer price = new Integer(textField.getText());

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

	public void pizzahandler(JTextField textField) { // 피자

		try {
			Integer price = new Integer(textField.getText());

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
