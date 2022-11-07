#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

class Car
{
private:
	std::string m_company;
	std::string m_model;

public:
	Car(std::string company, std::string model)
		: m_company(company), m_model(model) {}

	friend bool operator<(const Car &car1, const Car &car2);

	std::string getCompany() const
	{
		return m_company;
	}

	std::string getModel() const
	{
		return m_model;
	}
};

std::ostream &operator<<(std::ostream &out, const Car &car)
{
	out << car.getCompany() << ' ' << car.getModel();
	return out;
}

bool operator<(const Car &car1, const Car &car2)
{
	if (car1.m_company < car2.m_company)
	{
		return true;
	}
	else if (car1.m_company == car2.m_company && car1.m_model < car2.m_model)
	{
		return true;
	}
	return false;
}

int main()
{
	std::vector<Car> v;
	v.push_back(Car("Ford", "Mustang"));
	v.push_back(Car("Renault", "Logan"));
	v.push_back(Car("Ford", "Ranger"));
	v.push_back(Car("Renault", "Duster"));
	std::sort(v.begin(), v.end());
	for (std::vector<Car>::iterator iterator = v.begin(); iterator != v.end(); ++iterator)
	{
		std::cout << *iterator << '\n';
	}
	return 0;
}
