import java.awt.EventQueue;
import java.util.*;

import javax.swing.JOptionPane;

public class RecipeButtonHandler extends Material{
	CookConnection cc = new CookConnection();
	int price;
	Vector<String> vec;
	String sql;
	
	

	public void searchhandler(){ //�˻�
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						int price = getPrice();
						sql = "select f_name from cook where f_price <= "+price+";";
						vec = cc.makeD_SQL(sql);
						if(Material != null)
							sumMaterialPrice();
						vec.addElement("----------------------------------------------------");
						vec = isSearchM(vec);
						RecipeResult frame = new RecipeResult(vec);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}
	
	public void reset(){
		Material.clear();
		JOptionPane.showMessageDialog(null,"���õ� ��� �ʱ�ȭ");
	}

	public void ä��_����handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipeä��_���� frame = new Recipeä��_����();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void ����handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe���� frame = new Recipe����();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	public void ���깰handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe���깰 frame = new Recipe���깰();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void �_�߰���handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe�_�߰��� frame = new Recipe�_�߰���();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void ���_�ҽ�handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe���_�ҽ� frame = new Recipe���_�ҽ�();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void ����_����ǰhandler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe����_����ǰ frame = new Recipe����_����ǰ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void ��Ÿhandler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe��Ÿ frame = new Recipe��Ÿ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	
}
