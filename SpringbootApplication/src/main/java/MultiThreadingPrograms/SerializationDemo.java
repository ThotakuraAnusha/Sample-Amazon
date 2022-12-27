package MultiThreadingPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {
	public int a;
	public String b;
	// Defining Constructors

	public Demo(int a, String b) {

		this.a = a;
		this.b = b;
	}
}

public class SerializationDemo {

	public static void main(String[] args) {
		Demo obj1 = new Demo(1, "Anusha");
		String filename = "file.ser";

		// Serialization

		try {
			// Saving of objects into a file

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(file);

			// method for Serialization of object

			oos.close();
			file.close();

			System.out.println("Object has been serialized");
		}

		catch (IOException ex) {
			System.out.println("IO Exception is caught");
		}

		Demo object1 = null;

		// Deserialization

		try {
			// Reading the object from a file

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(file);

			// Method for deserialization of Object

			object1 = (Demo) ois.readObject();

			file.close();
			ois.close();

			System.out.println("Object has been deserialized");
			System.out.println("a =  " + object1.a);
			System.out.println("b =  " + object1.b);
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("(ClassNotFoundException is caught");

		}
	}

}
