package _stringBufferStringBuilder;

public class Example02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1.equals(sb2)); // false olur cunku equals s�n�f� override edilmemi�tir.
		// bu s�n�flarda Direk == ile ayn� anlama gelir.toString yapmak zorunday�z.
		
		System.out.println(sb1.toString().equals(sb2.toString())); // bu sefer true olur.

	}

}
