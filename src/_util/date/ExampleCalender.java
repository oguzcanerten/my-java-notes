package _util.date;

import java.util.Calendar;

public class ExampleCalender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // calendar s�n�f� abstract s�n�f oldugu i�in instance boyle al�n�r.
		System.out.println(calendar); //tum tarihi ayr�nt�l� verir.gun ay y�l vb.
		System.out.println(calendar.get(Calendar.YEAR)); // y�l� �ekme
		System.out.println(calendar.get(Calendar.MONTH)); // aylar 0'dan basl�yor. // asl�nda bu da eski date API'de yer alan eksiklik
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.YEAR, 2);
		System.out.println(calendar2); // y�la 2 ekledi
	}
	
}
