package _more_overloaded;

public class Example01 {

	public static void main(String[] args) {

		Short s = 10;
		overloaded(s);
	}
    
	public static void overloaded(short s) {
		System.out.println("short overloaded");
	}
	//Short IS-A number
	public static void overloaded(Number n) {
		System.out.println("number overloaded");

	}
}
