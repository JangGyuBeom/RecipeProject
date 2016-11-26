import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WriteInquiresButtonHandler {
	public void sendhandler(JTextArea 문의창){	
		InquiresConnection ic = new InquiresConnection();
		String text = new String(문의창.getText());
		ic.makeSQL(text);
		JOptionPane.showMessageDialog(null,"전송 완료");
	}
}
