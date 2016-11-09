import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ShowInquiresButtonHandler {
	
	public void deletehandler(JTextArea textArea){
		
		Jdbc ask = new Jdbc();
		String text = new String(textArea.getText()); // 사용X?
		int i = ask.returnSQL("select max(ask_num) from ask;");
		ask.insertSQL("delete from ask where ask_num = "+i+";");
		JOptionPane.showMessageDialog(null,"삭제 완료");
		
	}
	
	

}
