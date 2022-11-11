package exceptions1;

import java.util.Scanner;

public class Exceptions1 {

	public static void main(String[] args) throws MyException {

		Scanner scan = new Scanner(System.in);
		while (true) {
			int num = scan.nextInt();
			if (num != 0) {
				scan.close();
				throw new MyException("!!!not zero!!!");
			}
		}
	}
}

// checked exseptions (compiletime exceptions) - исключительные случаи в работе
// программы,
// решаются через throw, try, catch

// unchecked exseptions (runtime exceptions) - ошибка в работе программы
// например деление на ноль, (null).length()
