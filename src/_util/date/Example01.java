package _util.date;

import java.util.Date;

public class Example01 {

	//yeni versiyonda LocalDate,Java time/date API tarz� �eyler geldi.
	//java.util.date
	//java.util.calendar
	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		
		//1 ocak 1970'den itibaren ge�en zaman�n milisaniye kars�l�g�
		long time = date.getTime();
		System.out.println(time);

	}

}
