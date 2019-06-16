package Assignment;

public class Notes {

	public static void main(String[] args) {
		int age = 10;
		System.out.println(age);
		
		updateAge(age);
		System.out.println(age);
}
	static void updateAge(int number) {
		number =+ 20;
		System.out.println(number);
	}

}
