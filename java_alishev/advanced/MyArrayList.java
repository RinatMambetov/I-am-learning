import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		// по соглашению (конвенции) создается объект типа List
		// если например нужно будет часто удалять элементы листа
		// можно будет преобразовать лист в LinkedList
		List<Integer> list = new ArrayList<>();
		System.out.println(list.getClass());

		list = new LinkedList<>();
		System.out.println(list.getClass());

		for (int i = 0; i < 10; i++) {
			list.add(i * 2);
		}

		System.out.println(list);
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// remove неэффективен если нужно удалить элемент из первой половины массива
		// так как под капотом простой массив
		list.remove(5);

		System.out.println();

		for (Integer i : list) {
			System.out.print(i + " ");
		}

		System.out.println();

		list = new ArrayList<>(list);
		System.out.println(list.getClass());
		System.out.println(list);
	}
}
