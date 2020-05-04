package lesson4;

public class Student {

    short id;
    String name;
    String surname;
    short yearStudy;
    float mathGrade;
    float economicGrade;
    float foreignLangGrade;

}

class StudentTest {
    public static void main(String[] args) {

        Student firstStudent = new Student();
        firstStudent.id = 1;
        firstStudent.name = "Rinat";
        firstStudent.surname = "Mambetov";
        firstStudent.yearStudy = 2001;
        firstStudent.mathGrade = 75;
        firstStudent.economicGrade = 64;
        firstStudent.foreignLangGrade = 82;

        float firstStudentAverageGrade = (firstStudent.mathGrade + firstStudent.economicGrade + firstStudent.foreignLangGrade) / 3;

        System.out.println("The student #" + firstStudent.id + " " + firstStudent.name + " " + firstStudent.surname + " studied in " + firstStudent.yearStudy + " year and has average grade of all subjects " + firstStudentAverageGrade + " points.");


        Student secondStudent = new Student();
        secondStudent.id = 2;
        secondStudent.name = "Zara";
        secondStudent.surname = "Mambetova";
        secondStudent.yearStudy = 2003;
        secondStudent.mathGrade = 65;
        secondStudent.economicGrade = 94;
        secondStudent.foreignLangGrade = 88;

        float secondStudentAverageGrade = (secondStudent.mathGrade + secondStudent.economicGrade + secondStudent.foreignLangGrade) / 3;

        System.out.println("The student #" + secondStudent.id + " " + secondStudent.name + " " + secondStudent.surname + " studied in " + secondStudent.yearStudy + " year and has average grade of all subjects " + secondStudentAverageGrade + " points.");


        Student thirdStudent = new Student();
        thirdStudent.id = 3;
        thirdStudent.name = "Zaur";
        thirdStudent.surname = "Azer";
        thirdStudent.yearStudy = 2006;
        thirdStudent.mathGrade = 95;
        thirdStudent.economicGrade = 94;
        thirdStudent.foreignLangGrade = 92;

        float thirdStudentAverageGrade = (thirdStudent.mathGrade + thirdStudent.economicGrade + thirdStudent.foreignLangGrade) / 3;

        System.out.println("The student #" + thirdStudent.id + " " + thirdStudent.name + " " + thirdStudent.surname + " studied in " + thirdStudent.yearStudy + " year and has average grade of all subjects " + thirdStudentAverageGrade + " points.");

    }
}
