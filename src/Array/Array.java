package Array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = new int[8];

		System.out.println(number.length);
		for (int i = 0; i < number.length; i++) {
			number[i] = i * 2;
		}
		System.out.println(number.length);

	}

}
