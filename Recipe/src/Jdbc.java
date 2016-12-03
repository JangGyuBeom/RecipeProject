import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.EventQueue;

public class Jdbc {
	Connection conn = null;
	java.sql.Statement st = null;
	ResultSet rset = null;
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		
		try {	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/recipe?useSSL=false",
				"hoonju", "19950905"); // Xshell
			/*conn = DriverManager.getConnection("jdbc:mysql://165.229.88.102:3306/recipe?useSSL=false&autoReconnect=true",
				"hoonju", "19950905");  // 학교
*/			st = conn.createStatement();
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}
	}
	public ResultSet readSQL(String sql){
		try{		
			rset = st.executeQuery(sql);
		} catch(SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		}	
		return rset;
	}
	public void updateSQL(String sql){
		try{
			String e;
			e = sql.substring(0, 6);
			st.executeUpdate(sql);

			if(e.compareTo("delete") != 0){
				if(e.compareTo("insert") == 0)
					JOptionPane.showMessageDialog(null, "등록 완료.");
				else
					JOptionPane.showMessageDialog(null, "수정 완료.");
			}
		} catch(SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
			return;
		}
	}
	public int returnSQL(String sql) {
		int num = 0;
		try {		
			rset = st.executeQuery(sql);
			while (rset.next()) {
				num=rset.getInt(1);
			}
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		}
		return num;
	}
}