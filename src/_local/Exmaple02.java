package _local;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Exmaple02 {
public static void main(String[] args) {
	Date date = new Date();
	Locale  locDE = Locale.GERMANY;
	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,locDE);
	System.out.println(dateFormat.format(date)); //Dienstag, 8. Januar 2019
}
}
