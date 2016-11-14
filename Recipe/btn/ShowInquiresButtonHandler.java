import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ShowInquiresButtonHandler {	
	public void deletehandler(JTextArea textArea){
		ShowInquiresConnection sc = new ShowInquiresConnection();
		sc.delInquires();
		JOptionPane.showMessageDialog(null,"삭제 완료");
	}
}
