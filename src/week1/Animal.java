package week1;

public class Animal {

	int height = 15;
	static int size = 10;

	public void eat() {
		System.out.println("Animal-Eat");
	}

	static void breathe() {
		System.out.println("Animal-Breathe");
	}
}

class Bird extends Animal {

	int height = 3;
	static int size = 5;

	@Override
	public void eat() {
		System.out.println("Bird-Eat");
	}

	static void breathe() {
		System.out.println("Bird-Breath");
	}

	public void fly() {
		System.out.println("Bird-Fly");
	}

	public static void main(String[] args) {

		Animal a = new Animal();
		Animal b = new Bird();
		Bird c = new Bird();

		a.eat();
		b.eat();
		c.eat();

		a.breathe();
		b.breathe();
		c.breathe();
		// a.fly();
		// b.fly();
		c.fly();
		System.out.println(a.height + " " + a.size);
		System.out.println(b.height + " " + b.size);
		System.out.println(c.height + " " + c.size);
	}

}
