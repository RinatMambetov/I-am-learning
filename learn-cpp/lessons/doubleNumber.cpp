#include <iostream>

int doubleNumber(int x)
{
	return x * 2;
}

int main(void)
{
	int x;

	std::cin >> x;
	std::cout << doubleNumber(x) << std::endl;
}
