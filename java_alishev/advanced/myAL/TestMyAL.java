package myAL;

public class TestMyAL {

	public static void main(String[] args) {

		myAL al = new myAL();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println(al);
		System.out.println(al.get(2));
		al.remove(2);
		System.out.println(al);
		al.add(3);
		System.out.println(al);
		al.remove(7);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
	}
}
