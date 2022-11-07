#ifndef EX03_H
#define EX03_H

#include <string>
#include <iostream>
#include <array>

const int minHealth(1);
const int maxHealth(100);
const int namesNum(6);

enum MonsterType
{
	MONSTER_DRAGON,
	MONSTER_GOBLIN,
	MONSTER_OGRE,
	MONSTER_ORC,
	MONSTER_SKELETON,
	MONSTER_TROLL,
	MONSTER_VAMPIRE,
	MONSTER_ZOMBIE,
	MAX_MONSTER_TYPES
};

std::string getTypeString(MonsterType type)
{
	switch (type)
	{
	case MONSTER_DRAGON:
		return "dragon";
	case MONSTER_GOBLIN:
		return "goblin";
	case MONSTER_OGRE:
		return "ogre";
	case MONSTER_ORC:
		return "orc";
	case MONSTER_SKELETON:
		return "skeleton";
	case MONSTER_TROLL:
		return "troll";
	case MONSTER_VAMPIRE:
		return "vampire";
	case MONSTER_ZOMBIE:
		return "zombie";
	case MAX_MONSTER_TYPES:
		return "Overflow!";
	}
	return "Error!";
}

#endif
