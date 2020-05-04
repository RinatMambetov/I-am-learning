package lesson22;

public class Student {

    private StringBuilder name;
    private int course, grade;

    Student(StringBuilder name, int course, int grade) {
        setName(name);
        setCourse(course);
        setGrade(grade);
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public StringBuilder getName() {
        StringBuilder newName = new StringBuilder(name);
        return newName;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println(this.getName());
        System.out.println(this.getCourse());
        System.out.println(this.getGrade());
    }
}

class TestStudent {

    public static void main(String[] args) {

        Student s = new Student(new StringBuilder("Ivan"), 2, 8);
        s.showInfo();
    }
}
