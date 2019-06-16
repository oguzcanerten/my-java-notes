package aralik;

class Computer {
	private String name;
	private int age;

	public Computer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class Ahmet {

	public static void main(String[] args) {

		Computer computer = new Computer("oguzcan", 32);
		System.out.println(computer);

	}

}
