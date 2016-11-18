import java.awt.EventQueue;

public class RecipeButtonHandler {
	
	public void searchhandler(){ //검색
		
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

	public void 채소_과일handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe채소_과일 frame = new Recipe채소_과일();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void 육류handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe육류 frame = new Recipe육류();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	public void 수산물handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe수산물 frame = new Recipe수산물();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void 곡물_견과류handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe곡물_견과류 frame = new Recipe곡물_견과류();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void 양념_소스handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe양념_소스 frame = new Recipe양념_소스();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void 가공_유제품handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe가공_유제품 frame = new Recipe가공_유제품();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public void 기타handler(){

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recipe기타 frame = new Recipe기타();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	
}
