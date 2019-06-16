package Assignment;

public class PrimitiveAssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		//2 ve 3 sayýlarýný int gibi kabul eder.
		//arkaplanda byte'a cast iþlemi yapýlýr. fakat toplamlarý olunca bu iþlemi arkaplanda yürütmez.
		//otomatik narrow iþlemi yapýlýr.
		byte a = 2 ;
		byte b = 3 ;
		
		byte c = (byte) (a + b);//veri kaybý riski var.

		System.out.println(c);
	}

}
