package _operators;

public class Example {

	public static void main(String[] args) {
		Ford ford = new Ford();
		// bir nevi IS_A kontrolu yapýyor.
		System.out.println(ford instanceof Car);
		// System.out.println(ford instanceof Opel);

	}

}

class Car {

}

class Ford extends Car implements Speedy {

}

class Opel {

}

interface Speedy {

}