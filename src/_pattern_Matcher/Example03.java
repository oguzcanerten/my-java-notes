package _pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {
	public static void main(String[] args) {
		String content = "abababa";
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher(content);
		/*
		 * 0 ab 2 ab 4 ab
		 * regex iþlemi soldan saða dogru olur
		 * bir kere kullanýlarn index bir daha kullanýlmaz.
		 */

		while (m.find()) {
			System.out.println(m.start() + " " + m.group());

		}
	}
}
