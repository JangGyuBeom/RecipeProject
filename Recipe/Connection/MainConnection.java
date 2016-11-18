import java.sql.*;

import javax.swing.*;

public class MainConnection {
	public void makeSQL(JTextArea textArea){
		Jdbc jdbc = new Jdbc();
		try {
			ResultSet rset = jdbc.readSQL("select notice_num,notice_text from notice order by notice_num desc;");
			while (rset.next()) {
				textArea.append("NUM : "+rset.getInt(1)+" | Text :"+rset.getString(2)+"\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
