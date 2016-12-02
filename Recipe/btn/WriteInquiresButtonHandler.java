import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WriteInquiresButtonHandler {
	public void sendhandler(JTextArea 문의창) {
		InquiresConnection ic = new InquiresConnection();
		if (문의창.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "문의를 입력해주세요");
		}
		else{
			String text = new String(문의창.getText());
			ic.makeSQL(text);
			JOptionPane.showMessageDialog(null, "전송 완료");
		}
		
		
	}
}
