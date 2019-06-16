package ReferenceVariable;



class Animal {
	void eat() {
		System.out.println("Animal Eat");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("Dog Eat");
	}

	void bark() {
		System.out.println("Dog Bark");
	}
}

public class CastTest {
	public static void main(String[] args) {
		Animal[] animal = { new Animal(), new Dog(), new Animal() };
		for (Animal a : animal) {
			a.eat();
			if (a instanceof Dog) {
				// a.bark();
				((Dog) a).bark();
			}
		}
	}
}
