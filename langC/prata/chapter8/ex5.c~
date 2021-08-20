#include <stdio.h>

int		main(void)
{
	char response;
	int min;
	int max;
	int guess;

	min = 1;
	max = 100;
	guess = (min + max) / 2;
	printf(	"I guess num from 1 to 100,"
			" press y if yes, press b if bigger, or s if smaller\n");
	printf("%d?\n", guess);
	while((response = getchar()) != 'y')
	{
		if (response == '\n')
			continue;
		if (response != 'b' && response != 's')
			continue;
		if (response == 'b')
			min = guess;
		if (response == 's')
			max = guess;
		guess = (min + max) / 2;
		printf("%d?\n", guess);
	}
	printf("the end\n");
	return (0);
}
