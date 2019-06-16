package abc;

public class Car extends Vehicle {
	
	@Override
	public void speedUp() {

	}

	@Override
	public void beCool() {

		System.out.println("");
	}

	@Override
	int goDirection() {
		return 0;
	}
	
   public static void main(String[] args) {
	
	   
	   Car car = new Car();
	   car.beCool();
}	

}
