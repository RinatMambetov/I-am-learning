#include <string>
#include <iostream>

class MyString
{
private:
	std::string m_str;

public:
	MyString(std::string str)
	{
		m_str = str;
	};

	std::string operator()(int start, int length);
	const std::string operator()(int start, int length) const;
	void operator()();
};

std::string MyString::operator()(int start, int length)
{
	std::string result;
	for (int i = start; i < start + length; ++i)
	{
		result += m_str[i];
	}
	return result;
}

const std::string MyString::operator()(int start, int length) const
{
	std::string result;
	for (int i = start; i < start + length; ++i)
	{
		result += m_str[i];
	}
	return result;
}

void MyString::operator()()
{
	for (unsigned long i = 0; i < m_str.length(); ++i)
	{
		m_str[i] = '\0';
	}
}

int main()
{
	MyString string1("Hello, world!");
	std::cout << string1(7, 6) << '\n';
	const MyString string2("Hello, world!"); //константный объект
	std::cout << string2(7, 6) << '\n';
	string1(); //обнуление строки
	std::cout << string1(7, 6) << '\n';

	return 0;
}
