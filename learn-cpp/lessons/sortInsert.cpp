#include <iostream>
#include <string>

void fillNames(std::string *names, int length)
{
	int counter(0);
	while (counter < length)
	{
		std::cout << "Enter name #" << counter + 1 << ": ";
		std::cin >> names[counter];
		++counter;
	}
}

void sortNames(std::string *names, int length)
{
	int outer(0);
	while (outer < length)
	{
		int inner(outer);
		int minIndex(outer);
		while (inner < length)
		{
			if (names[minIndex] > names[inner])
			{
				minIndex = inner;
			}
			++inner;
		}
		if (outer != minIndex)
		{
			std::swap(names[outer], names[minIndex]);
		}
		++outer;
	}
}

void printNames(std::string *names, int length)
{
	int item(0);
	while (item < length)
	{
		std::cout << "Name #" << item + 1 << ": " << names[item] << '\n';
		++item;
	}
}

int main()
{
	std::cout << "How many names do you want to enter? ";
	int length(0);
	std::cin >> length;
	std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	std::string *names = new std::string[length];
	fillNames(names, length);
	sortNames(names, length);
	if (length)
	{
		std::cout << "Here is your sorted list:\n";
	}
	printNames(names, length);
	delete[] names;
	return 0;
}
