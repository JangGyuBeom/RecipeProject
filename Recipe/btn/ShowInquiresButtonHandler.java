import javax.swing.JOptionPane;

public class ShowInquiresButtonHandler {	
	public void deletehandler(){
		ShowInquiresConnection sc = new ShowInquiresConnection();
		sc.delInquires();
		JOptionPane.showMessageDialog(null,"삭제 완료");
	}
}
