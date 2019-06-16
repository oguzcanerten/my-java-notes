package _writerAndReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notes {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("file1.txt");
		fw.write("line1");
		fw.write("\n");
		fw.write("line2");
		fw.write("\n");
		fw.write("line3");
		fw.close(); //close etmeyi unutma.
		
		FileReader fr = new FileReader("file1.txt");
		char[] input = new char[1000];
		fr.read(input);
		
		for(char c : input) {
			System.out.print(c);
		}
		
		//doc,docx excel dosyalarý için apache POI
		//pdf dosyalarý için jasperReports

	}

	// reader/writer
	// stream

}
