package _local;

import java.util.Locale;

public class Notes {
	// java.util.Locale //cografi bolge.
	public static void main(String[] args) {
		Locale[] allLocals = Locale.getAvailableLocales();
		int counter = 1;
		for (Locale loc : allLocals) {
			System.out.println(counter + "." + loc);
			counter++;
		}
		//standart
		// language_countryCode formatýndadýr.  // eu_ES  , tr_TR
		// language kucuk harf Country buyuk harftir.

	}
}
