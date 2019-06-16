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

	// JAVADA STATÝC METODLAR OVERRIDE EDILEMEZLER.

}

public class Test01 {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.retina();
		/*
		 * javada 8 adet primitive tip vardýr gerisi reference tip (String,instance)
		 *
		 * bir baska açýdan deðiþken tipleri
		 * 
		 * local deðiþken instance deðiþken static deðiþken bu deðiþken metod içinde
		 * tanýmlandýgý için local deðiþken. local ve refence type deðiþkendir. = atama
		 * operatoru javada heap memoryde yaþarlar. java uygulamasý calýstýgýnda java os
		 * gibi davranýr mini os bir çalýþtýrma ortamý
		 * 
		 * local deðiþkenler stack'te instance deðiþkenler heap'te yaþar static deðiþken
		 * de heap'de yaþar
		 */
		computer.boot();
		Laptop laptop = new Laptop();
		laptop.boot();

		Computer laptopComputer = new Laptop();

		/*
		 * DEGÝÞKEN TÝPÝ COMPUTER. OBJENIN TIPI ISE LAPTOPTIR.IKI OBJE OLUÞMAZ! LAPTOP
		 * IS-A COMPUTER DOGRU. COMPUTER IS-A LAPTOP ONERMESI YANLISTIR. BÝR REFERENCE
		 * TYPE DEGISKEN KENDI TIPINDE YA DA SUB-CLASS'I OLAN SINIFI GOSTEREBILIR. TERSI
		 * DOGUR DEGILDIR.
		 * 
		 */

		laptopComputer.boot();
		laptopComputer.shutDown();
	}

}
