package enums;

public class Coffee {
	
	enum CoffeeSize{BIG,MEDIUM,SMALL}
	
	CoffeeSize size;
	public static void main(String[] args) {
	
		Coffee drink = new Coffee();

		drink.size = CoffeeSize.BIG;
		
		System.out.println("i want "+ drink.size +" Size Coffee");
		
	}
		
	
			

}
