package _constructor;

public class ogz {
	public static void main(String[] args) {
		 //Dog dog = new Dog();
		 Kangal kangal = new Kangal();
		
	}
}

class Animal {

	Animal() {
		super();
		System.out.println("HELLO FROM ANIMAL");
	}
}


class Dog extends Animal {

	Dog() {
		super();
		System.out.println("HELLO FROM DOG");

	}


	
}
