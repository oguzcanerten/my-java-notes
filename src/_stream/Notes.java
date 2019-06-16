package _stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Notes {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("fos.txt");
		String content = "content line1";
		fos.write(content.getBytes());
		fos.close();
		
		//FileInputStream fis = new FileInputStream("fos.txt");
		
	}
	
	//Writer/Reader -> character oriented
	//InputStream/OutputStream -> Byte oriented

}
