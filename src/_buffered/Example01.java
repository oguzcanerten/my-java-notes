package _buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) throws IOException {
		File file = new File("buffered.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("line1");
		bw.write("\n");
		bw.write("line2");
		//bw.write("\n");
		//bw.write("line3");
		bw.close(); // fileWriter'a gore bi tık daha performanslı calısır.

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		//br.close();

		String lineContent = null;
        int line = 1;
		while ((lineContent = br.readLine()) != null) { // nullCheck
			System.out.println(line + " --> "+ lineContent); // satır satır okuma
			line++;
		}

	}

}
