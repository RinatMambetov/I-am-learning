package interfaces;

public class Animal implements Info {

	public String name;

	public void eat() {
		System.out.println("animal is eating");
	}

	public void showInfo() {
		System.out.println("animal name is " + name);
	}
}
