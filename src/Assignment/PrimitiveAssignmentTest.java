package Assignment;

public class PrimitiveAssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		//2 ve 3 say�lar�n� int gibi kabul eder.
		//arkaplanda byte'a cast i�lemi yap�l�r. fakat toplamlar� olunca bu i�lemi arkaplanda y�r�tmez.
		//otomatik narrow i�lemi yap�l�r.
		byte a = 2 ;
		byte b = 3 ;
		
		byte c = (byte) (a + b);//veri kayb� riski var.

		System.out.println(c);
	}

}
