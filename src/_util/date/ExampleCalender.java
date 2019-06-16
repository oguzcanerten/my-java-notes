package _util.date;

import java.util.Calendar;

public class ExampleCalender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // calendar sýnýfý abstract sýnýf oldugu için instance boyle alýnýr.
		System.out.println(calendar); //tum tarihi ayrýntýlý verir.gun ay yýl vb.
		System.out.println(calendar.get(Calendar.YEAR)); // yýlý çekme
		System.out.println(calendar.get(Calendar.MONTH)); // aylar 0'dan baslýyor. // aslýnda bu da eski date API'de yer alan eksiklik
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.YEAR, 2);
		System.out.println(calendar2); // yýla 2 ekledi
	}
	
}
