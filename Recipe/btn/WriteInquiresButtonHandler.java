import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WriteInquiresButtonHandler {
	public void sendhandler(JTextArea ����â) {
		InquiresConnection ic = new InquiresConnection();
		if (����â.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "���Ǹ� �Է����ּ���");
		}
		else{
			String text = new String(����â.getText());
			ic.makeSQL(text);
			JOptionPane.showMessageDialog(null, "���� �Ϸ�");
		}
		
		
	}
}
