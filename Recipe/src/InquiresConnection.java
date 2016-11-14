
public class InquiresConnection {
	public void makeSQL(String text){
		Jdbc jdbc = new Jdbc();
		int num;
		num = jdbc.returnSQL("select max(ask_num) from ask;");
		num++;
		jdbc.updateSQL("insert into ask(ask_num,ask_text) values("+num+",'"+text+"');");
	}
}
