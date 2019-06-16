package _dateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Example01 {

	public static void main(String[] args) throws ParseException {
		DateFormat df  = DateFormat.getDateInstance();
		Date date = new Date();
		System.out.println(df.format(date));
		
		String str = "8 Oca 2019";
		System.out.println(df.parse(str));
		
		//parse metodu String'den date'e donusum saglar Exception da fýrlatýr.
		//checked Exception throws ParseException //sýkýntý olursa hata fýrlatýr.


	}

}
