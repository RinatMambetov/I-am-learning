#include <iostream>

class Welcome
{
private:
	char *m_data;

public:
	Welcome()
	{
		m_data = new char[14];
		const char *init = "Hello, world!";
		for (int i = 0; i < 14; ++i)
		{
			m_data[i] = init[i];
		}
	}
	~Welcome()
	{
		delete[] m_data;
	}

	void print() const
	{
		std::cout << m_data;
	}
};

int main()
{
	Welcome hello;
	hello.print();
	return 0;
}
