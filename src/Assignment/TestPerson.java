package Assignment;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		Person person2 = person;
		//Assignment yaptýgýmýzda artýk person2 objesi de person objesini gostermektedir.
		//Elinde bu adres bilgisi yer almakta.
		
		person2 = null;
		//herhangi bir adresti bilgisini uçurduk artýk bir adres bilgisine sahip deðil.
		//objeye herhangi bir müdahale yok sadece adres bilgisini ucurduk.
		

	}

}
