#include <stdio.h>

int		main(void)
{
	int ch;
	int count;

	count = 0;
	while ((ch = getchar()) != EOF)
	{
		count++;
		putchar(ch);
	}
	printf("EOF is: %d\n", EOF);
	printf("Amount of symbols in file is: %d\n", count);
	return 0;
}
