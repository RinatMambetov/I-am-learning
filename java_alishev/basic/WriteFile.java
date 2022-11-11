import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws FileNotFoundException {

		String path0 = "/Users/rinat/mydev/java_piscine/test0/text0";
		File file0 = new File(path0);

		// rewrite
		PrintWriter pw1 = new PrintWriter(file0);
		pw1.println("1 line");
		pw1.println("2 line");
		pw1.close();

		// for append
		PrintWriter pw2 = new PrintWriter(new FileOutputStream(file0, true));
		pw2.println("3 line\n");
		pw2.close();
	}
}
