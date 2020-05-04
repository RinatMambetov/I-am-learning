package lesson7;

public class homework1 {

    // testing access modifiers

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public homework1(int idP, String surnameP, int ageP, double salaryP, String departmentP) {
        id = idP;
        surname = surnameP;
        age = ageP;
        salary = salaryP;
        department = departmentP;
    }

    homework1(int idP, double salaryP) {
        this(idP, null, 0, salaryP, null);
    }

    private homework1(double salaryP, String departmentP) {
        this(0, null, 0, salaryP, departmentP);
    }

    public void showID() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showSalary() {
        System.out.println(salary);
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        homework1 emp1 = new homework1(1, "Mambetov", 37, 555.55, "dp1");
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);
        emp1.showID();
        emp1.showSurname();
        emp1.showSalary();
        System.out.println();

        homework1 emp2 = new homework1(2, 4548.26);
        emp2.surname = "Pupkin";

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);
        emp2.showID();
        emp2.showSurname();
        emp2.showSalary();
        System.out.println();

//        homework1 emp3 = new homework1(2587.56, "ITdep");
//        emp3.id = 3;
//        emp3.surname = "Uchkin";
//
//        System.out.println(emp3.id);
//        System.out.println(emp3.surname);
//        System.out.println(emp3.salary);
//        emp3.showID();
//        emp3.showSurname();
//        emp3.showSalary();
//        System.out.println();

    }

}
