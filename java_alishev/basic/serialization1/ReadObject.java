package serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {

		String path = "/Users/rinat/mydev/java_piscine/test0/serialization1/people.bin";
		String path2 = "/Users/rinat/mydev/java_piscine/test0/serialization1/people2.bin";

		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);

			int personCount = ois.readInt();
			Person[] people = new Person[personCount];

			for (int i = 0; i < personCount; i++) {
				people[i] = (Person) ois.readObject();
			}

			for (int i = 0; i < personCount; i++) {
				System.out.println(people[i]);
			}

			ois.close();

			FileInputStream fis2 = new FileInputStream(path2);
			ObjectInputStream ois2 = new ObjectInputStream(fis2);

			Person[] people2 = (Person[]) ois2.readObject();

			for (int i = 0; i < people2.length; i++) {
				System.out.println(people2[i]);
			}

			ois2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
