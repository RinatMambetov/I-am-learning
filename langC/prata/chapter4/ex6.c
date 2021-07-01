#include <stdio.h>
#include <float.h>

void main(void)
{
//	double d = 1.0 / 3.0;
//	float f = 1.0 / 3.0;
	double d = 0.1 + 0.3;
	float f = 0.1 + 0.3;

	printf("double with 4: %.4f, float with 4: %.4f\n", d, f);
	printf("double with 12: %.12f, float with 12: %.12f\n", d, f);
	printf("double with 20: %.20f, float with 20: %.20f\n", d, f);
	printf("FLT_DIG: %d\n", FLT_DIG);
	printf("DBL_DIG: %d\n", DBL_DIG);
}
