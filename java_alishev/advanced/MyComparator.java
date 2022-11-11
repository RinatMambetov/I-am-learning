import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyComparator {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("qaz");
		al.add("ws");
		al.add("e");
		al.add("rfv");
		al.add("tg");

		System.out.println(al);
		// сортировка через анонимный класс
		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length())
					return 1;
				else if (o1.length() < o2.length())
					return -1;
				else
					return 0;
			}
		});
		System.out.println(al);

		List<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(-1);
		ll.add(0);
		ll.add(10);
		ll.add(-10);

		System.out.println(ll);
		// сортировка через создание экземпляра класса
		Collections.sort(ll, new CompareLL());
		System.out.println(ll);

		List<Person> people = new ArrayList<>();
		people.add(new Person(2, "name2"));
		people.add(new Person(1, "name1"));
		people.add(new Person(3, "name3"));
		System.out.println(people);
		// сортировка своего класса
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(MyComparator.Person o1, MyComparator.Person o2) {
				if (o1.getId() > o2.getId())
					return 1;
				else if (o1.getId() < o2.getId())
					return -1;
				else
					return 0;
			}
		});
		System.out.println(people);
	}

	public static class CompareLL implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 > o2)
				return -1;
			else if (o1 < o2)
				return 1;
			else
				return 0;
		}
	}

	public static class Person {

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

	}
}
