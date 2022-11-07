#include <iostream>

class Fraction
{
private:
	int m_numerator;
	int m_denominator;

public:
	Fraction(int numerator = 0, int denominator = 1)
		: m_numerator(numerator), m_denominator(denominator)
	{
		assert(m_denominator != 0);
		reduce();
	}

	void print() const
	{
		std::cout << m_numerator << '/' << m_denominator << '\n';
	}

	friend Fraction operator*(const Fraction &f1, const Fraction &f2);
	friend Fraction operator*(const Fraction &f1, int num);
	friend Fraction operator*(int num, const Fraction &f2);
	friend std::ostream &operator<<(std::ostream &out, const Fraction &f);
	friend std::istream &operator>>(std::istream &in, Fraction &f);

	int nod(int a, int b)
	{
		return (b == 0) ? (a > 0 ? a : -a) : nod(b, a % b);
	}

	void reduce()
	{
		int n = Fraction::nod(m_numerator, m_denominator);
		m_numerator /= n;
		m_denominator /= n;
	}
};

std::ostream &operator<<(std::ostream &out, const Fraction &f)
{
	out << f.m_numerator << '/' << f.m_denominator;
	return out;
}

std::istream &operator>>(std::istream &in, Fraction &f)
{
	char c;
	in >> f.m_numerator;
	in >> c;
	in >> f.m_denominator;
	// f.reduce();
	return in;
}

Fraction operator*(const Fraction &f1, const Fraction &f2)
{
	int newNumenator(f1.m_numerator * f2.m_numerator);
	int newDenominator(f1.m_denominator * f2.m_denominator);
	return Fraction(newNumenator, newDenominator);
}

Fraction operator*(const Fraction &f, int num)
{
	return Fraction(f.m_numerator * num, f.m_denominator);
}

Fraction operator*(int num, const Fraction &f)
{
	return f * num;
}

int main()
{
	Fraction f1(3, 4);
	f1.print();
	Fraction f2(2, 7);
	f2.print();
	Fraction f3 = f1 * f2;
	f3.print();
	Fraction f4 = f1 * 3;
	f4.print();
	Fraction f5 = 3 * f2;
	f5.print();
	Fraction f6 = Fraction(1, 2) * Fraction(2, 3) * Fraction(3, 4);
	f6.print();
	Fraction f7;
	std::cout << "enter fraction 1: ";
	std::cin >> f7;
	Fraction f8;
	std::cout << "enter fraction 2: ";
	std::cin >> f8;
	std::cout << f7 << " * " << f8 << " is " << f7 * f8 << '\n';
	return 0;
}
