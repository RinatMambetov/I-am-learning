package myLL;

public class TestMyLL {

	public static void main(String[] args) {

		MyLL ll = new MyLL();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll.getSize());
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.remove(2);
		System.out.println(ll);
	}
}
