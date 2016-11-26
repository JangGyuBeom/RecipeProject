import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ManagerConnectButtonHandler  {
	
	public void lockhandler(JPasswordField f_password){
		String sql;
		String password;
		ManagerConnection MC = new ManagerConnection();
		
		sql = "select pw from password;";
		
		password = MC.makePW_SQL(sql);
		
		String passwordcp = new String(f_password.getText());
		if(password.compareTo(passwordcp) == 0)
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						RecipeManager frame = new RecipeManager();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		else
		{
			JOptionPane.showMessageDialog(null,"비밀번호를 다시 입력 해 주세요.");
		}
		
	}
	

}
