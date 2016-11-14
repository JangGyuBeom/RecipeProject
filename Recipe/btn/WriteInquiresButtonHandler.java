import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WriteInquiresButtonHandler {
	public void sendhandler(JTextArea textArea){	
		InquiresConnection ic = new InquiresConnection();
		String text = new String(textArea.getText());
		ic.makeSQL(text);
		JOptionPane.showMessageDialog(null,"전송 완료");
	}
}
