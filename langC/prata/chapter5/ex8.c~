#include <stdio.h>

void temperatures(double);

void main(void)
{
	double tempF;
	
	printf("enter temp by F: ");
	while (scanf("%lf", &tempF) == 1) {
		temperatures(tempF);
		printf("one more time? \n");
	}
	printf("the end\n");
}

void temperatures(double tempF) 
{
	const double FtoC1 = 1.8;
	const double FtoC2 = 32.0;
	const double CtoK = 273.16;
	double tempC = FtoC1 * tempF + FtoC2;
	double tempK = tempC + CtoK;
	
	printf("when tempF is %.2lf, tempC is %.2lf, tempK is %.2lf\n", 
			tempF, tempC, tempK);
}
