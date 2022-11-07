#include <algorithm>
#include <iostream>

void printArray(int array[], int length)
{
	int index(0);
	while (index < length)
	{
		std::cout << array[index];
		if (index != length - 1)
		{
			std::cout << ' ';
		}
		++index;
	}
	std::cout << '\n';
	return;
}

int main()
{
	const int length(9);
	int array[length] = {7, 5, 6, 4, 9, 8, 2, 1, 3};
	// int array[length] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	printArray(array, length);
	int counter(0);
	while (counter < length)
	{
		int swap_counter(0);
		int index(0);
		while (index < length - counter)
		{
			if (array[index] > array[index + 1])
			{
				std::swap(array[index], array[index + 1]);
				++swap_counter;
			}
			++index;
		}
		if (swap_counter == 0)
		{
			break;
		}
		++counter;
		// printArray(array, length);
	}
	std::cout << "Early termination on iteration: " << counter + 1 << '\n';
	printArray(array, length);
	return 0;
}
