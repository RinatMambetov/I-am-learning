#include <cstdint>
#include <cassert>
#include <cmath>
#include <iostream>

class FixedPoint
{
private:
	int16_t m_wholePart;
	int8_t m_fractionalPart;
	double m_fixedPoint;

public:
	FixedPoint(int16_t wholePart, int8_t fractionalPart)
	{
		assert(wholePart >= -32768);
		assert(wholePart <= 32767);
		assert(fractionalPart >= -99);
		assert(fractionalPart <= 99);
		m_wholePart = wholePart;
		m_fractionalPart = fractionalPart;
		m_fixedPoint = abs(static_cast<double>(m_wholePart)) + abs(static_cast<double>(m_fractionalPart)) / 100;
		if (m_wholePart < 0 || m_fractionalPart < 0)
			m_fixedPoint = -m_fixedPoint;
	}

	FixedPoint(double fixedPoint) : m_fixedPoint(fixedPoint) {}

	double getFixedPoint() const { return m_fixedPoint; }
	operator double() { return m_fixedPoint; }
};

std::ostream &operator<<(std::ostream &out, const FixedPoint &fpoint)
{
	out << fpoint.getFixedPoint();
	return out;
}

std::istream &operator>>(std::istream &in, FixedPoint &fpoint)
{
	double num;
	in >> num;
	fpoint = FixedPoint(num);
	return in;
}

bool operator==(const FixedPoint &fpoint1, const FixedPoint &fpoint2)
{
	return fpoint1.getFixedPoint() == fpoint2.getFixedPoint();
}

FixedPoint operator+(const FixedPoint &fpoint1, const FixedPoint &fpoint2)
{
	return FixedPoint(fpoint1.getFixedPoint() + fpoint2.getFixedPoint());
}

FixedPoint operator-(const FixedPoint &fpoint)
{
	return FixedPoint(-fpoint.getFixedPoint());
}

int main()
{
	FixedPoint a(37, 58);
	std::cout << a << '\n';
	FixedPoint b(-3, 9);
	std::cout << b << '\n';
	FixedPoint c(4, -7);
	std::cout << c << '\n';
	FixedPoint d(-5, -7);
	std::cout << d << '\n';
	FixedPoint e(0, -3);
	std::cout << e << '\n';
	std::cout << static_cast<double>(e) << '\n';
	FixedPoint a1(0.03);
	std::cout << a1 << '\n';
	FixedPoint b1(-0.03);
	std::cout << b1 << '\n';
	FixedPoint c1(4.01);
	std::cout << c1 << '\n';
	FixedPoint d1(-4.01);
	std::cout << d1 << '\n';
	std::cout << std::boolalpha;
	std::cout << (FixedPoint(0.75) + FixedPoint(1.23) == FixedPoint(1.98)) << '\n';
	std::cout << (FixedPoint(0.75) + FixedPoint(1.50) == FixedPoint(2.25)) << '\n';
	std::cout << (FixedPoint(-0.75) + FixedPoint(-1.23) == FixedPoint(-1.98)) << '\n';
	std::cout << (FixedPoint(-0.75) + FixedPoint(-1.50) == FixedPoint(-2.25)) << '\n';
	std::cout << (FixedPoint(0.75) + FixedPoint(-1.23) == FixedPoint(-0.48)) << '\n';
	std::cout << (FixedPoint(0.75) + FixedPoint(-1.5) == FixedPoint(-0.75)) << '\n';
	std::cout << (FixedPoint(-0.75) + FixedPoint(1.23) == FixedPoint(0.48)) << '\n';
	std::cout << (FixedPoint(-0.75) + FixedPoint(1.5) == FixedPoint(0.75)) << '\n';
	std::cout << -d1 << '\n';
	std::cout << "Enter a number: ";
	std::cin >> d1;
	std::cout << "You entered: " << d1 << '\n';

	return 0;
}
