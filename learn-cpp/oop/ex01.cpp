#include <iostream>
#include <cmath>

class Point
{
private:
	double m_a;
	double m_b;

public:
	Point(double a = 0.0, double b = 0.0)
		: m_a(a), m_b(b)
	{
	}

	void print() const
	{
		std::cout << "Point (" << m_a << ", " << m_b << ")\n";
	}

	friend double distanceFrom(const Point &point1, const Point &point2);
};

double distanceFrom(const Point &point1, const Point &point2)
{
	return sqrt((point1.m_a - point2.m_a) * (point1.m_a - point2.m_a) +
				(point1.m_b - point2.m_b) * (point1.m_b - point2.m_b));
}

int main()
{
	Point first;
	Point second(2.0, 5.0);
	first.print();
	second.print();
	std::cout << "Distance between two points: " << distanceFrom(first, second) << '\n';
	return 0;
}
