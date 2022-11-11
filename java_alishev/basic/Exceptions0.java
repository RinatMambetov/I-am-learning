import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions0 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("q");
		try {
			Scanner scan = new Scanner(file);
			System.out.println("after try");
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("after catch");
		}
		System.out.println("after try_catch");

		readFile();
	}

	private static void readFile() throws FileNotFoundException {
		File file = new File("text0");
		Scanner scan = new Scanner(file);
		scan.close();
	}
}
