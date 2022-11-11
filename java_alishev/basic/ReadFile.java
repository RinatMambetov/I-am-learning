import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {

		String separator = File.separator;
		String path0 = separator + "Users/rinat/mydev/java_piscine/test0/text0";
		File file0 = new File(path0);
		Scanner scan0 = new Scanner(file0);
		while (scan0.hasNextLine()) {
			System.out.println(scan0.nextLine());
		}
		scan0.close();

		String path1 = separator + "Users/rinat/mydev/java_piscine/test0/text1";
		File file1 = new File(path1);
		Scanner scan1 = new Scanner(file1);
		String line = scan1.nextLine();
		String[] numsString = line.split(" ");
		int[] nums = new int[numsString.length];
		int counter = 0;
		for (String num : numsString) {
			nums[counter++] = Integer.parseInt(num);
			System.out.println(nums[counter - 1]);
		}
		scan1.close();
	}
}
