package lesson25;

import javax.print.Doc;

public class Employee {
    void sleep() {
        System.out.println("employee sleeps");
    }
}

class Doctor extends Employee {
    void sleep() {
        System.out.println("doctor sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
//        Employee d = new Doctor();
        Doctor d = new Doctor();

        e.sleep();
        d.sleep();
    }
}