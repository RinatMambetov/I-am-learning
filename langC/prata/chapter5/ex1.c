#include <stdio.h>
#define MIN_PER_HOUR 60

void main(void)
{
	int min;
	printf("enter time in minutes (>0):\n");
	scanf("%d", &min);
	while (min > 0) {
		printf("%d hours and %d minutes\n", min / MIN_PER_HOUR, min % MIN_PER_HOUR);
		printf("more minutes (>0)?\n");
		scanf("%d", &min);
	}
}
