package abstractClassMethod;

public abstract class Animal {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.makeSound();
		dog.eat();
	}

	public void eat() {
		System.out.println("i am eating");
	}

	public abstract void makeSound();
}
