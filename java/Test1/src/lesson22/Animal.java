package lesson22;

public class Animal {

    int eyes;

    void eat() {
        System.out.println("Animal eats.");
    }

    void drink() {
        System.out.println("Animal drinks.");
    }

    Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am animal with " + this.eyes + " eyes.");
    }
}

class Pet extends Animal {

    String name;
    int tail = 1, paw = 4;

    void run() {
        System.out.println(this.name + " pet runs.");
    }

    void jump() {
        System.out.println("Pet jumps.");
    }

    Pet(String name, int paw, int tail) {
        super(2);
        this.name = name;
        this.tail = tail;
        this.paw = paw;
        System.out.println("I am pet " + this.name + ".");
    }
}

class Dog extends Pet {

    void play() {
        System.out.println(this.name + " plays.");
    }

    Dog(String name, int paw, int tail) {
        super(name, paw, tail);
        System.out.println("I am dog and my name is: " + name + ".");
    }
}


class Cat extends Pet {

    void sleep() {
        System.out.println(this.name + " sleeps.");
    }

    Cat(String name, int paw, int tail) {
        super(name, paw, tail);
        System.out.println("I am cat and my name is: " + name + ".");
    }
}

class Test {

    public static void main(String[] args) {

        Dog pup = new Dog("Pup", 4, 1);
        System.out.println("Pup's paws: " + pup.paw);
        pup.eyes = 1;
        System.out.println("Pup's eyes: " + pup.eyes);
        pup.eat();
        pup.drink();
        pup.run();
        pup.jump();
        pup.play();
        System.out.println();

        Cat pussy = new Cat("Pussy", 4, 1);
        pussy.sleep();
    }
}