import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeEquals {

	/**
	 * переопределил методы hashCode и equals в классе Person
	 * теперь при добавлении одинаковых объектов в Set или Map
	 * они будут игнорироваться
	 *
	 * в первую очередь используется метод hashCode
	 * если он выдал разные значения, то конец сравнения
	 * если результаты одинаковые, то запускается медот equals
	 * так как может быть коллизия и hashCode
	 * даст одинаковый результат для разных объектов
	 */
	public static void main(String[] args) {

		Map<Person, Integer> map = new HashMap<>();
		Set<Person> set = new HashSet<>();

		Person person1 = new Person(1, "name1");
		Person person2 = new Person(1, "name1");

		map.put(person1, 1);
		map.put(person2, 2);

		set.add(person1);
		set.add(person2);

		System.out.println(map);
		System.out.println(set);
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

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
	}
}
