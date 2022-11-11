public class WhileFor {
	public static void main(String[] args) {
		int i = 0;

		while (i++ < 5) {
			System.out.println("item is " + i);
		}

		for (int j = 5; j > 0; j--) {
			System.out.println("my_j is " + j);
		}

		if (i > 0)
			System.out.println(i + " > " + 0);
		else
			System.out.println(i + " <= " + 0);
	}
}
