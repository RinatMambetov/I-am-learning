#include "ex03.h"

class Monster
{
private:
	MonsterType m_type;
	std::string m_name;
	int m_health;

public:
	Monster(MonsterType type, std::string name, int health)
		: m_type(type), m_name(name), m_health(health){};

	void print() const
	{
		std::cout << m_name << " is the " << getTypeString(m_type) << " that has " << m_health << " health points.\n";
	}
};

class MonsterGenerator
{
public:
	static Monster generateMonster()
	{
		static std::array<std::string, namesNum> names =
			{
				"name1",
				"name2",
				"name3",
				"name4",
				"name5",
				"name6",
			};
		return Monster(static_cast<MonsterType>(getRandomNumber(0, MAX_MONSTER_TYPES - 1)),
					   names.at(getRandomNumber(0, namesNum - 1)),
					   getRandomNumber(minHealth, maxHealth));
	}

	static int getRandomNumber(int min, int max)
	{
		// srand(static_cast<unsigned int>(time(0)));
		// rand();
		static const double fraction = 1.0 / (static_cast<double>(RAND_MAX) + 1.0);
		return static_cast<int>(rand() * fraction * (max - min + 1) + min);
	}
};

int main()
{
	srand(static_cast<unsigned int>(time(0)));
	rand();
	for (size_t i = 0; i < 10; ++i)
	{
		Monster m = MonsterGenerator::generateMonster();
		m.print();
	}
	return 0;
}
