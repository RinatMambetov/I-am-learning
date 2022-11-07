#include <iostream>

enum Stuff
{
	STUFF_HEALTH_POTION,
	STUFF_TORCH,
	STUFF_ARROW,
	MAX_STUFF
};

const int numHealthPosion(4);
const int numTorch(6);
const int numArrow(11);

int countTotalItems(int stuff[])
{
	int counter(0);
	for (int type = 0; type < MAX_STUFF; ++type)
	{
		counter += stuff[type];
	}
	return counter;
}

int main()
{
	int playerStuff[MAX_STUFF] = {numHealthPosion, numTorch, numArrow};
	int totalItems = countTotalItems(playerStuff);
	std::cout << "total amount of items is: " << totalItems << '\n';
	std::cout << "total amount of arrows is: " << playerStuff[STUFF_ARROW] << '\n';
	return 0;
}
