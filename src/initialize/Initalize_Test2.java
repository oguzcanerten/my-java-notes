package initialize;

public class Initalize_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		System.out.println(person.getName().length());
		
		/*
		 *  java.lang.NullPointerException
		 *  
		 *  null de�ere sahip bir reference type de�i�ken �zerinden instance bir metot �a��r�l�rsa  java.lang.NullPointerException hatas� al�n�r.
		 *  
		 *  
		 */

	}

}

class Person {

	private String name;
	
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
