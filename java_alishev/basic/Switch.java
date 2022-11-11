import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num by string");
		String str = scan.nextLine();
		switch (str) {
			case "zero":
				System.out.println("yor entered 0");
				break;
			case "one":
				System.out.println("yor entered 1");
				break;
			case "two":
				System.out.println("yor entered 2");
				break;
			default:
				System.out.println("yor entered ?");
		}
		scan.close();
	}
}
