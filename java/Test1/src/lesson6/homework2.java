package lesson6;

public class homework2 {

    int id;
    String name;
    String surname;
    int yearStudy;
    double mathGrade;
    double economicGrade;
    double foreignLangGrade;

    homework2(int idC, String nameC, String surnameC, int yearStudyC, double mathGradeC, double economicGradeC, double foreignLangGradeC) {
        id = idC;
        name = nameC;
        surname = surnameC;
        yearStudy = yearStudyC;
        mathGrade = mathGradeC;
        economicGrade = economicGradeC;
        foreignLangGrade = foreignLangGradeC;
    }

    homework2(int idC, String nameC, String surnameC, int yearStudyC) {
        this(idC, nameC, surnameC, yearStudyC, 0.0, 0.0, 0.0);
    };

    homework2() {
//        this(0, null, null, 0, 0.0, 0.0, 0.0); not necessary
    }

    void printAverage() {
        double average = (mathGrade + economicGrade + foreignLangGrade) / 3;
        System.out.println("The student #" + id + " " + name + " " + surname + " studied in " + yearStudy + " year and has average grade of all subjects " + average + " points.");

    }

}

class StudentTest {

    public static void main(String[] args) {

        homework2 firstStudent = new homework2(1, "Rinat", "Mambetov", 2001, 70, 60, 80);

        firstStudent.printAverage();


        homework2 secondStudent = new homework2(2, "Zara", "Mambetova", 2003);
        secondStudent.mathGrade = 77;
        secondStudent.economicGrade = 91;
        secondStudent.foreignLangGrade = 88;

        secondStudent.printAverage();


        homework2 thirdStudent = new homework2();
        thirdStudent.id = 3;
        thirdStudent.name = "Zaur";
        thirdStudent.surname = "Azer";
        thirdStudent.yearStudy = 2006;
        thirdStudent.mathGrade = 95;
        thirdStudent.economicGrade = 94;
        thirdStudent.foreignLangGrade = 92;

        thirdStudent.printAverage();

    }

}
