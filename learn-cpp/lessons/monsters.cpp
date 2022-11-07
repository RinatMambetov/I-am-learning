#include <string>
#include <iostream>

enum Monsters
{
	ORGE,
	GOBLIN,
	SKELETON,
	ORC,
	TROLL
};

std::string getMonsterName(Monsters m)
{
	if (m == ORGE)
		return std::string("Orge");
	return std::string("str");
}

struct Monster
{
	Monsters type;
	std::string name;
	int health;
};

void printMonster(Monster m)
{
	std::cout << "This ";
	std::cout << getMonsterName(m.type);
	std::cout << " is named ";
	std::cout << m.name;
	std::cout << " and has ";
	std::cout << m.health;
	std::cout << " health.";
	std::cout << '\n';
}

int main()
{
	Monsters orge = ORGE;
	Monster m;
	m.type = orge;
	m.name = "orge_name";
	m.health = 110;
	printMonster(m);
	return 0;
}
