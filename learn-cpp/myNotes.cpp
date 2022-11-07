/*
	ставь везде const и & при передаче объектов как аргументов
*/

//****************************//

#include <ctime>   // для time()
#include <cstdlib> // для rand() и srand()

int getRandomNumber(int min, int max)
{
	srand(static_cast<unsigned int>(time(0))); // move into main
	srand(time(NULL));						   // вариант проще
	rand();									   // move into main
	static const double fraction = 1.0 / (static_cast<double>(RAND_MAX) + 1.0);
	return static_cast<int>(rand() * fraction * (max - min + 1) + min);

	int IsSuccessful = rand() % 2;	   // 0-1
	int IsSuccessful = rand() % 3 + 1; // 1-3
}

//****************************//

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

//****************************//

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

//****************************//

//наибольший общий делитель (НОД)
int nod(int a, int b)
{
	return (b == 0) ? (a > 0 ? a : -a) : nod(b, a % b);
}

//****************************//

// операторы << и >> определяются вне класса, без упоминания в классе

std::istream &operator>>(std::istream &in, FixedPoint &fpoint)
{
	double num;
	in >> num;
	fpoint = FixedPoint(num);
	return in;
}

std::ostream &operator<<(std::ostream &out, const Car &car)
{
	out << car.getCompany() << ' ' << car.getModel();
	return out;
}

for (std::vector<Car>::iterator iterator = v.begin(); iterator != v.end(); ++iterator)
{
	std::cout << *iterator << '\n';
}

//****************************//

int *m_array = new int[size];

//************* конструктор присваивания с глубоким копированием ***************//

IntArray(const IntArray &old)
{
	m_size = old.m_size;
	if (old.m_array)
	{
		m_array = new int[m_size];
		for (int i = 0; i < m_size; i++)
		{
			m_array[i] = old.m_array[i];
		}
	}
	else
		m_array = 0;
}

//************* перегрузка оператора присваивания с глубоким копированием ***************//

IntArray &IntArray::operator=(const IntArray &source)
{
	if (this == &source)
		return *this;
	delete[] m_array;
	m_size = source.m_size;
	if (source.m_array)
	{
		m_array = new int[m_size];
		for (int i = 0; i < m_size; ++i)
		{
			m_array[i] = source.m_array[i];
		}
	}
	else
		m_array = 0;
	return *this;
}

//************* перегрузка преобразователя типа ***************//

operator double() { return m_fixedPoint; }

//************* для вывода в формате bool ***************//

std::cout << std::boolalpha;

//****************************//

// когда освобождаешь память через delete, но планиешь эту память потом использовать то присвой нулю (0 или nullptr)

//****************************//

int *value = new (std::nothrow) int;
// указатель value станет нулевым, если динамическое выделение целочисленной переменной не выполнится

//****************************//

// In both cases, a is a constant integer. Notice though that we read the declaration from
// right to left and the East const style enables us to write the declaration exactly in that manner.
// That becomes even more useful when pointers are involved:

int *p;				// p is a mutable pointer to a mutable int
int const *p;		// p is a mutable pointer to a constant int
int *const p;		// p is a constant pointer to a mutable int
int const *const p; // p is a constant pointer to a constant int

//****************************//

// if error: unused parameter 'target'
static_cast<void>(target);

//****************************//

// string to char*
std::string m_error;
const char *getError() { return m_error.c_str(); }

//****************************//

const char *what() const throw(); // It means it won't throw any exceptions.

//****************************//

// copy to const string
std::string const str0("hello"); // hello
std::string str1("goodbye");	 // helloye
str0.copy((char *)&str1[0], str1.length());

//****************************//

if (arg.find_first_not_of("\t\n ") == std::string::npos) // check string is empty

//****************************//

// measure time

#include <chrono> // для функций из std::chrono

	class Timer
	{
	private:
		using clock_t = std::chrono::high_resolution_clock;
		using second_t = std::chrono::duration<double, std::ratio<1>>;

		std::chrono::time_point<clock_t> m_beg;

	public:
		Timer() : m_beg(clock_t::now()) {}
		void reset() { m_beg = clock_t::now(); }

		double elapsed() const
		{
			return std::chrono::duration_cast<second_t>(clock_t::now() - m_beg).count();
		}
	};

int main()
{
	Timer t;
	std::cout << "Time taken: " << t.elapsed() << '\n';

	return 0;
}

//****************************//

// в конструкторе копирования не нужно освобождать память указателей, достаточно проверить что указатель не нулевой
// в операторе= освобождать память и проверять указатель нужно

if (source.m_data)
{
}
delete[] m_data;

//****************************//

// вместо
Fraction *ptr = new Fraction(7, 9);
printFraction(ptr);
delete ptr;
// лучше
auto ptr = std::make_unique<Fraction>(7, 9);
// или
std::unique_ptr<Fraction> ptr = std::make_unique<Fraction>(7, 9);
printFraction(ptr.get());
// delete не нужен

//****************************//

// случайный символ в строку
sString += 'a' + rand() % 26;

//****************************//

#ifndef COLOR_PRINT_HPP
#define COLOR_PRINT_HPP

#include <iostream>

#define C_RED "\e[1;31m"
#define C_GREEN "\e[1;32m"
#define C_YELLOW "\e[1;33m"
#define C_BLUE "\e[1;34m"
#define C_MAGENTA "\e[1;35m"
#define C_CYAN "\e[1;36m"
#define C_RESET "\e[0m"

#define ULINE "\033[1;21m"

#define B_BLACK "\e[30;40m"
#define B_RED "\e[30;41m"
#define B_GREEN "\e[30;42m"
#define B_YELLOW "\e[30;43m"
#define B_BLUE "\e[30;44m"
#define B_MAGENTA "\e[30;45m"
#define B_CYAN "\e[30;46m"

void colorPrint(std::string const &str, std::string const &color);

void colorError(std::string const &str, std::string const &color);

#endif

//****************************//

#include "colorPrint.hpp"

void colorPrint(std::string const &str, std::string const &color)
{
	std::cout << color << str << C_RESET << std::endl;
}

void colorError(std::string const &str, std::string const &color)
{
	std::cerr << color << "Error: " << str << C_RESET << std::endl;
}

//****************************//
