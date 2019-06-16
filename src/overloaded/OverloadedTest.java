package overloaded;

public class OverloadedTest {

	public static void main(String[] args) {

		OverloadedTest ot = new OverloadedTest();
		ot.getTotal(3000.3, 300000);
		ot.getTotal(200, 21212);
		ot.getTotal(100, 200.0);
	}

	public int getTotal(int a, int b) {
		System.out.println("int int");
		return a + b;
	}

	// method ismi ayný ise parametre tipi ya da sayýsý farklý olmalýdýr.
	public double getTotal(double a, double b) {
		System.out.println("double double");
		return a + b;
	}
	
	public double getTotal(int a, double b) {
		System.out.println("i double");
		return a + b;
	}

}
