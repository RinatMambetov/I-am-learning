#include <iostream>

template <class T, class S>

class Pair
{
private:
	T m_num1;
	S m_num2;

public:
	Pair(T const &num1, S const &num2) : m_num1(num1), m_num2(num2) {}

	T &first() { return m_num1; }
	T const &first() const { return m_num1; }
	S &second() { return m_num2; }
	S const &second() const { return m_num2; }
};

int main()
{
	Pair<int, double> p1(6, 9.3);
	std::cout << p1.first() << ' ' << p1.second() << '\n';

	Pair<double, int> p2(6.2, 9);
	std::cout << p2.first() << ' ' << p2.second() << '\n';

	return 0;
}
