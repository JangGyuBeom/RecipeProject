import java.awt.EventQueue;

public class RecipeButtonHandler {
	
	public void searchhandler(){ //�˻�
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						RecipeResult frame = new RecipeResult();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
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
