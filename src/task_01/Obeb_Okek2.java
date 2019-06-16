package task_01;

import java.util.Scanner;

public class Obeb_Okek2 {
	// greatest common divisor
	public static void main(String[] args) {
		System.out.println(" GDC: " + getGdc(12, 48, 24, 5));
		System.out.println(" GDC: " + getGdc(12, 48, 24));
	}

	public static int getGdc(int... x) {
		// get the smallest of all number no need to check for higher values
		int smallest = getSmallest(x);

		for (int i = smallest; i >= 1; i--) {
			int j;
			for (j = 0; j < x.length; ++j) {
				if (x[j] % i != 0)
					break;
			}
			// if we pass through the array with all % == 0 return the value
			if (j == x.length)
				return i;
		}
		// so the only possible is 1
		return 1;
	}

	// return smallest number of an array of int
	public static int getSmallest(int[] x) {
		int smallest = x[0];
		for (int i = 1; i < x.length; ++i) {
			if (x[i] < smallest)
				smallest = x[i];
		}
		return smallest;
	}
}
/*
 * System.out.println("kaç sayý gireceksiniz"); Scanner r = new
 * Scanner(System.in); int j = r.nextInt();
 * System.out.println("sayýlarý girin"); int k = 1; for (int t = 0; t < 1000;
 * t++) { int x = a.nextInt(); int y = a.nextInt(); int z = a.nextInt(); for
 * (int i = 1; i <= Math.min(x, y); i++) { if (x % i == 0 && y % i == 0 && z % i
 * == 0) k = i; } } System.out.println("the biggest common divisor is " + k); }
 */
