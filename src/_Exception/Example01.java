package _Exception;

public class Example01 {
	public static void main(String[] args) {
    
		try {
			System.out.println(100/0);
			System.out.println("not work");
		} finally {
			System.out.println("finally works! \n");
		}
		
		System.out.println("not works!");
	}
	//try-catch-finally
	//try-finally
}
