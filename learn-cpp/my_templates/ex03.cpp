#include <iostream>
#include <string>

template <class T, class S>

class Pair
{
private:
	T m_a;
	S m_b;

public:
	Pair(T const &a, S const &b) : m_a(a), m_b(b) {}

	T &first() { return m_a; }
	T const &first() const { return m_a; }
	S &second() { return m_b; }
	S const &second() const { return m_b; }
};

template <class S>

class StringValuePair : public Pair<std::string, S>
{
public:
	StringValuePair(std::string const &key, S const &value) : Pair<std::string, S>(key, value) {}
};

int main()
{
	StringValuePair<int> svp("Amazing", 7);
	std::cout << "Pair: " << svp.first() << ' ' << svp.second() << '\n';

	return 0;
}
