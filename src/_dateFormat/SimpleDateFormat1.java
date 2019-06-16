package _dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {
	// DateFormat sýnýfýný kalýtýr.
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date = new Date();
		System.out.println(sdf.format(date));// 8.01.2019 02:05

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy"); // bu harfler sabit bir pattern tablosu var.
		System.out.println(sdf2.format(date));// 08-01-2019

		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yy"); // bu harfler sabit bir pattern tablosu var.//kucuk
																	// buyuk harf duyarlýlýgý var.
		System.out.println(sdf3.format(date));// 08-01-19

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy HH:mm"); // bu sekilde gostereceðin sekli belirlersin.
		System.out.println(sdf4.format(date));// 08-01-2019 02:07 // E harfi gun koyar // a harfi PM AM yazar.

	}

}
