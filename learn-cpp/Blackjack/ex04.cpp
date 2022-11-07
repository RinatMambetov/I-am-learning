#include <iostream>

int main()
{
	char str[] = "Hello, world!";
	int i(0);
	while (str[i] != '\0')
	{
		std::cout << str[i];
		++i;
	}
	std::cout << '\n';
}
