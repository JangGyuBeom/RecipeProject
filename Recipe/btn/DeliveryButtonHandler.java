import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeliveryButtonHandler {
	

	public void chinahandler(JTextField textField){ //�߽�

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
			
			int p = Integer.parseInt(s);
		
			s_price.d_ret
			urnSQL("select * from delivery where d_price<="+p+" and d_group='�߽�'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
			}catch(java.lang.NumberFormatException e){
				JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
			}
	}
	
	public void chickenhandler(JTextField textField){ //ġŲ

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='ġŲ'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	
	}
	
	public void japanfoodhandler(JTextField textField){ //�Ͻ�
		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='�Ͻ�'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	}
	
	public void koreanfoodhandler(JTextField textField){ //�ѽ�

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='�ѽ�/�н�'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	
	}
	
	public void westernfoodhandler(JTextField textField){ //���

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='���'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	
	}
	
	public void figsfeethandler(JTextField textField){ //����

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='����/����'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	
	}

	public void steamhandler(JTextField textField){ //��

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='��/��'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	
	}
	public void pizzahandler(JTextField textField){ //����

		try{
			Jdbc s_price = new Jdbc();
			String s = textField.getText();
		
			int p = Integer.parseInt(s);
		
			s_price.d_returnSQL("select * from delivery where d_price<="+p+" and d_group='����'");
			JOptionPane.showMessageDialog(null,"�˻� �Ϸ�");
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"'����'�� �Է��� �ּ���");
		}
	
	}
	

	
	
}
