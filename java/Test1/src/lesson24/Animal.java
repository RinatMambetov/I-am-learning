package lesson24;

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();

    abstract void printName();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
    }

    void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы.");
    }

    abstract void swim();
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает.");
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба, которая ест обычный рыбий корм.");
    }

    @Override
    void printName() {
        System.out.println(name);
    }
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
//        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " поёт.");
    }
}

class Penguin extends Bird {

    Penguin(String name) {
        super(name);
//        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу.");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу.");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать.");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи.");
    }

    @Override
    void printName() {
        System.out.println(name);
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
    }

    abstract void run();
}

class Lion extends Mammal {

    Lion(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Лев как любой хищник любит мясо.");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит.");
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка.");
    }

    @Override
    void printName() {
        System.out.println(name);
    }
}

interface Speakable {

    default void speak() {
        System.out.println("Кто-то говорит.");
    }
}

class Lesson24 {

    public static void main(String[] args) {

        Mechenosec mech = new Mechenosec("Sword");
//        System.out.println(mech.name);
        mech.printName();
        mech.eat();
        mech.swim();
        mech.sleep();
        System.out.println();

        Speakable peng = new Penguin("Peng");
        peng.speak();
        System.out.println();

        Animal lion = new Lion("Simba");
//        System.out.println(lion.name);
        lion.printName();
        lion.eat();
        lion.sleep();
        System.out.println();

        Mammal lion2 = new Lion("Mufasa");
        lion2.printName();
        lion2.eat();
        lion2.sleep();
        lion2.run();
        lion2.speak();
    }
}