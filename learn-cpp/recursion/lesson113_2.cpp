#include <iostream>

int getNumber()
{
	std::cout << "enter number: ";
	int num(0);
	std::cin >> num;
	return num;
}

int getSum(int num)
{
	static int sum(0);
	if (num / 10 == 0)
	{
		sum += num;
		return sum;
	}
	else
	{
		sum += num % 10;
		return getSum(num / 10);
	}
	return sum;
}

int main()
{
	int num(0);
	num = getNumber();
	int result = getSum(num);
	std::cout << result << '\n';
	return 0;
}
