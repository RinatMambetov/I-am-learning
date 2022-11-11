import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueue {

	public static void main(String[] args) {

		Queue<Person> llq = new LinkedList<>();

		llq.add(new Person(1));
		llq.add(new Person(4));
		llq.add(new Person(3));
		llq.add(new Person(2));

		for (Person person : llq) {
			System.out.println(person);
		}

		Queue<Person> abq = new ArrayBlockingQueue<>(3);

		abq.add(new Person(1));
		abq.add(new Person(2));
		abq.add(new Person(3));

		System.out.println(abq.offer(new Person(4)));
		System.out.println(abq.add(new Person(4)));
	}

	static class Person {

		private int id;

		public Person(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + "]";
		}
	}
}
