import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();

		measureTime(al);
		measureTime(ll);
	}

	private static void measureTime(List<Integer> list) {

		// al faster add then ll
		long startAdd = System.currentTimeMillis();
		for (int i = 0; i < 1e6; i++) {
			list.add(i);
		}
		long endAdd = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " addTime " + (endAdd - startAdd));

		// al faster get then ll
		long startGet = System.currentTimeMillis();
		for (int i = 0; i < 1e4; i++) {
			list.get(i);
		}
		long endGet = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " getTime " + (endGet - startGet));

		// ll faster remove then al
		long startRemove = System.currentTimeMillis();
		for (int i = 0; i < 1e3; i++) {
			list.remove(i);
		}
		long endRemove = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " RemoveTime " + (endRemove - startRemove));

		// ll faster addHead then al
		long startAddHead = System.currentTimeMillis();
		for (int i = 0; i < 1e3; i++) {
			list.add(0, i);
		}
		long endAddHead = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " addHeadTime " + (endAddHead - startAddHead));

		// ll convert to al faster then vice versa
		if (list.getClass().getSimpleName().equals("ArrayList")) {
			long startALtoLL = System.currentTimeMillis();
			list = new LinkedList<>(list);
			long endALtoLL = System.currentTimeMillis();
			System.out.println("ALtoLLTime " + +(endALtoLL - startALtoLL));

			long startLLtoAL = System.currentTimeMillis();
			list = new ArrayList<>(list);
			long endLLtoAL = System.currentTimeMillis();
			System.out.println("LLtoALTime " + +(endLLtoAL - startLLtoAL));
		}
	}
}
