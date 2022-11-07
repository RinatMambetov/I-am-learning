#include <string>
#include <iostream>
#include <vector>

struct StudentGrade
{
	std::string name;
	char grade;
};

class GradeMap
{
private:
	std::vector<StudentGrade> m_map;

public:
	GradeMap(){};
	char &operator[](const std::string &name);
};

char &GradeMap::operator[](const std::string &name)
{
	for (std::vector<StudentGrade>::iterator iterator = m_map.begin(); iterator != m_map.end(); ++iterator)
	{
		if ((*iterator).name == name)
		{
			return (*iterator).grade;
		}
	}
	StudentGrade temp = {name, '\0'};
	m_map.push_back(temp);
	return m_map.back().grade;
}

int main()
{
	GradeMap grades;
	grades["John"] = 'A';
	grades["Martin"] = 'B';
	std::cout << "John has a grade of " << grades["John"] << '\n';
	std::cout << "Martin has a grade of " << grades["Martin"] << '\n';
	return 0;
}
