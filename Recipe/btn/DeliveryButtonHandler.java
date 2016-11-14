import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeliveryButtonHandler {
	

	public void chinahandler(JTextField textField){ //중식

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
			
			int p = Integer.parseInt(s);
		
			s_price.d_ret
			urnSQL("select * from delivery where d_price<="+p+" and d_group='중식'");
			JOptionPane.showMessageDialog(null,"검색 완료");
			}catch(java.lang.NumberFormatException e){
				JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
			}
	}
	
	public void chickenhandler(JTextField textField){ //치킨

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='치킨'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	
	}
	
	public void japanfoodhandler(JTextField textField){ //일식
		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='일식'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	}
	
	public void koreanfoodhandler(JTextField textField){ //한식

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='한식/분식'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	
	}
	
	public void westernfoodhandler(JTextField textField){ //양식

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='양식'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	
	}
	
	public void figsfeethandler(JTextField textField){ //족발

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='족발/보쌈'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	
	}

	public void steamhandler(JTextField textField){ //찜

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='찜/탕'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	
	}
	public void pizzahandler(JTextField textField){ //피자

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='피자'");
			JOptionPane.showMessageDialog(null,"검색 완료");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'가격'을 입력해 주세요");
		}
	
	}
	

	
	
}
