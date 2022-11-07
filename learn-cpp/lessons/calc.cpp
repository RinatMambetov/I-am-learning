#include <iostream>
#include <string>
#include <array>

void checkCin()
{
	if (std::cin.fail())
	{
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	}
}

typedef int (*arithmeticFcn)(int, int);

const size_t length = 4;

struct arithmeticStruct
{
	char operation;
	arithmeticFcn func;
};

int add(int a, int b)
{
	return a + b;
}

int subtract(int a, int b)
{
	return a - b;
}

int multiply(int a, int b)
{
	return a * b;
}

int divide(int a, int b)
{
	if (b)
	{
		return a / b;
	}
	else
	{
		std::cout << "error: divide by zero\n";
		return 0;
	}
}

arithmeticStruct s_add = {'+', add};
arithmeticStruct s_subtract = {'-', subtract};
arithmeticStruct s_multiply = {'*', multiply};
arithmeticStruct s_divide = {'/', divide};

std::array<arithmeticStruct, length> arithmeticArray = {s_add, s_subtract, s_multiply, s_divide};

int getNumber()
{
	int num(0);
	std::cout << "enter int number: ";
	std::cin >> num;
	checkCin();
	return num;
}

char getOperation()
{
	std::string templ("+-*/");
	char operation('\0');
	// while cant find simbol in string
	while (!(templ.find(operation) != std::string::npos))
	{
		std::cout << "enter operation (+-*/): ";
		std::string tempStr;
		std::cin >> tempStr;
		operation = tempStr.at(0);
	}
	return operation;
}

arithmeticFcn getArithmeticFcn(char operation)
{
	for (size_t item = 0; item < length; item++)
	{
		if (arithmeticArray[item].operation == operation)
		{
			return arithmeticArray[item].func;
		}
	}
	return 0;
}

int main()
{
	int num1(0);
	int num2(0);
	char operation;
	num1 = getNumber();
	num2 = getNumber();
	operation = getOperation();
	int result(0);
	arithmeticFcn func(getArithmeticFcn(operation));
	if (!func)
	{
		return -1;
	}
	result = func(num1, num2);
	std::cout << result << '\n';
	return 0;
}
