#include <iostream>

template <class T>

class Pair
{
private:
	T m_num1;
	T m_num2;

public:
	Pair(T const &num1, T const &num2) : m_num1(num1), m_num2(num2) {}

	T &first() { return m_num1; }
	T const &first() const { return m_num1; }
	T &second() { return m_num2; }
	T const &second() const { return m_num2; }
};

int main()
{
	Pair<int> p1(6, 9);
	std::cout << p1.first() << ' ' << p1.second() << '\n';

	Pair<double> p2(6.2, 9.7);
	std::cout << p2.first() << ' ' << p2.second() << '\n';

	return 0;
}
