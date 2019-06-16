package _String;

public class Example02{
	public static void main(String[] args) {
		String x2 = "java";
		String y2 = "java";
		
		String str = new String("oguzcan");
		String str2 = new String("oguzcan");
		
		System.out.println(str == str2); //false
		System.out.println(x2.equals(y2)); // true
 		System.out.println(x2==y2); //true
	}
}
