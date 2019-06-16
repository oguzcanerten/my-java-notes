package override;

class Computer {

	int processor = 2;
	static int ram = 4;

	public void boot() {

		System.out.println("booting");
	}

	public static void shutDown() {

		System.out.println("Computer ShutDown ...");
	}

	public void retina() {
		System.out.println("cool retina...");

	}

	private void reset() {

		System.out.println("Computer Reset");
	}
	// private metotlar override edilemezler.

}

class Laptop extends Computer {

	int processor = 8;
	static int ram = 16;

	@Override
	public void boot() {

		System.out.println("Laptop boooting...");

	}

	public static void shutDown() {

		System.out.println("Laptop ShutDown ...");
	}

	// JAVADA STAT�C METODLAR OVERRIDE EDILEMEZLER.

}

public class Test01 {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.retina();
		/*
		 * javada 8 adet primitive tip vard�r gerisi reference tip (String,instance)
		 *
		 * bir baska a��dan de�i�ken tipleri
		 * 
		 * local de�i�ken instance de�i�ken static de�i�ken bu de�i�ken metod i�inde
		 * tan�mland�g� i�in local de�i�ken. local ve refence type de�i�kendir. = atama
		 * operatoru javada heap memoryde ya�arlar. java uygulamas� cal�st�g�nda java os
		 * gibi davran�r mini os bir �al��t�rma ortam�
		 * 
		 * local de�i�kenler stack'te instance de�i�kenler heap'te ya�ar static de�i�ken
		 * de heap'de ya�ar
		 */
		computer.boot();
		Laptop laptop = new Laptop();
		laptop.boot();

		Computer laptopComputer = new Laptop();

		/*
		 * DEG��KEN T�P� COMPUTER. OBJENIN TIPI ISE LAPTOPTIR.IKI OBJE OLU�MAZ! LAPTOP
		 * IS-A COMPUTER DOGRU. COMPUTER IS-A LAPTOP ONERMESI YANLISTIR. B�R REFERENCE
		 * TYPE DEGISKEN KENDI TIPINDE YA DA SUB-CLASS'I OLAN SINIFI GOSTEREBILIR. TERSI
		 * DOGUR DEGILDIR.
		 * 
		 */

		laptopComputer.boot();
		laptopComputer.shutDown();
	}

}
