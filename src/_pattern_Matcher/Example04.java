package _pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example04 {

	public static void main(String[] args) {
		String content = "content1 con2tent23k.";
		Pattern p = Pattern.compile("\\d"); //  //. yazýlýrsa nokta karakterini bulur. 
		Matcher m = p.matcher(content); // icerik içinde sayýlarý aradý.
		// 7 1
		// 12 2
		// 17 2
		// 18 3

		while (m.find()) {
			System.out.println(m.start() + " " + m.group());

		}

	}

	/*
	 * \d digit \s whitespace \w harf,rakam \D non-digit \S non-whitespace \W
	 * non-word . // nokta karakteri herhangi bir sey gelebilir (joker) anlamýna
	 * gelir.
	 * 
	 */

}
