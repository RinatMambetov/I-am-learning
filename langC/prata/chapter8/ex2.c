#include <stdio.h>

int		main(void)
{
	int ch;
	int amount_symbols;

	amount_symbols = 0;
	while ((ch = getchar()) != EOF)
	{
		amount_symbols++;
		if		(ch == '\n')
			printf("\\n ");
		else if (ch == '\t')
			printf("\\t ");
		else if (ch < 32)
			printf("^%c-%d ", ch + 64, ch);
		else
			printf("%c-%d ", ch, ch);
		if (amount_symbols == 10 || ch == '\n')
		{
			printf("\n");
			amount_symbols = 0;
		}
	}
	return 0;
}
