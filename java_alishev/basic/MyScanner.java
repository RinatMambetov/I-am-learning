import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {
		String enter = new String("enter");
		Scanner scan = new Scanner(System.in);
		System.out.println(enter + " string");
		String str = scan.nextLine();
		System.out.println("you entered " + str);
		System.out.println(enter + " int");
		int num = scan.nextInt();
		System.out.println("you entered " + num);
		scan.close();
	}
}
