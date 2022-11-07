#ifndef SAMPLE_CLASS_H
#define SAMPLE_CLASS_H

class Sample
{
public:
	int foo;
	double const d;
	char ch;

	Sample(double const d, char ch);
	~Sample(void);

	void bar(void) const;
	void setPrivateFoo(int foo);
	int getPrivateFoo(void) const;
	int compare(Sample *other) const;
	static int getNbInst(void);

private:
	int _privateFoo;
	static int _nbInst;

	void _privateBar(void) const;
};

#endif
