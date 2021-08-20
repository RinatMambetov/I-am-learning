#include <stdio.h>

int		main(void)
{
	int ch;
	int count_uppercase;
	int count_lowercase;

	count_uppercase = 0;
	count_lowercase = 0;
	while ((ch = getchar()) != EOF)
	{
		if		(ch <= 90 && ch >= 65 )
			count_uppercase++;
		else if (ch <= 122 && ch >= 97)
			count_lowercase++;
	}
	printf("symbols of uppercase is: %d, lowercase is: %d\n", 
			count_uppercase, count_lowercase);
	return (0);
}
