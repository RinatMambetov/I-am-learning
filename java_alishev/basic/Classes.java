public class Classes {
	public static void main(String[] args) {

		// empty object
		Person pers1 = new Person();
		Person.printCountPersons();

		// not empty object
		Person pers2 = new Person("vova", 30);
		Person.printCountPersons();

		// use self toString
		System.out.println(pers2);

		System.out.println("hello my name is " + pers1.getName() + " i'm " + pers1.getAge());
		System.out.println("hello my name is " + pers2.getName() + " i'm " + pers2.getAge());

		pers1.setName("");
		pers1.setAge(-20);
		System.out.println("hello my name is " + pers1.getName() + " i'm " + pers1.getAge());

		// use final const
		System.out.println("final const is " + Person.CONST);
	}
}

class Person {

	private String name;
	private int age;

	// classes var
	private static int countPersons;

	// final const
	public static final int CONST = 10;

	// default constructor
	public Person() {
		this.name = "name";
		this.age = 1;
		countPersons++;
	}

	// self constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		countPersons++;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			System.out.println("empty name");
			this.name = null;
		} else
			this.name = name;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("age is negative");
			this.age = 0;
		} else
			this.age = age;
	}

	public String getName() {
		return (name);
	}

	public int getAge() {
		return (age);
	}

	// classes method
	public static void printCountPersons() {
		System.out.println("amount of persons is " + countPersons);
	}

	public String toString() {
		return (name + " " + age);
	}
}
