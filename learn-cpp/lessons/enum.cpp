#include <iostream>

namespace animals
{
	enum animals
	{
		ANIMALS_CHICKEN,
		ANIMALS_LION,
		ANIMALS_GIRAFFE,
		ANIMALS_ELEPHANT,
		ANIMALS_DUCK,
		ANIMALS_SNAKE,
		ANIMALS_MAX
	};
}

int main()
{
	int array[animals::ANIMALS_MAX] = {2, 4, 4, 4, 4, 0};
	std::cout << array[animals::ANIMALS_ELEPHANT] << '\n';
	return 0;
}
