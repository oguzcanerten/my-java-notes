package _returntypes;

public class Notes {

	/*
	 * Override normalde donus tipi deðiþmez Override metotlarda donus tipi
	 * sub-class'ý olabilir. Buna Covariant return adý verilir.
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
