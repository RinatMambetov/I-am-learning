#include <string>
#include <iostream>
#include <cstdlib>
#include <ctime>

void checkCin()
{
	if (std::cin.fail())
	{
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	}
	else
	{
		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
	}
}

int getRandomNumber(int min, int max)
{
	// srand(static_cast<unsigned int>(time(0)));
	// rand();
	static const double fraction = 1.0 / (static_cast<double>(RAND_MAX) + 1.0);
	return static_cast<int>(rand() * fraction * (max - min + 1) + min);
}

class Creature
{
private:
	std::string m_name;
	char m_sign;
	int m_health;
	int m_damage;
	int m_gold;

public:
	Creature(std::string name, char sign, int health, int damage, int gold)
		: m_name(name), m_sign(sign), m_health(health), m_damage(damage), m_gold(gold) {}

	std::string getName() const { return m_name; }
	char getSign() const { return m_sign; }
	int getHealth() const { return m_health; }
	int getDamage() const { return m_damage; }
	int getGold() const { return m_gold; }

	void setDamage(int damage) { m_damage = damage; }
	void setHealth(int health) { m_health = health; }
	void setGold(int gold) { m_gold = gold; }

	void reduceHealth(int damage) { m_health -= damage; }
	bool isDead() const { return getHealth() <= 0; }
	void addGold(int gold) { m_gold += gold; }
};

class Player : public Creature
{
private:
	int m_level;

public:
	Player(std::string name)
		: Creature(name, '@', 10, 1, 0), m_level(1) {}

	void levelUp()
	{
		++m_level;
		setDamage(getDamage() + 1);
		setHealth(getHealth() + 1);
	}
	int getLevel() const { return m_level; }
	bool hasWon() const { return getLevel() >= 20; }
};

class Monster : public Creature
{
public:
	enum Type
	{
		TYPE_DRAGON,
		TYPE_ORC,
		TYPE_SLIME,
		MAX_TYPES
	};

	struct MonsterData
	{
		std::string name;
		char sign;
		int health;
		int damage;
		int gold;
	};

	static MonsterData monsterData[];
	static Type getRandomMonster() { return static_cast<Type>(getRandomNumber(0, MAX_TYPES - 1)); }

	Monster(Type type)
		: Creature(monsterData[type].name, monsterData[type].sign, monsterData[type].health, monsterData[type].damage, monsterData[type].gold) {}
};

Monster::MonsterData Monster::monsterData[Monster::MAX_TYPES] = {
	{"dragon", 'D', 20, 4, 100},
	{"orc", 'o', 4, 2, 25},
	{"slime", 's', 1, 1, 10},
};

Player createPlayer()
{
	std::cout << "Enter your name: ";
	std::string playerName;
	std::cin >> playerName;
	checkCin();
	std::cout << "Welcome, " << playerName << ".\n";
	Player player(playerName);
	return player;
}

void attackPlayer(Player &player, Monster &monster)
{
	player.setHealth(player.getHealth() - monster.getDamage());
	std::cout << "The " << monster.getName() << " hit you for " << monster.getDamage() << " damage.\n";
}

void attackMonster(Player &player, Monster &monster)
{
	monster.setHealth(monster.getHealth() - player.getDamage());
	std::cout << "You hit the " << monster.getName() << " for " << player.getDamage() << " damage.\n";
}

void fightMonster(Player &player, Monster &monster)
{
	char choice = '\0';
	while (choice != 'r' && choice != 'f')
	{
		std::cout << "(r)un or (f)ight: ";
		std::cin >> choice;
		checkCin();
	}
	if (choice == 'r')
	{
		if (getRandomNumber(0, 1) == 1)
		{
			attackPlayer(player, monster);
		}
		else
		{
			std::cout << "You successfully fled.\n";
			monster.setHealth(0);
			return;
		}
	}
	else if (choice == 'f')
	{
		attackMonster(player, monster);
		if (monster.getHealth() > 0)
		{
			attackPlayer(player, monster);
		}
	}
	if (monster.getHealth() < 1)
	{
		std::cout << "You killed the " << monster.getName() << ".\n";
		player.levelUp();
		std::cout << "You are now level " << player.getLevel() << ".\n";
		player.setGold(player.getGold() + monster.getGold());
		std::cout << "You found " << monster.getGold() << " gold.\n";
	}
}

int main()
{
	srand(static_cast<unsigned int>(time(0)));
	rand();

	Player player = createPlayer();
	while (!player.hasWon() && !player.isDead())
	{
		Monster monster(Monster::getRandomMonster());
		std::cout << "\nYou have encountered a " << monster.getName() << " (" << monster.getSign() << ")\n";
		std::cout << "You have " << player.getHealth() << " health and are carrying "
				  << player.getGold() << " gold at " << player.getLevel() << " level.\n";
		while (!player.isDead() && monster.getHealth() > 0)
		{
			fightMonster(player, monster);
		}
	}
	if (player.hasWon())
	{
		std::cout << "\nCongratulations! You win!\n";
	}
	else
	{
		std::cout << "\nYou died at level " << player.getLevel() << " and with " << player.getGold() << " gold.\n";
		std::cout << "Too bad you can't take it with you!\n";
	}

	return 0;
}
