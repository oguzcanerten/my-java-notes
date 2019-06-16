package _pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {

	public static void main(String[] args) {

		String content = "injavawetrust";
		Pattern p = Pattern.compile("t"); // araya | konulabilir veya anlamý kadar coklu arama yapýlabilir.
		Matcher m = p.matcher(content);
        // [jwt] --> j|w|t anlamýna gelir.//^ bunlarýn dýsýnda anlamýna gelir xor 
		while (m.find()) {
			System.out.println(m.start()+ " " + m.group());// 8 t -- 12 t
			

		}

	}

}
