package Assignment;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		Person person2 = person;
		//Assignment yapt�g�m�zda art�k person2 objesi de person objesini gostermektedir.
		//Elinde bu adres bilgisi yer almakta.
		
		person2 = null;
		//herhangi bir adresti bilgisini u�urduk art�k bir adres bilgisine sahip de�il.
		//objeye herhangi bir m�dahale yok sadece adres bilgisini ucurduk.
		

	}

}
