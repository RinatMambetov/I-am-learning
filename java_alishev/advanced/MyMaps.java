import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMaps {

	public static void main(String[] args) {

		// ключи в Map уникальны и не могут повторяться

		// HashMap в случайном порядке
		Map<Integer, String> hm = new HashMap<>();
		// LinkedHashMap в порядке наполнения
		Map<Integer, String> lhm = new LinkedHashMap<>();
		// TreeMap сортирует по ключу
		Map<Integer, String> tm = new TreeMap<>();

		testMap(hm);
		testMap(lhm);
		testMap(tm);
	}

	private static void testMap(Map<Integer, String> map) {

		map.put(1, "one");
		map.put(10, "ten");
		map.put(-10, "neg_ten");
		map.put(0, "zero");
		map.put(100, "one_hundred");
		map.put(-100, "neg_one_hundred");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println(entry);
		}
		System.out.println();
	}
}
