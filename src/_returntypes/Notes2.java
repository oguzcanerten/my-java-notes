package _returntypes;

import java.util.ArrayList;

public class Notes2 {

	/*
	 * metot donus tipi reference type ise null dönebilir.(null donmek genelde iyi
	 * bir kod pratiði deðildir)
	 * 
	 */
	// rule1.
	public String getKey() {

		return null;
	}

	// rule1.
	public Integer getValue() {

		return null;
	}

	// arrayler reference type'dýr.
	// reference type oldugu için null donebilir.
	public int[] getValues() {

		return null;
	}

	public static void main(String[] args) {

		char c = 'c';
		System.out.println(c);
		System.out.println((int) c);
		System.out.println((int) Character.MAX_VALUE);

	}

	public int foo2() {
		float f = 31.5f;
		return (int) f;
		/*
		 * ornek olarak donus tipi int ise geriye float,double,long donmek istersek bu
		 * durumda casting yapmak gereklidir.
		 * 
		 * 
		 */
	}

	public void bar() {

		System.out.println("bar");
	}

	public int foo() {

		char c = 'c';
		return c;// char is copatible with int
	}

	/*
	 * char 2byte/16bit unsigned veri tipidir. unsigned -> hepsi pozitif
	 * 
	 * 2*16 -1 deðer 65535
	 */

	

}
