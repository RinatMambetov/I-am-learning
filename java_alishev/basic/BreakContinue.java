public class BreakContinue {
	public static void main(String[] args) {
		int i = 0;

		while (true) {
			if (i == 10)
				break;
			System.out.println("item is " + i);
			i++;
		}

		while (i > 0) {
			i--;
			if (i % 2 == 0)
				continue;
			System.out.println("item " + i + " is odd");
		}
	}
}
