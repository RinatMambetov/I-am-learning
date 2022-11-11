package serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {

		Person person1 = new Person(1, "name1", "desc1");
		Person person2 = new Person(2, "name2", "desc2");
		Person person3 = new Person(3, "name3", "desc3");

		String path = "/Users/rinat/mydev/java_piscine/test0/serialization1/people.bin";
		String path2 = "/Users/rinat/mydev/java_piscine/test0/serialization1/people2.bin";

		Person[] people = { person1, person2, person3 };

		// try с ресурсами, когда после try в круглых скобках создается объект потока
		// закрывать такой поток вручную не нужно, он закрывается автоматически
		// автоматически закрываются все классы наследуемые от класса Closeable
		try (ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(path2))) {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// добавление длины массива
			oos.writeInt(people.length);
			// добавление элементов массива
			for (Person person : people) {
				oos.writeObject(person);
			}

			oos.close();

			// добавление всего массива разом
			oos2.writeObject(people);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
