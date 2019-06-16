package _String;

public class Example03 {
	public static void main(String[] args) {
		String isim = "oðuzcan erten";
		int length = isim.length();
		boolean isEmpty = isim.isEmpty();
		System.out.println("uzunluk: " + length + "  --  " + "kontrol: " + isEmpty);
		System.out.println(isim.charAt(4));
		System.out.println(isim.startsWith("og"));
		System.out.println(isim.substring(1, 3)); // 1 dahil 3 deðil [1,3)
		System.out.println(isim.toUpperCase());
		/*
		 * 
		 * uzunluk: 13 -- kontrol: false c false ðu OÐUZCAN ERTEN
		 * 
		 */
	}
}
