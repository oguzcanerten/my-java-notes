package _seriallizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Notes {

	// java.io.Serializable paketinde yer al�r.
	//objenin state'ini kaydetmeye yarar.Session yap�lar.
	// �bu objeyi instance variable�lariyla birlikte kaydet(save)� anlamina gelmektedir. 

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Laptop laptop = new Laptop();
		laptop.price = 10000;
		laptop.brand = "apple";
		
		

		FileOutputStream fos = new FileOutputStream("laptop.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(laptop);
		oos.close();

		FileInputStream fis = new FileInputStream("laptop.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Laptop laptopFound = (Laptop) ois.readObject();
		System.out.println(laptopFound.price);
		System.out.println(laptopFound.brand);

	}

}

class Laptop implements Serializable {
	int price;
	transient String brand; // bu anahtar kelime serile�tirme yapt�g�m�zda pas ge�ilmesini saglar.Yerine
							// null yazar.
}
