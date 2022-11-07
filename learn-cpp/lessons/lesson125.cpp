#include <cstdint>
#include <iostream>

class RGBA
{
private:
	std::uint8_t m_red;
	std::uint8_t m_green;
	std::uint8_t m_blue;
	std::uint8_t m_alpha;

public:
	RGBA(std::uint8_t red, std::uint8_t green, std::uint8_t blue, std::uint8_t alpha = 255)
		: m_red(red),
		  m_green(green),
		  m_blue(blue),
		  m_alpha(alpha)
	{
	}

	void print()
	{
		std::cout << "r=" << static_cast<int>(m_red);
		std::cout << " g=" << static_cast<int>(m_green);
		std::cout << " b=" << static_cast<int>(m_blue);
		std::cout << " a=" << static_cast<int>(m_alpha) << '\n';
	}
};

int main()
{
	RGBA color(5, 135, 135);
	color.print();
	return 0;
}
