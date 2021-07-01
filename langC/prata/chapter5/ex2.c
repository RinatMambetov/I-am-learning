#include <stdio.h>

void main(void)
{
	int num;
	int count = 0;
	printf("enter any int number:\n");
	scanf("%d", &num);
	while (count < 11) {
		printf("%d ", num + count);
		count++;
	}
	printf("\n");
}
