#include <stdio.h>

void main(void)
{
	char name[20];
	char surname[20];

	printf("enter your name:\n");
	scanf("%s", name);
	printf("enter your surname:\n");
	scanf("%s", surname);
	printf("%s, %s\n", surname, name);
}
