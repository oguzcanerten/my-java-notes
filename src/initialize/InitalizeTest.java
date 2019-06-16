package initialize;

import java.util.Arrays;

public class InitalizeTest {
	
	/* instance ve static deðerlere otomatik olarak deðerler assign edilir. 
	 * 
	 * */

	int intVariable;
	byte byteVariable;
	double doubleVariable;
	String stringVariable;
	int[] arrayVariabl;
	
	public static void main(String[] args) {
		
		InitalizeTest initalizeTest = new InitalizeTest();
		
		
		
		System.out.println(initalizeTest);
	}

	@Override
	public String toString() {
		return "InitalizeTest [intVariable=" + intVariable + ", byteVariable=" + byteVariable + ", doubleVariable="
				+ doubleVariable + ", stringVariable=" + stringVariable + ", arrayVariabl="
				+ Arrays.toString(arrayVariabl) + "]";
	}
}			