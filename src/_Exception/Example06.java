package _Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Example06 {

	public static void main(String[] args) { // checked excepitonlar için geçerli ya throws yapcak ya da try catch'e
											 // alcak.
		try {
			FileWriter fw = new FileWriter("dosya.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// throws'da checked exceptionlarda kullanýlýr.

	}

}
