package _stringBufferStringBuilder;

public class Example02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1.equals(sb2)); // false olur cunku equals sýnýfý override edilmemiþtir.
		// bu sýnýflarda Direk == ile ayný anlama gelir.toString yapmak zorundayýz.
		
		System.out.println(sb1.toString().equals(sb2.toString())); // bu sefer true olur.

	}

}
