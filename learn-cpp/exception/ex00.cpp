#include <stdexcept>
#include <iostream>

class Fraction
{
private:
	int m_numerator;
	int m_denominator;

public:
	Fraction(int numerator, int denominator)
	try : m_numerator(numerator), m_denominator(denominator)
	{
		if (denominator == 0)
		{
			throw std::runtime_error("Your fraction has an invalid denominator.");
		}
	}
	catch (std::exception &e)
	{
		throw;
	}

	int getNumerator() const { return m_numerator; }
	int getDenominator() const { return m_denominator; }
};

std::ostream &operator<<(std::ostream &out, Fraction const &fraction)
{
	out << fraction.getNumerator() / fraction.getDenominator();
	return out;
}

int main()
{
	std::cout << "Enter the numerator: ";
	int numerator;
	std::cin >> numerator;
	std::cout << "Enter the denominator: ";
	int denominator;
	std::cin >> denominator;

	try
	{
		Fraction f0(numerator, denominator);
		std::cout << "Your fraction is: " << f0 << '\n';
	}
	catch (std::exception &e)
	{
		std::cout << e.what() << '\n';
	}

	return 0;
}
