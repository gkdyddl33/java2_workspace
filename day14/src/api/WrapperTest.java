package api;

public class WrapperTest {
	public static void main(String[] args) {
		Object[] datas = {1,20.42,'a',"ABC"};
		
//		Integer data_I = new Integer(10);	// ¹Ú½Ì
//		int data_i = data_I.intValue();		// ¾ğ¹Ú½Ì
		
		Integer data_I= 10;					// ¿ÀÅä¹Ú½Ì
		int data_i = data_I;				// ¿ÀÅä¾ğ¹Ú½Ì
	}
}
