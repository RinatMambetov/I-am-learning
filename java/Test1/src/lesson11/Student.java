package lesson11;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static boolean compareStudents(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            return true;
        } else return false;
    }

    public static void compareStudentsWithNestedIF(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Студенты идентичны!");
                } else System.out.println("У студентов разные оценки.");
            } else System.out.println("Студенты на разных курсах.");
        } else System.out.println("У студентов разные имена.");
    }

}
