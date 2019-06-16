package _File;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {

		File file = new File("dosya.txt");
		// file objesi olusur.Hard-disk'de yeni bir dosya olusmaz.
		// file.createNewFile(); ---> dosya olusturmak için bu metot kullanýlýr.
		try {
			System.out.println(file.exists());
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// java.io.dosya ya da directory'i gosterebilir.
	// Veri okumak/yazmak için kullanýlmaz.
	// bu sýnýfý yeni bir dosya olusturmak,klasor olusturmak,dosya silmek,isim
	// deðiþtirmek gibi iþlemler için kullanýrýz.
	// File sýnýfý bir dosyayý ya da bir klasor folder dir'i gosterebilir.
}
