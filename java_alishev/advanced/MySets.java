import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySets {

	public static void main(String[] args) {

		// Set содержит только уникальные элементы,
		// добавление существующего игнорируется
		// создание объекта класса HashSet реализующего интерфейс Set
		Set<Integer> hs = new HashSet<>(); // вывод в случайном порядке
		Set<Integer> lhs = new LinkedHashSet<>(); // вывод в порядке добавления
		Set<Integer> ts = new TreeSet<>(); // вывод отсортирован

		testSet(hs);
		testSet(lhs);
		testSet(ts);

		// union - объединение множеств
		Set<Integer> union = new HashSet<>(hs);
		union.add(100);
		union.add(101);
		union.add(102);
		union.addAll(hs);
		System.out.println(union);

		// intersection - пересечение множеств, что есть у обоих
		Set<Integer> intersection = new HashSet<>(hs);
		intersection.add(100);
		intersection.add(101);
		intersection.add(102);
		intersection.retainAll(lhs);
		System.out.println(intersection);

		// difference - разность множеств
		Set<Integer> difference = new HashSet<>(hs);
		difference.add(100);
		difference.add(101);
		difference.add(102);
		difference.removeAll(ts);
		System.out.println(difference);
	}

	private static void testSet(Set<Integer> set) {

		set.add(0);
		set.add(-10);
		set.add(20);
		set.add(-30);
		set.add(40);
		set.add(0);

		for (Integer elem : set) {
			System.out.println(elem);
		}
		System.out.println(set.contains(0));
		System.out.println(set.contains(1));
	}
}
