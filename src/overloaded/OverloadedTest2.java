package overloaded;


class Calculator2{
	public double getTotal(double a,double b) {
		System.out.println("double double");
		return a+b;
	}
	
	
	public double getTotal(float a, float b) {
		System.out.println("float float");
		return a+b;
		
	}
	
	public int getTotalInteger(int a,int b) {
		System.out.println("int int");
		return a+b;
	}
	 
	public byte getTotalInteger(byte a,byte b) {
		System.out.println("byte byte");
		return (byte) (a+b);
	}
}


public class OverloadedTest2 {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		cal.getTotal(100.0f, 200.0f);
		
		cal.getTotalInteger((byte)10,(byte)20);//casting yaparak riski göze aldý.
		
	
	}
	
}
