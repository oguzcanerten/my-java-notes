package _Exception;

public class Notes {

	public static void main(String[] args) {

		int number = 100;
		/*
		 * System.out.println(number/ 0); //burda crash olur bi sonraki �al��maz
		 * System.out.println("not work");
		 */
		try {
			System.out.println(number / 0);
			System.out.println("not work");//yukarda excepiton oldugunda alt�na ge�miyor.

		} catch (ArithmeticException e) { //baska tip exception yazrsan yakalayamaz.Superi ya da kendisi.
			System.out.println("exception caught!");

		}
	}

}
