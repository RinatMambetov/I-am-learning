import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyComparable {

	public static void main(String[] args) {

		List<Person> al = new ArrayList<>();
		Set<Person> ts = new TreeSet<>();

		addElements(al);
		System.out.println("al " + al);
		// сортируется при создании используя наш переназначенный метод compareTo
		addElements(ts);
		System.out.println("ts " + ts);

		// сортируется вручную используя наш переназначенный метод compareTo
		Collections.sort(al);
		System.out.println("sorted al " + al);
	}

	private static void addElements(Collection<Person> col) {
		col.add(new Person(2, "name2"));
		col.add(new Person(1, "name1"));
		col.add(new Person(4, "name4"));
		col.add(new Person(3, "name3"));
	}
}

class Person implements Comparable<Person> {

	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (this.getId() > o.getId())
			return 1;
		else if (this.getId() < o.getId())
			return -1;
		else
			return 0;
	}
}
