import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("enter 5");
			num = scan.nextInt();
		} while (num != 5);
		System.out.println("you entered 5");
		scan.close();
	}
}
