package _Wrapper;

public class WrapperTest {

	public static void main(String[] args) {

		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10");
		//ValueOf String ve int i�in Integer'a �evrimi i�in kullan�l�r.
		//static factory method olarak ge�er.
		//constructor yerine obje olu�turmak i�in kullan�lar metottur.
		Float f1 = Float.valueOf("100.5");
		// Float -> Float
		// String -> Float

	}

}
