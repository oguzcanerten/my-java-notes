package x;

public class A {
public static void main(String[] args) {
	Laptop laptop = new Laptop();
}
}

class Computer {

	private String brand;
	private String model;

	public Computer(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

}

class Laptop extends Computer {

	Laptop() {
		super("brand", "model");
		System.out.println("oldu lan");

	}

}
