#include <iostream>
#include <string>

class Ball
{
private:
	std::string m_color;
	double m_radius;

public:
	Ball(const std::string &color)
	{
		m_color = color;
		m_radius = 20.0;
	}

	Ball(double radius)
	{
		m_color = "Red";
		m_radius = radius;
	}

	Ball(const std::string &color, double radius)
	{
		m_color = color;
		m_radius = radius;
	}

	Ball()
	{
		m_color = "Red";
		m_radius = 20.0;
	}

	void print()
	{
		std::cout << "color: " << m_color;
		std::cout << "; radius: " << m_radius << '\n';
	}
};

int main()
{
	Ball def;
	def.print();
	Ball black("Black");
	black.print();
	Ball thirty(30.0);
	thirty.print();
	Ball blackThirty("Black", 30.0);
	blackThirty.print();
	return 0;
}
