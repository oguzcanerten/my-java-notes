package _util.date;

import java.util.Date;

public class Example01 {

	//yeni versiyonda LocalDate,Java time/date API tarzý þeyler geldi.
	//java.util.date
	//java.util.calendar
	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		
		//1 ocak 1970'den itibaren geçen zamanýn milisaniye karsýlýgý
		long time = date.getTime();
		System.out.println(time);

	}

}
