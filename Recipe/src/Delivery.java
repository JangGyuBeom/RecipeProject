
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
		sql = "insert �����̸�,�����̸�, ����, ��ȭ��ȣ, ���� from ��� ";
		//Jdbc.code(sql);
	}
	void delete(String name, int price,String dName,String poneNum,String kinds)
	{
		sql = "delete �����̸�, �����̸�  from ��� where �����̸� = ***";
		//Jdbc.code(sql);
	}
	void update(String name, int price,String dName,String poneNum,String kinds)
	{
		sql = "update from ���  where �����̸� = **** and �����̸� = ****";
		//Jdbc.code(sql);
	}
}
