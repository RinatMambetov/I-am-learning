package lesson12;

import lesson11.Student;

class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 9.5);
        Student st3 = new Student("Ivan", 3, 9.1);

        System.out.println(Student.compareStudents(st1, st2));
        System.out.println(Student.compareStudents(st1, st3));

        Student.compareStudentsWithNestedIF(st1, st2);
        Student.compareStudentsWithNestedIF(st1, st3);

    }

}
