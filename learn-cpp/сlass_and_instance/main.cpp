#include "Sample.class.hpp"
#include <iostream>

int main(void)
{
	std::cout << "Number of instances: " << Sample::getNbInst() << std::endl;
	std::cout << "------" << std::endl;
	Sample instance(4.2, 'a');
	std::cout << "------" << std::endl;
	std::cout << "Number of instances: " << Sample::getNbInst() << std::endl;
	Sample instance1 = instance;
	std::cout << "Number of instances: " << Sample::getNbInst() << std::endl;
	std::cout << "------" << std::endl;
	Sample instance2(5.6, 'd');
	std::cout << "------" << std::endl;
	std::cout << "Number of instances: " << Sample::getNbInst() << std::endl;

	if (&instance == &instance)
	{
		std::cout << "instance and instance are physically equal" << std::endl;
	}

	if (&instance != &instance1)
	{
		std::cout << "instance and instance1 are physically not equal" << std::endl;
	}

	if (instance.compare(&instance2) == 1)
	{
		std::cout << "instance and instance2 are structurally equal" << std::endl;
	}

	instance.setPrivateFoo(99);
	std::cout << "_privateFoo is: " << instance.getPrivateFoo() << std::endl;

	std::cout << "Number of instances: " << Sample::getNbInst() << std::endl;
	std::cout << "------" << std::endl;

	Sample instance3(1.1, 'q');
	Sample *instance3p = &instance3;

	int Sample::*p = NULL;
	void (Sample::*f)(void) const;

	p = &Sample::foo;
	std::cout << "Value of foo: " << instance3.foo << std::endl;
	instance3.*p = 10;
	std::cout << "Value of foo: " << instance3.foo << std::endl;
	instance3p->*p = 11;
	std::cout << "Value of foo: " << instance3.foo << std::endl;

	f = &Sample::bar;
	(instance3.*f)();
	(instance3p->*f)();

	std::cout << "------" << std::endl;
	return 0;
}
