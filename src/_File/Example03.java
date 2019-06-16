package _File;

import java.io.File;
import java.io.IOException;

public class Example03 {
	public static void main(String[] args) throws IOException {
		File file = new File("old_name.txt");
		file.createNewFile();
		
		File fileNewName = new File("new_file.txt");
		file.renameTo(fileNewName); 
	}

}
