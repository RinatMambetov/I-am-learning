#include <iostream>
#include <array>

enum Value
{
	VALUE_TWO,
	VALUE_THREE,
	VALUE_FOUR,
	VALUE_FIVE,
	VALUE_SIX,
	VALUE_SEVEN,
	VALUE_EIGHT,
	VALUE_NINE,
	VALUE_TEN,
	VALUE_JACK,
	VALUE_QUEEN,
	VALUE_KING,
	VALUE_ACE,
	VALUE_MAX
};

enum Suit
{
	SUIT_PEAKS,
	SUIT_BOOBY,
	SUIT_HEARTS,
	SUIT_CLUBS,
	SUIT_MAX
};

struct Card
{
	Value value;
	Suit suit;
};

void printCard(const Card &card)
{
	if (card.value == VALUE_TWO)
		std::cout << '2';
	else if (card.value == VALUE_THREE)
		std::cout << '3';
	else if (card.value == VALUE_FOUR)
		std::cout << '4';
	else if (card.value == VALUE_FIVE)
		std::cout << '5';
	else if (card.value == VALUE_SIX)
		std::cout << '6';
	else if (card.value == VALUE_SEVEN)
		std::cout << '7';
	else if (card.value == VALUE_EIGHT)
		std::cout << '8';
	else if (card.value == VALUE_NINE)
		std::cout << '9';
	else if (card.value == VALUE_TEN)
		std::cout << "10";
	else if (card.value == VALUE_JACK)
		std::cout << 'J';
	else if (card.value == VALUE_QUEEN)
		std::cout << 'Q';
	else if (card.value == VALUE_KING)
		std::cout << 'K';
	else if (card.value == VALUE_ACE)
		std::cout << 'A';
	else
		std::cout << "unknown";

	if (card.suit == SUIT_PEAKS)
		std::cout << 'P';
	else if (card.suit == SUIT_BOOBY)
		std::cout << 'B';
	else if (card.suit == SUIT_HEARTS)
		std::cout << 'H';
	else if (card.suit == SUIT_CLUBS)
		std::cout << 'C';
	else
		std::cout << "unknown";
}

const int deckSize(52);

void fillDeck(std::array<Card, deckSize> &deck)
{
	int item(0);
	while (item < deckSize)
	{
		for (int suit(0); suit < SUIT_MAX; ++suit)
		{
			for (int value(0); value < VALUE_MAX; ++value)
			{
				deck.at(item).value = static_cast<Value>(value);
				deck.at(item).suit = static_cast<Suit>(suit);
				++item;
			}
		}
	}
}

void printDeck(std::array<Card, deckSize> &deck)
{
	int counter(0);
	for (Card &card : deck)
	{
		printCard(card);
		std::cout << ' ';
		++counter;
		if (counter % VALUE_MAX == 0)
			std::cout << '\n';
	}
}

void swapCard(Card &card1, Card &card2)
{
	Value tempValue;
	Suit tempSuit;
	tempValue = card1.value;
	tempSuit = card1.suit;
	card1.value = card2.value;
	card1.suit = card2.suit;
	card2.value = tempValue;
	card2.suit = tempSuit;
}

int getRandomNumber(int min, int max)
{
	static const double fraction = 1.0 / (static_cast<double>(RAND_MAX) + 1.0);
	return static_cast<int>(rand() * fraction * (max - min + 1) + min);
}

void shuffleDeck(std::array<Card, deckSize> &deck)
{
	for (int card(0); card < deckSize; ++card)
	{
		int randCard = getRandomNumber(0, deckSize - 1);
		swapCard(deck[card], deck[randCard]);
	}
}

int getCardValue(Card &card)
{
	switch (card.value)
	{
	case VALUE_TWO:
		return 2;
	case VALUE_THREE:
		return 3;
	case VALUE_FOUR:
		return 4;
	case VALUE_FIVE:
		return 5;
	case VALUE_SIX:
		return 6;
	case VALUE_SEVEN:
		return 7;
	case VALUE_EIGHT:
		return 8;
	case VALUE_NINE:
		return 9;
	case VALUE_TEN:
	case VALUE_JACK:
	case VALUE_QUEEN:
	case VALUE_KING:
		return 10;
	case VALUE_ACE:
		return 11;
	default:
		return -1;
	}
}

// void checkCin()
// {
// 	if (std::cin.fail())
// 	{
// 		std::cin.clear();
// 		std::cin.ignore(std::numeric_limits<int>::max(), '\n');
// 	}
// }

int plus1or11(int score)
{
	if (score + 11 > 21)
		return score + 1;
	else
		return score + 11;
}

Card *playerMove(int &playerScore, Card *cardPtr)
{
	playerScore += getCardValue(*cardPtr++);
	playerScore += getCardValue(*cardPtr++);
	std::cout << "you score is: " << playerScore << '\n';
	char playerChoice('\0');
	while (playerChoice != 's' && playerChoice != 'h')
	{
		std::cout << "hit (h) or stand (s)? ";
		std::string str;
		std::cin >> str;
		playerChoice = str.at(0);
	}
	if (playerChoice == 's')
	{
		return cardPtr;
	}
	else if (playerChoice == 'h')
	{
		if (cardPtr->value == VALUE_ACE)
		{
			playerScore = plus1or11(playerScore);
			cardPtr++;
		}
		else
		{
			playerScore += getCardValue(*cardPtr++);
		}
	}
	return cardPtr;
}

Card *dealerMove(int &dealerScore, Card *cardPtr)
{
	while (dealerScore < 17)
	{
		if (cardPtr->value == VALUE_ACE)
		{
			dealerScore = plus1or11(dealerScore);
			cardPtr++;
		}
		else
		{
			dealerScore += getCardValue(*cardPtr++);
		}
	}
	return cardPtr;
}

void printScores(int playerScore, int dealerScore)
{
	std::cout << "your score is: " << playerScore << '\n';
	std::cout << "dealer score is: " << dealerScore << '\n';
}

int playBlackjack(std::array<Card, deckSize> &deck)
{
	Card *cardPtr = &deck[0];
	int dealerScore(0);
	int playerScore(0);
	dealerScore += getCardValue(*cardPtr++);
	cardPtr = playerMove(playerScore, cardPtr);
	if (playerScore > 21)
	{
		printScores(playerScore, dealerScore);
		return 0;
	}
	cardPtr = dealerMove(dealerScore, cardPtr);
	if (dealerScore > 21)
	{
		printScores(playerScore, dealerScore);
		return 1;
	}
	if (playerScore > dealerScore)
	{
		printScores(playerScore, dealerScore);
		return 1;
	}
	else if (playerScore < dealerScore)
	{
		printScores(playerScore, dealerScore);
		return 0;
	}
	printScores(playerScore, dealerScore);
	return -1;
}

int main()
{
	srand(static_cast<unsigned int>(time(0)));
	rand();
	std::array<Card, deckSize> deck;
	fillDeck(deck);
	shuffleDeck(deck);
	printDeck(deck);
	int result = playBlackjack(deck);
	if (result == 1)
		std::cout << "you win!\n";
	else if (result == 0)
		std::cout << "you lose\n";
	else
		std::cout << "draw!\n";
	return 0;
}
