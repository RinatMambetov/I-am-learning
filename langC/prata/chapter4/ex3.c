#include <stdio.h>

void main(void)
{
	float num;
	printf("enter number:\n");
	scanf("%f", &num);

	printf("%.1f or %.1e\n", num, num);
	printf("%+.3f or %.3e\n", num, num);
}
