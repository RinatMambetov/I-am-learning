#include <cassert>
#include <iostream>

class IntArray
{
private:
	int m_size;
	int *m_array;

public:
	IntArray(int size)
	{
		assert(size > 0);
		m_size = size;
		m_array = new int[size];
	}

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

	~IntArray()
	{
		delete[] m_array;
	}

	int getSize() const { return m_size; }
	int *getArray() const { return m_array; }

	int &operator[](const int index);
	IntArray &operator=(const IntArray &source);
};

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

std::ostream &operator<<(std::ostream &out, const IntArray &arr)
{
	for (int i = 0; i < arr.getSize(); ++i)
	{
		out << arr.getArray()[i];
		if (i != arr.getSize() - 1)
			out << ' ';
	}
	return out;
}

int &IntArray::operator[](const int index)
{
	assert(index >= 0);
	assert(index < m_size);
	return m_array[index];
}

IntArray fillArray()
{
	IntArray a(6);
	a[0] = 6;
	a[1] = 7;
	a[2] = 3;
	a[3] = 4;
	a[4] = 5;
	a[5] = 8;
	return a;
}

int main()
{
	IntArray a = fillArray();
	std::cout << a << '\n';
	IntArray c(a);
	std::cout << c << '\n';
	IntArray b(1);
	b = a;
	std::cout << b << '\n';

	return 0;
}
