#include <iostream>
#include <string>

int getNumber()
{
	std::cout << "enter number: ";
	int num(0);
	std::cin >> num;
	return num;
}

std::string getBin(unsigned int num)
{
	std::string result("");
	if (num == 0)
	{
		result.append("0");
	}
	else if (num == 1)
	{
		result.append("1");
	}
	else
	{
		result = getBin(num / 2);
		result.append(std::to_string(num % 2));
	}
	return result;
}

int main()
{
	int num(0);
	num = getNumber();
	std::string result = getBin(static_cast<unsigned int>(num));
	std::cout << result << '\n';
	return 0;
}
