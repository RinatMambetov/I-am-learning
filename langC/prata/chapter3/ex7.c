#include <stdio.h>

void main(void)
{
	int user_height_by_sm;

	printf("Enter your height by sm: ");
	scanf("%d", &user_height_by_sm);
	printf("Your height by inches is: %12.12lf\n", user_height_by_sm / 2.54);
}
