package _garbage.colection;

public class Notes {

	public static void main(String[] args) {
		Person person = new Person("dasda", "dada");

		person = null;

	}

}

class Person {
	String name;
	String surname;

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

}
