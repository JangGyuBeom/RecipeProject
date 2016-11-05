
public class Recipe extends Manager{
	String cooking;
	int time;
	
	String sql;
	
	Recipe(String name, int price, String cooking,int time) {
		super(name, price);
		this.cooking = cooking;
		this.time = time;
	}
	void insert(String name,int price,String cooking,int time)
	{
		sql = "insert 음식이름,가격,요리순서,예상시간 from 레시피";
		//Jdbc.code(sql);
	}
	void delete(String name,int price,String cooking,int time)
	{
		sql = "";
		//Jdbc.code(sql);
	}
	void update(String name,int price,String cooking,int time)
	{
		sql = "";
		//Jdbc.code(sql);
	}
}
