#include <stdio.h>
#include <ctype.h>

char	get_first(void);

int		main(void)
{
	int ch;

	ch = get_first();
	printf("%c\n", ch);
	return (0);
}

char	get_first(void)
{
	int ch;

	while (isblank(ch = getchar()))
		continue;
	return (ch);
}
