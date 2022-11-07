#include <iostream>

void printAB(int &refA, int &refB)
{
	std::cout << "a is: " << refA << '\n';
	std::cout << "b is: " << refB << '\n';
}

void swapAB(int &refA, int &refB)
{
	int temp = refA;
	refA = refB;
	refB = temp;
}

int main()
{
	int a(1);
	int b(2);
	printAB(a, b);
	swapAB(a, b);
	printAB(a, b);
}
