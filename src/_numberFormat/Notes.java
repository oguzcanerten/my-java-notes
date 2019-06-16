package _numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class Notes {
	// java.next.numberFormat
	// abstract sýnýftýr getInstance ile alýnýr.
	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getInstance(); // factory design pattern ornegi
		double number = 23346.35447;
		System.out.println(number);// 23346.35447

		System.out.println(nf.format(number));// 23.346,354

		NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMANY); // Almanya . yerine , kullanýyor mesela
		System.out.println(nf2.format(number));

	}

}
