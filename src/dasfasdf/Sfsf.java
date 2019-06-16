package dasfasdf;

public class Sfsf {
	

	public static void main(String[] args) {
		
		Employee employee = new Employee();
	}

}

class Employee {
	private String name;
	private int age;
	private int salary;
	
	public Employee(){
		this("guest",20);
		System.out.println("no-arg paramater");
	}

	public Employee(String name, int age) {
		
		this("guest",22,5000);
		System.out.println("two paramaters");

	}

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("three paramaters");

	}
	
	

}
