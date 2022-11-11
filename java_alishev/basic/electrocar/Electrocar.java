package electrocar;

public class Electrocar {

	private int id;
	private static int statInt = 2;

	public Electrocar(int id) {
		this.id = id;
	}

	// вложенный нестатический класс
	public class Motor {
		public void startMotor() {
			System.out.println(id + " start motor");
		}
	}

	// статический вложенный класс, имеет доступ только к статическим полям
	public static class Battery {
		public void charge() {
			System.out.println(statInt + " charging battery");
		}
	}

	public void start() {
		Motor motor = new Motor();
		motor.startMotor();

		Battery battery = new Battery();
		battery.charge();

		int innerVar = 3;

		// класс внутри метода
		class InnerClass {
			public void innerMethod() {
				System.out.println(id + " innerMethod");
				System.out.println(innerVar + " innerMethod");
			}
		}

		InnerClass innerClass = new InnerClass();
		innerClass.innerMethod();
	}
}
