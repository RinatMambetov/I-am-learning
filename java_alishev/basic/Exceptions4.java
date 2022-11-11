import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {

	public static void main(String[] args) {

		try {
			run();
			// multycatch
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	public static void run() throws IOException, ParseException {
	}
}
