#include <stdio.h>
#include <string.h>

void main(void)
{
	char name[20];
	char surname[20];

	printf("enter your name:\n");
	scanf("%s", name);
	printf("enter yout surname:\n");
	scanf("%s", surname);
	int name_length = strlen(name);
	int surname_length = strlen(surname);

	printf("%s %s\n", name, surname);
	printf("%*d %*d\n", name_length, name_length, surname_length, surname_length);
	printf("%-*d %-*d\n", name_length, name_length, surname_length, surname_length);
}
