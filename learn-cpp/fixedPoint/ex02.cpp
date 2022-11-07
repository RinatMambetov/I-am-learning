#include <cstdint>
#include <iostream>

class Average
{
private:
	int32_t m_sum;
	int8_t m_counter;

public:
	Average(int sum = 0, int counter = 0)
		: m_sum(sum), m_counter(counter) {}

	Average &operator+=(int num);

	int32_t getSum() const { return m_sum; }
	int8_t getCounter() const { return m_counter; }
};

Average &Average::operator+=(int num)
{
	++m_counter;
	m_sum += num;

	return *this;
}

std::ostream &operator<<(std::ostream &out, const Average &avg)
{
	out << avg.getSum() / avg.getCounter();
	return out;
}

int main()
{
	Average avg;
	avg += 5;
	std::cout << avg << '\n';
	avg += 9;
	std::cout << avg << '\n';
	avg += 19;
	std::cout << avg << '\n';
	avg += -9;
	std::cout << avg << '\n';
	(avg += 7) += 11;
	std::cout << avg << '\n';
	Average copy = avg;
	std::cout << copy << '\n';

	return 0;
}
