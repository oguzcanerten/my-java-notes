package referenceCasting;



class Animal {

}

class Dog extends Animal {

	public void eat() {
		System.out.println("Dog eat...");

	}

	public void bark() {

		System.out.println("Dog bark...");
	}
}



public class Test01 {

	public static void main(String[] args) {

		Animal animalDog = new Dog();
		// deðiþken tipi Animal
		// objenin tipi Dog

		Dog dog = (Dog) animalDog;

		dog.bark();

		
	}
}

// upcasting
// downcasting