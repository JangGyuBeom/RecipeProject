
public class Delivery extends Manager{
	String dName;
	String poneNum;
	String kinds;
	
	String sql;
	
	Delivery(String name, int price,String dName,String poneNum,String kinds) {
		super(name, price);
		this.dName = dName;
		this.poneNum = poneNum;
		this.kinds = kinds;
	}
	void insert(String name, int price,String dName,String poneNum,String kinds)
	{
		sql = "insert 가게이름,음식이름, 가격, 전화번호, 종류 from 배달 ";
		//Jdbc.code(sql);
	}
	void delete(String name, int price,String dName,String poneNum,String kinds)
	{
		sql = "delete 가게이름, 음식이름  from 배달 where 가게이름 = ***";
		//Jdbc.code(sql);
	}
	void update(String name, int price,String dName,String poneNum,String kinds)
	{
		sql = "update from 배달  where 가게이름 = **** and 음식이름 = ****";
		//Jdbc.code(sql);
	}
}
