#include <stdio.h>
#include <ctype.h>

int		main(void)
{
	int ch;
	int count_symbols;
	int count_words;
	int count_word_symbols;

	count_symbols = 0;
	count_word_symbols = 0;
	count_words = 0;
	while ((ch = getchar()) != EOF)
	{
		count_word_symbols++;
		if (isblank(ch) || ch == '\n')
		{
			count_word_symbols--;
			count_symbols += count_word_symbols;
			if (count_word_symbols != 0)
				count_words++;
			printf("%d\n", count_word_symbols);
			count_word_symbols = 0;
		}
	}
	printf("words: %d\naverage amount of symbols in word: %.2f\n", 
			count_words, (float) count_symbols / (float) count_words);
	return (0);
}
