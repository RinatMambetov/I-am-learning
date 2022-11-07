#include <iostream>

int main(void)
{
	char buff[512];

	std::cout << "Hello world !" << std::endl;
	std::cin >> buff;
	std::cout << "You entered: [" << buff << "]" << std::endl;

	return 0;
}
