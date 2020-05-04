package lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {

    String name, department;
    Double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {

    void printEmployee(Employee emp) {
        System.out.println(emp.name + " " + emp.department + " " + emp.salary);
    }

    void filterEmployee(ArrayList<Employee> al, Predicate<Employee> t) {
        for (Employee emp : al) {
            if (t.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        Employee emp1 = new Employee("Max", "IT", 450);
        Employee emp2 = new Employee("Elena", "HR", 250);
        Employee emp3 = new Employee("Admin", "Admin", 650);
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
        TestEmployee te = new TestEmployee();
        te.filterEmployee(al, emp -> emp.department == "IT" && emp.salary > 200);
        te.filterEmployee(al, emp -> emp.name.startsWith("E") && emp.salary != 450);
        te.filterEmployee(al, emp -> emp.name.equals(emp.department));
    }
}