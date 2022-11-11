package serialization0;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {

		Person person1 = new Person(1, "name1");
		Person person2 = new Person(2, "name2");

		String path = "/Users/rinat/mydev/java_piscine/test0/serialization0/people.bin";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(person1);
			oos.writeObject(person2);

			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
