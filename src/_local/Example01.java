package _local;

import java.util.Locale;

public class Example01 {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale); //tr_TR
		
		Locale locale2 = new Locale("tr","TR");
		System.out.println(locale2.getLanguage());//tr
		System.out.println(locale2.getCountry());//TR
		System.out.println(locale2.getDisplayCountry());//Türkiye
		System.out.println(locale2.getDisplayLanguage());//Türkçe


	}

}
