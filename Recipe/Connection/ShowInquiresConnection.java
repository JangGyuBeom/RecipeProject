import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class ShowInquiresConnection {
	public void makeSQL(JTextArea textArea){
		Jdbc jdbc = new Jdbc();
		try {
			ResultSet rset = jdbc.readSQL("select ask_num,ask_text from ask order by ask_num desc;");
			while (rset.next()) {
				textArea.append("NUM : "+rset.getInt(1)+" | Text :"+rset.getString(2)+"\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delInquires(){
		Jdbc jdbc = new Jdbc();
		int num = jdbc.returnSQL("select max(ask_num) from ask;");
		jdbc.updateSQL("delete from ask where ask_num = "+num+";");
	}
}
