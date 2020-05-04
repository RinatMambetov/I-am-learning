package lesson5;

public class homeWork3 {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    homeWork3(int idP, String surnameP, int ageP, double salaryP, String departmentP) {
        id = idP;
        surname = surnameP;
        age = ageP;
        salary = salaryP;
        department = departmentP;
    }

    double salaryTwice() {
        salary *= 2;
        return salary;
    }

    void printSalary() {
        System.out.println("Employee " + surname + " has salary: " + salary + " at the year.");
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        homeWork3 emp1 = new homeWork3(1, "Mambetov", 37, 555.55, "dp1");
        emp1.printSalary();
        emp1.salaryTwice();
        emp1.printSalary();


        homeWork3 emp2 = new homeWork3(2, "Pupkin", 27, 42548.26, "dp2");
        emp2.printSalary();
        emp2.salaryTwice();
        emp2.printSalary();

    }

}
