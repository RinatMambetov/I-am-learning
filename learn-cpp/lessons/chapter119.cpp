#include <iostream>
#include <string>
#include <vector>
#include <cmath>

const int min(2);
const int max(4);
const int plusMinus(4);

int getRandomNumber(int min, int max)
{
	srand(static_cast<unsigned int>(time(0)));
	rand();
	static const double fraction = 1.0 / (static_cast<double>(RAND_MAX) + 1.0);
	return static_cast<int>(rand() * fraction * (max - min + 1) + min);
}

void checkCin()
{
	if (std::cin.fail())
	{
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	}
	else
	{
		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	}
}

int getNumber(std::string request)
{
	std::cout << request;
	int num(0);
	std::cin >> num;
	checkCin();
	return num;
}

void fillNumbers(std::vector<int> &numbers, int startNum, int amountNum)
{
	for (int number = startNum; number < startNum + amountNum; ++number)
	{
		numbers.push_back(number);
	}
}

void squareNumbers(std::vector<int> &numbers)
{
	for (std::vector<int>::iterator iterator = numbers.begin(); iterator != numbers.end(); ++iterator)
	{
		*iterator *= *iterator;
	}
}

void printNumbers(std::vector<int> numbers)
{
	for (std::vector<int>::iterator iterator = numbers.begin(); iterator != numbers.end(); ++iterator)
	{
		std::cout << *iterator;
		if (iterator != numbers.end() - 1)
		{
			std::cout << ' ';
		}
	}
	std::cout << '\n';
}

void multiplyRandomNumber(std::vector<int> &numbers, int randomNum)
{
	for (std::vector<int>::iterator iterator = numbers.begin(); iterator != numbers.end(); ++iterator)
	{
		*iterator *= randomNum;
	}
}

bool checkGuess(std::vector<int> &numbers, int guess)
{
	std::vector<int>::iterator iterator = std::find(numbers.begin(), numbers.end(), guess);
	if (*iterator != guess)
	{
		return false;
	}
	else
	{
		numbers.erase(iterator);
		return true;
	}
}

int checkNear(std::vector<int> &numbers, int guess)
{
	int index(0);
	for (std::vector<int>::iterator iterator = numbers.begin(); iterator != numbers.end(); ++iterator)
	{
		if (std::abs(guess - *iterator) <= plusMinus)
		{
			return index;
		}
		++index;
	}
	return -1;
}

int main()
{
	int startNum = getNumber("Start where? ");
	int amountNum = getNumber("How many? ");
	int randomNum = getRandomNumber(min, max);
	std::vector<int> numbers;
	fillNumbers(numbers, startNum, amountNum);
	squareNumbers(numbers);
	multiplyRandomNumber(numbers, randomNum);
	std::cout << "I generated " << amountNum;
	std::cout << " square numbers. Do you know what each number is after multiplying it by ";
	std::cout << randomNum << "?\n";
	// printNumbers(numbers);
	while (amountNum)
	{
		int guess(0);
		guess = getNumber("> ");
		if (checkGuess(numbers, guess))
		{
			if (amountNum > 1)
			{
				std::cout << "Nice! " << amountNum - 1 << " numbers left.\n";
			}
			else
			{
				std::cout << "Nice! You found all numbers, good job!\n";
			}
		}
		else
		{
			int rightIndex = checkNear(numbers, guess);
			if (rightIndex != -1)
			{
				std::cout << guess << " is wrong! Try " << numbers.at(rightIndex) << " next time.\n";
			}
			else
			{
				std::cout << guess << " is wrong!\n";
			}
			break;
		}
		--amountNum;
	}
	return 0;
}
