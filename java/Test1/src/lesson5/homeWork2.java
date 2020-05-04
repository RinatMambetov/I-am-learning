package lesson5;

public class homeWork2 {

    short id;
    String name;
    String surname;
    short yearStudy;
    float mathGrade;
    float economicGrade;
    float foreignLangGrade;

    void printAverage() {
        float average = (mathGrade + economicGrade + foreignLangGrade) / 3;
        System.out.println("The student #" + id + " " + name + " " + surname + " studied in " + yearStudy + " year and has average grade of all subjects " + average + " points.");

    }

}

class StudentTest {
    public static void main(String[] args) {

        homeWork2 firstStudent = new homeWork2();
        firstStudent.id = 1;
        firstStudent.name = "Rinat";
        firstStudent.surname = "Mambetov";
        firstStudent.yearStudy = 2001;
        firstStudent.mathGrade = 75;
        firstStudent.economicGrade = 64;
        firstStudent.foreignLangGrade = 82;

        firstStudent.printAverage();


        homeWork2 secondStudent = new homeWork2();
        secondStudent.id = 2;
        secondStudent.name = "Zara";
        secondStudent.surname = "Mambetova";
        secondStudent.yearStudy = 2003;
        secondStudent.mathGrade = 65;
        secondStudent.economicGrade = 94;
        secondStudent.foreignLangGrade = 88;

        secondStudent.printAverage();


        homeWork2 thirdStudent = new homeWork2();
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
