import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ShowInquiresButtonHandler {	
	public void deletehandler(){
		ShowInquiresConnection sc = new ShowInquiresConnection();
		sc.delInquires();
		JOptionPane.showMessageDialog(null,"���� �Ϸ�");
	}
}
