package enums;

public class Test {
	public static void main(String[] args) {

		Animal cat = Animal.CAT;

		System.out.println(cat.getTranslation());
		System.out.println(cat);

		if (cat == Animal.CAT) {
			System.out.println("cat1");
		}

		switch (cat) {
			case CAT:
				System.out.println("cat2");
				break;

			default:
				break;
		}

		// Object -> Enum -> Animal
		// instanceof проверка на родство
		System.out.println(cat instanceof Animal);
		System.out.println(cat instanceof Enum);
		System.out.println(cat instanceof Object);

		// getClass получение родителя
		System.out.println(cat.getClass());

		// получение имени enum
		System.out.println(cat.name());

		// доп способ создания объекта
		Animal dog = Animal.valueOf("DOG");
		System.out.println(dog);

		// порядковый номер enum
		System.out.println(dog.ordinal());
		System.out.println(cat.ordinal());
	}
}
