import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WriteInquiresButtonHandler {


	public void sendhandler(JTextArea textArea){
		
		Jdbc ask = new Jdbc();
		String text = new String(textArea.getText());
		int i = ask.returnSQL("select max(ask_num) from ask;");
		i++;
		ask.insertSQL("insert into ask(ask_num,ask_text) values("+i+",'"+text+"');");
		System.out.println(i);
		JOptionPane.showMessageDialog(null,"전송 완료");
		
	}
}
