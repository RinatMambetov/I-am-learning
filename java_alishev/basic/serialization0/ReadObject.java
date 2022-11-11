package serialization0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {

		String path = "/Users/rinat/mydev/java_piscine/test0/serialization0/people.bin";

		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Person person1 = (Person) ois.readObject();
			Person person2 = (Person) ois.readObject();

			System.out.println(person1);
			System.out.println(person2);

			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
