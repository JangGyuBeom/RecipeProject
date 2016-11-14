
public class CookConnnection {
	void makeSQL(String sql){
		Jdbc jdbc = new Jdbc();
		jdbc.readSQL(sql);
	}
}
