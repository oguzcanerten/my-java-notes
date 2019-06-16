package _File;

import java.io.File;
import java.io.IOException;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("oguzcan");
		fl.mkdir();
		
		File file = new File(fl,"erten.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(fl.isDirectory());
		System.out.println(fl.getAbsolutePath());
		
		System.out.println(fl.isFile());
		//System.out.println(file.delete()); //klasorun içinde bir sey varken silmez.false doner.

	}

}
