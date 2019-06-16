package _Exception;

public class Example03 {

	public static void main(String[] args) {
		method1();
	}

	static void method1() {
		method2();
	}

	static void method2() {

		try {
			method3();
		} catch (Exception e) {
			System.out.println("Error2!");
		}

	}

	static void method3() {
		System.out.println(100 / 0);

	}

}
