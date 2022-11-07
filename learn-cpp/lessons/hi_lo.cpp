#include <cstdlib>
#include <ctime>
#include <iostream>

const int min = 1;
const int max = 100;
const int guesses = 7;

void playGame();

int getRandomNumber(int min, int max)
{
	static const double fraction = 1.0 / (static_cast<double>(RAND_MAX) + 1.0);
	return static_cast<int>(rand() * fraction * (max - min + 1) + min);
}

void playGameAgainOrExit()
{
	std::cout << "Would you like to play again (y/n)? ";
	char answer;
	std::cin >> answer;
	std::cin.ignore(32767, '\n');
	if (answer == 'y')
	{
		playGame();
	}
	else if (answer == 'n')
	{
		std::cout << "Thank you for playing.\n";
		exit(0);
	}
	else
	{
		playGameAgainOrExit();
	}
}

void playGame()
{
	std::cout << "Let's play a game. I'm thinking of a number. You have " << guesses << " tries to guess what it is.\n";
	int counter(1);
	int num = getRandomNumber(min, max);
	while (counter <= guesses)
	{
		int guess;
		std::cout << "Guess #" << counter << ": ";
		std::cin >> guess;
		if (std::cin.fail())
		{
			std::cin.clear();
			std::cin.ignore(32767, '\n');
		}
		if (guess > num)
		{
			std::cout << "Your guess is too high.\n";
		}
		else if (guess < num)
		{
			std::cout << "Your guess is too low.\n";
		}
		else
		{
			std::cout << "Correct! You win!\n";
			playGameAgainOrExit();
			return;
		}
		++counter;
	}
	std::cout << "Sorry, you lose. The correct number was " << num << ".\n";
	playGameAgainOrExit();
	return;
}

int main()
{
	srand(static_cast<unsigned int>(time(0)));
	// for reload rand() in vscode
	rand();
	playGame();
	return 0;
}
