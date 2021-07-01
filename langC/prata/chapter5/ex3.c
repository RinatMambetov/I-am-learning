#include <stdio.h>

void main(void)
{
	const int DAYS_PER_WEEK = 7;
	int days;
	printf("enter amount of days:\n");
	scanf("%d", &days);
	while (days > 0) {
		printf("%d days is %d weeks and %d days\n", days, days / DAYS_PER_WEEK, 
				days % DAYS_PER_WEEK);
		printf("more days?\n");
		scanf("%d", &days);
	}
}
