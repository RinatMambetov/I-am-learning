package lesson25;

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
        this.name = name;
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
        this.name = name;
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

        Speakable spPeng = new Penguin("spPeng");
        Speakable spLeo = new Lion("spLeo");

        Animal anMech = new Mechenosec("anMech");
        Animal anPeng = new Penguin("anPeng");
        Animal anLeo = new Lion("anLeo");

        Fish fiMech = new Mechenosec("fiMech");
        Mechenosec meMech = new Mechenosec("meMech");

        Bird biPeng = new Penguin("biPeng");
        Penguin pePeng = new Penguin("pePeng");

        Mammal maLeo = new Lion("maLeo");
        Lion liLeo = new Lion("liLeo");

        Speakable[] speakableArray = {spPeng, spLeo, biPeng, pePeng, maLeo, liLeo};
        Animal[] animalArray = {anMech, anPeng, anLeo, fiMech, meMech, biPeng, pePeng, maLeo, liLeo};

        for (Speakable sp : speakableArray) {
            if (sp instanceof Animal) {
                ((Animal) sp).printName();
                ((Animal) sp).eat();
                ((Animal) sp).sleep();
                sp.speak();
            }
            if (sp instanceof Bird) {
                ((Bird) sp).fly();
            }
            if (sp instanceof Mammal) {
                ((Mammal) sp).run();
            }
            if (sp instanceof Fish) {
                ((Fish) sp).swim();
            }
            System.out.println("------");
        }

        for (Animal an : animalArray) {
            if (an instanceof Animal) {
                an.printName();
                an.eat();
                an.sleep();
            }
            if (an instanceof Bird) {
                ((Bird) an).speak();
                ((Bird) an).fly();
            }
            if (an instanceof Mammal) {
                ((Mammal) an).speak();
                ((Mammal) an).run();
            }
            if (an instanceof Fish) {
                ((Fish) an).swim();
            }
            System.out.println("------");
        }
    }
}
