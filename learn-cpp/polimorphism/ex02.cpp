#include <iostream>
#include <vector>

class Point
{
private:
	int m_x;
	int m_y;
	int m_z;

public:
	Point(int x = 0, int y = 0, int z = 0)
		: m_x(x), m_y(y), m_z(z) {}
	Point(const Point &orig)
	{
		m_x = orig.getX();
		m_y = orig.getY();
		m_z = orig.getZ();
	}

	int getX() const { return m_x; }
	int getY() const { return m_y; }
	int getZ() const { return m_z; }
};

std::ostream &operator<<(std::ostream &out, const Point &point)
{
	out << "Point(" << point.getX() << ", " << point.getY() << ", " << point.getZ() << ")";
	return out;
}

class Shape
{
public:
	virtual ~Shape() {}
	virtual std::ostream &print(std::ostream &out) const = 0;
};

std::ostream &operator<<(std::ostream &out, const Shape &shape)
{
	return shape.print(out);
}

class Triangle : public Shape
{
private:
	Point m_a;
	Point m_b;
	Point m_c;

public:
	Triangle(Point a, Point b, Point c)
		: m_a(a), m_b(b), m_c(c) {}

	virtual std::ostream &print(std::ostream &out) const
	{
		out << "Triangle(" << m_a << ", " << m_b << ", " << m_c << ")";
		return out;
	}
};

class Circle : public Shape
{
private:
	Point m_center;
	int m_radius;

public:
	Circle(Point center, int radius)
		: m_center(center), m_radius(radius) {}

	int getRadius() const { return m_radius; }

	virtual std::ostream &print(std::ostream &out) const
	{
		out << "Circle(" << m_center << ", radius " << m_radius << ")";
		return out;
	}
};

int getMaxElement(std::vector<int> &v)
{
	int max(-1);
	for (std::vector<int>::iterator iterator = v.begin(); iterator != v.end(); ++iterator)
	{
		if (*iterator > max)
			max = *iterator;
	}
	return max;
}

int getLargestRadius(std::vector<Shape *> &v)
{
	std::vector<int> radiuses;
	for (std::vector<Shape *>::iterator iterator = v.begin(); iterator != v.end(); ++iterator)
	{
		Circle *circle = dynamic_cast<Circle *>(*iterator);
		if (circle)
		{
			radiuses.push_back(circle->getRadius());
		}
	}
	return getMaxElement(radiuses);
}

int main()
{
	std::vector<Shape *> v;
	v.push_back(new Circle(Point(1, 2, 3), 7));
	v.push_back(new Triangle(Point(1, 2, 3), Point(4, 5, 6), Point(7, 8, 9)));
	v.push_back(new Circle(Point(4, 5, 6), 30));
	v.push_back(new Circle(Point(4, 5, 6), 300));

	for (std::vector<Shape *>::iterator iterator = v.begin(); iterator != v.end(); ++iterator)
	{
		std::cout << *(*iterator) << '\n';
	}

	std::cout << "The largest radius is: " << getLargestRadius(v) << '\n';

	for (std::vector<Shape *>::iterator iterator = v.begin(); iterator != v.end(); ++iterator)
	{
		delete *iterator;
	}

	return 0;
}
