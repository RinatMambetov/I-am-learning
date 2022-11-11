package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(new Animal("cat"));
		listOfAnimals.add(new Animal("dog"));

		List<Dog> listOfDogs = new ArrayList<>();
		listOfDogs.add(new Dog("little dog"));
		listOfDogs.add(new Dog("big dog"));

		printList(listOfAnimals);
		// printList(listOfDogs);
	}

	// для объектов выше Animal -> Object, Animal
	// private static void printList(List<? super Animal> list) {

	// для объектов ниже Animal -> Animal, Dog
	private static void printList(List<? extends Animal> list) {
		for (Animal animal : list) {
			System.out.println(animal);
		}
	}
}
