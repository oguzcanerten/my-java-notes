package _pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {

	public static void main(String[] args) {

		String content = "injavawetrust";
		Pattern p = Pattern.compile("t"); // araya | konulabilir veya anlam� kadar coklu arama yap�labilir.
		Matcher m = p.matcher(content);
        // [jwt] --> j|w|t anlam�na gelir.//^ bunlar�n d�s�nda anlam�na gelir xor 
		while (m.find()) {
			System.out.println(m.start()+ " " + m.group());// 8 t -- 12 t
			

		}

	}

}
