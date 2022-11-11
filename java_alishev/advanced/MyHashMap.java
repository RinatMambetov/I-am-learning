import java.util.Map;
import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {

		// HashMap не гарантирует порядок внутри себя, ключ-значение может выдаваться в
		// произвольном порядке
		Map<Integer, String> hm = new HashMap<>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "tree");

		System.out.println(hm);
		System.out.println(hm.get(2));

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
