package _buffered;

import java.io.File;

public class Example03 {

	public static void main(String[] args) {

		File file = new File("."); // . current directory anlamýna gelir.

		String[] names = file.list();

		for (String n : names) {
			System.out.println(n);
		}
		System.out.println();

		File[] files = file.listFiles(); // bu array'e atýyor.

		for (File f : files) {
			if (f.isDirectory()) { // sadece directoryler geldi.
				System.out.println(f);

			} else if (f.isHidden()) {
				System.out.println("hidden : " + f.getAbsolutePath());
			} else {
				System.out.println("normal file : " + f.getAbsolutePath());
			}
		}

	}

}
