package _pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 {
	public static void main(String[] args) {

		String content = "java";
		Pattern p = Pattern.compile("v");
		Matcher m = p.matcher(content);

		while (m.find()) {
			System.out.println(m.start()+ " " + m.group());// 2 v <-- kaçýncý index oldugu
		}
	}
}
//regex --> regular expression
//java.util.regex.Matcher
//java.util.regex.Pattern