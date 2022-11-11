package interfaces;

public class Zoo {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.name = "animal";
		animal.eat();

		Dog dog = new Dog();
		dog.eat();
		dog.name = "dog";
		dog.showName();
		dog.showInfo();

		Human man = new Human();
		man.name = "vova";
		man.showInfo();

		// use interfaces and polymorphism
		Info animal2 = new Animal();
		animal2.showInfo();
		Info man2 = new Human();
		man2.showInfo();

		// use method for Animal and Human objects
		outputInfo(animal);
		outputInfo(man);

		// use method for Info objects
		outputInfo(animal2);
		outputInfo(man2);

		// позднее связывание в полиморфизме
		// Animal ограничивает возможность использовать методы, но если они
		// переназначены в Dog то они будут доступны
		// upcasting - восходящее преобразование
		Animal animal3 = new Dog();
		animal3.eat();

		// downcasting - нисходящее преобразование
		Dog dog2 = (Dog) animal3;
		dog2.eat();


	}

	public static void outputInfo(Info info) {
		info.showInfo();
	}
}
