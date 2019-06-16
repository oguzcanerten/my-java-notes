package _Inýtýalize;


class Initialize{
	
	static {
		System.out.println("static block - 1 ");

	}
	
	Initialize(){
		System.out.println("Constructor block"); // En son bu block çalýþýyor.
	}
	
	static {
		System.out.println("static block -  2");

	}
	
	{
		System.out.println("Instance block");
	}
}

public class Notes {
 
	@SuppressWarnings("deprecation")
	public static void main(String []args) {
		
	 Float f1 = new Float(10.2); // depricate edilmiþ.
	 Float a = f1 + f1 ;
     System.out.println(a);

		
	Initialize initialize1 = new Initialize();
	Initialize initialize2 = new Initialize(); // staticler bi daha çalýþmaz. Instance'lar çalýþýr.

	}

}
