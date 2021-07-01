#include <stdio.h>

void main(void)
{
	double sec_per_year = 3.156e+7;
	int age;

	scanf("%d", &age);
	printf("Your age in sec is %lf\n", age * sec_per_year);
}
