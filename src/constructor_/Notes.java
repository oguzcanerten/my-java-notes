package constructor_;

class Car{
	
	private String brand;
	private String model;
	
	
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	public Car(){
		
	}
	 
	public void isimGetir() {
		
	   System.out.print(brand);
	   System.out.println(model);
	}

    }

public class Notes {

	public static void main(String[] args) {
		Car car = new Car("opel","astra");
		car.isimGetir();
		Car car2 = new Car();

	}

}
