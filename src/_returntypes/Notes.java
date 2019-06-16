package _returntypes;

public class Notes {

	/*
	 * Override normalde donus tipi de�i�mez Override metotlarda donus tipi
	 * sub-class'� olabilir. Buna Covariant return ad� verilir.
	 * 
	 */
	 class Computer {
		 
	 }

	class Laptop extends Computer {

	}

	class Store {
		public Computer buyComputer() {
			return new Computer();

		}
	}

	class EStore extends Store {

		@Override
		public Laptop buyComputer() {
			return new Laptop();
		}
	}

}
