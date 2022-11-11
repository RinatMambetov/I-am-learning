interface AbleToTalk {

	public void talk();

	public void eat();
}

class Animal implements AbleToTalk {

	public void eat() {
		System.out.println("animal is eating");
	}

	public void talk() {
		System.out.println("animal is talking");
	}
}

public class AnonimusClass {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		animal.talk();

		// анонимный класс
		Animal animal2 = new Animal() {

			@Override
			public void eat() {
				System.out.println("animal2 is eating");
			}

			@Override
			public void talk() {
				System.out.println("animal2 is talking");
			}
		};
		animal2.eat();
		animal2.talk();

		// анонимный класс с созданием объекта интерфейса
		AbleToTalk animal3 = new AbleToTalk() {

			@Override
			public void talk() {
				System.out.println("animal3 is talking");
			}

			@Override
			public void eat() {
				System.out.println("animal3 is eating");
			}
		};
		animal3.eat();
		animal3.talk();
	}
}
