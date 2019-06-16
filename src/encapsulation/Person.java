package encapsulation;

public class Person {

	private String name;
	private String surname;
	private int age;

	/*
	 * ide ile olusturdugumuzda zaten kurala uygun olarak olusturulur.
	 *
	 * 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

		if (age == 0) {
			age = 0;
		}
	}

}
