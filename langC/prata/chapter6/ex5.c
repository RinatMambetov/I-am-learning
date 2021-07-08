#include <stdio.h>

void main(void)
{
	int min, max;
	int i;

	printf("enter int min: ");
	scanf("%d", &min);
	printf("enter int max: ");
	scanf("%d", &max);

	printf("int   sqr     cube\n");
	for(i = min; i <= max; i++) {
		printf("%-5d %-7d %-7d\n", i, i * i, i * i * i);
	}
}
