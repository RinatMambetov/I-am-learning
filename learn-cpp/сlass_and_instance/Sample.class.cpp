#include <iostream>
#include "Sample.class.hpp"

Sample::Sample(double d, char ch) : d(d), ch(ch)
{
	Sample::_nbInst++;

	std::cout << "Constructor called" << std::endl;
	this->foo = 42;
	std::cout << "foo: " << this->foo << std::endl;
	this->_privateFoo = 21;
	std::cout << "_privateFoo: " << this->_privateFoo << std::endl;

	this->bar();
	this->_privateBar();
	return;
}

Sample::~Sample(void)
{
	Sample::_nbInst--;

	std::cout << "Destructor called" << std::endl;
	return;
}

void Sample::bar(void) const
{
	std::cout << "Member function bar called" << std::endl;
	std::cout << "instance.dou: " << this->d << std::endl;
	std::cout << "instance.ch: " << this->ch << std::endl;

	return;
}

void Sample::_privateBar(void) const
{
	std::cout << "Member function _privateBar called" << std::endl;

	return;
}

void Sample::setPrivateFoo(int foo)
{
	if (foo >= 0)
	{
		this->_privateFoo = foo;
	}
	return;
}

int Sample::getPrivateFoo(void) const
{
	return this->_privateFoo;
}

int Sample::compare(Sample *other) const
{
	if (this->_privateFoo == other->_privateFoo)
	{
		return 1;
	}
	else if (this->_privateFoo != other->_privateFoo)
	{
		return -1;
	}
	return 0;
}

int Sample::getNbInst(void)
{
	return Sample::_nbInst;
}

int Sample::_nbInst = 0;
