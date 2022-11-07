#include <iostream>
#include "get_int.hpp"

int main()
{
	int x = getInteger();
	int y = getInteger();
	std::cout << x << " + " << y << " is " << x + y << std::endl;
	return 0;
}
