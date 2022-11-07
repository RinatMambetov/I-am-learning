#include <string>
#include <iostream>
#include <algorithm>

void checkCin()
{
	if (std::cin.fail())
	{
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	}
}

struct Student
{
	std::string name;
	double grade;
};

void getNamesAndGrades(Student *students, const int numStudents)
{
	int student(0);
	while (student < numStudents)
	{
		std::cout << "enter name of " << student + 1 << " student: ";
		std::string name;
		std::cin >> name;
		double grade(0);
		while (grade == 0)
		{
			std::cout << "enter grade of " << student + 1 << " student: ";
			std::cin >> grade;
			checkCin();
		}
		students[student].name = name;
		students[student].grade = grade;
		++student;
	}
}

void sortStudentsByGrade(Student *students, const int numStudents)
{
	int outer(0);
	while (outer < numStudents)
	{
		int inner(outer);
		while (inner < numStudents)
		{
			if (students[outer].grade < students[inner].grade)
			{
				std::swap(students[outer].grade, students[inner].grade);
			}
			++inner;
		}
		++outer;
	}
}

void printStudents(const Student *students, const int numStudents)
{
	int student(0);
	while (student < numStudents)
	{
		std::cout << students[student].name << " got a grade of " << students[student].grade << '\n';
		++student;
	}
}

int main()
{
	int numStudents(0);
	while (numStudents == 0)
	{
		std::cout << "How many students do you have? ";
		std::cin >> numStudents;
		checkCin();
	}
	Student *students = new Student[numStudents];
	getNamesAndGrades(students, numStudents);
	sortStudentsByGrade(students, numStudents);
	printStudents(students, numStudents);
	delete[] students;
	return 0;
}
