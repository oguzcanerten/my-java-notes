package _dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Notes {
	//java.text.DateFormat
	//public abstract class DateFormat extends Format // format class'ýný kalýtýr.abstract class'dýr. 
	//SimpleDateFormat sýnýfý  da dateFormatý'ý kalýtmakta.

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df1 = DateFormat.getInstance();
		System.out.println(date); //Tue Jan 08 01:46:52 EET 2019
		System.out.println(df1.format(date)); //8.01.2019 01:46
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df2.format(date));//8 Ocak 2019
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df3.format(date));//8 Oca 2019 ---> BU NIYE BOYLE OLDU ANLAMADIM.
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df4.format(date));//8 Ocak 2019 Salý


	}

}
