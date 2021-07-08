#include <stdio.h>

float func(float, float);

void main(void)
{
	float num1, num2;
	printf("enter 2 float num: ");
	while(scanf("%f %f", &num1, &num2) == 2) {
		printf("%f\n", func(num1, num2));
		printf("enter 2 float num or q for exit: ");
	}	
}

float func(float num1, float num2) {
	float result = (num1 - num2) / (num1 * num2);
	return result;
}
