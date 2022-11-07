#include <iostream>
#include <stdexcept>

class Point
{
public:
	Point(int x_ = 0, int y_ = 0) : x(x_), y(y_)
	{
	}
	~Point()
	{
	}
	Point(const Point &other)
	{
		x = other.x;
		y = other.y;
	}
	Point &operator=(const Point &other)
	{
		if (this == &other)
			return *this;
		x = other.x;
		y = other.x;
		return *this;
	}
	int GetX() const
	{
		return x;
	}
	int GetY() const
	{
		return y;
	}
	void SetXY(int x_, int y_)
	{
		x = x_;
		y = y_;
	}

private:
	int x, y;
};

Point operator+(const Point &first, const Point &second)
{
	int x = first.GetX() + second.GetX();
	int y = first.GetY() + second.GetY();
	return Point(x, y);
}

Point operator-(const Point &first, const Point &second)
{
	int x = first.GetX() - second.GetX();
	int y = first.GetY() - second.GetY();
	return Point(x, y);
}

Point operator*(const Point &first, const Point &second)
{
	int x = first.GetX() * second.GetX();
	int y = first.GetY() * second.GetY();
	return Point(x, y);
}

Point operator/(const Point &first, const Point &second)
{
	if (second.GetX() == 0)
		throw std::logic_error("Divide by zero");
	int x = first.GetX() / second.GetX();
	if (second.GetY() == 0)
		throw std::logic_error("Divide by zero");
	int y = first.GetY() / second.GetY();
	return Point(x, y);
}

std::ostream &operator<<(std::ostream &os, const Point &one)
{
	os << "X: " << one.GetX() << '\n'
	   << "Y: " << one.GetY() << '\n';
	os << '\n';
	return os;
}

std::istream &operator>>(std::istream &is, Point &one)
{
	int x = 0, y = 0;
	std::cout << "Enter x: ";
	std::cin >> x;
	std::cout << "Enter y: ";
	std::cin >> y;
	one.SetXY(x, y);
	return is;
}

int main()
{
	Point first;
	Point second;
	std::cout << "Enter first point\n";
	std::cin >> first;
	std::cout << "Enter second point\n";
	std::cin >> second;
	std::cout << "Sum is\n";
	std::cout << first + second;
	std::cout << "Sub is\n";
	std::cout << first - second;
	std::cout << "Mul is\n";
	std::cout << first * second;
	std::cout << "Div is\n";
	try
	{
		std::cout << first / second;
	}
	catch (const std::exception &e)
	{
		std::cerr << e.what() << '\n';
		return 1;
	}
	return 0;
}
