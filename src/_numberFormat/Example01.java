package _numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class Example01 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		double number = 12322.224233;
		System.out.println(nf.format(number));// $12,322.22
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.KOREAN);
		System.out.println(nf2.format(number));// ¤12,322.22
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("tr", "TR"));
		System.out.println(nf3.format(number));// 12.322,22 ?

	}

}
