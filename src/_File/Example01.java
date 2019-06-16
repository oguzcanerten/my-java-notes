package _File;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {

		File file = new File("dosya.txt");
		// file objesi olusur.Hard-disk'de yeni bir dosya olusmaz.
		// file.createNewFile(); ---> dosya olusturmak i�in bu metot kullan�l�r.
		try {
			System.out.println(file.exists());
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// java.io.dosya ya da directory'i gosterebilir.
	// Veri okumak/yazmak i�in kullan�lmaz.
	// bu s�n�f� yeni bir dosya olusturmak,klasor olusturmak,dosya silmek,isim
	// de�i�tirmek gibi i�lemler i�in kullan�r�z.
	// File s�n�f� bir dosyay� ya da bir klasor folder dir'i gosterebilir.
}
