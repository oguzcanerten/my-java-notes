package initialize;

public class Initalize_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		System.out.println(person.getName().length());
		
		/*
		 *  java.lang.NullPointerException
		 *  
		 *  null deðere sahip bir reference type deðiþken üzerinden instance bir metot çaðýrýlýrsa  java.lang.NullPointerException hatasý alýnýr.
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
