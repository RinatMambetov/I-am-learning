#include <array>
#include <cassert>
#include <iostream>

const int len(10);

class Stack
{
private:
	std::array<int, len> m_arr;
	int m_arrLength;

public:
	void reset()
	{
		m_arrLength = 0;
		for (int item = 0; item < len; ++item)
		{
			m_arr[item] = 0;
		}
	}

	bool push(int num)
	{
		if (m_arrLength == len)
		{
			return false;
		}
		else
		{
			++m_arrLength;
			m_arr[m_arrLength - 1] = num;
			return true;
		}
	}

	int pop()
	{
		assert(m_arr[0] != 0 && "Error: array is empty");
		int result(m_arr[m_arrLength - 1]);
		m_arr[m_arrLength - 1] = 0;
		--m_arrLength;
		return result;
	}

	void print()
	{
		std::cout << "( ";
		for (int i = 0; i < len; ++i)
		{
			if (m_arr[i] != 0)
			{
				std::cout << m_arr[i] << ' ';
			}
		}

		std::cout << ")\n";
	}
};

int main()
{
	Stack stack;
	stack.reset();
	stack.print();
	stack.push(3);
	stack.push(7);
	stack.push(5);
	stack.print();
	stack.pop();
	stack.print();
	stack.pop();
	stack.pop();
	stack.pop();
	stack.push(1);
	stack.print();
	return 0;
}
