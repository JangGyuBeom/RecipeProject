import java.awt.EventQueue;

public class MainButtonHandler {
	
	
	public void recipehandler(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeCook frame = new RecipeCook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void deliveryhandler(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeDelivery frame = new RecipeDelivery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void noticehandler(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeManager_connect frame = new RecipeManager_connect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void backhandler(){
		
	}
	
	public void inquireshandler(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipeinquires frame = new Recipeinquires();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void exithandler(){
		System.exit(0);
	}
}
