#include <iostream>

int getFactorial(int num)
{
	if (num == 0 || num == 1)
	{
		return 1;
	}
	if (num > 1)
	{
		return getFactorial(num - 1) * num;
	}
	return -1;
}

int main()
{
	std::cout << getFactorial(0) << '\n';
	std::cout << getFactorial(1) << '\n';
	std::cout << getFactorial(2) << '\n';
	std::cout << getFactorial(3) << '\n';
	std::cout << getFactorial(4) << '\n';
	std::cout << getFactorial(5) << '\n';
	std::cout << getFactorial(6) << '\n';
	std::cout << getFactorial(7) << '\n';
	return 0;
}
