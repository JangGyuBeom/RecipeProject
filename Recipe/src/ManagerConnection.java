public class ManagerConnection {
	public void makeSQL(String sql){
		Jdbc jdbc = new Jdbc();
		jdbc.updateSQL(sql);
	}
}
