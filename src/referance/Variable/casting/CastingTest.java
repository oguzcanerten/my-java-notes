package referance.Variable.casting;

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}



public class CastingTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Dog dog = (Dog)animal;
	}
}
