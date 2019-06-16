package _buffered;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("printWriter.txt");
		pw.println("line1");
		pw.println("line1");
		pw.println("line1");
		pw.close();
		
		//PrintWriter sýnýfý var PrintReader sýnýfý yok
		
		


	}

}
