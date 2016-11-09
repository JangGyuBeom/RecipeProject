import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ManagerConnectButtonHandler  {
	
	public void lockhandler(JTextField tf_password){
		String password = "1111";
		String passwordcp = new String(tf_password.getText());
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
