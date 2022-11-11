import java.util.Scanner;

public class Test0 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();

		// после nextDouble и других методов в буфере остается знак \n
		String s = scan.next();
		s += scan.nextLine();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		scan.close();
	}
}
