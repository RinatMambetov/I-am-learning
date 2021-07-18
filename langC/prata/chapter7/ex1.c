#include <stdio.h>

void main(void)
{
	char ch;
	char last_char;
	const char space = ' ';
	const char new_line = '\n';
	int space_count = 0;
	int new_line_count = 1;
	int other_symbols_count = 0;

	printf("enter any symbols:\n");
	while((ch = getchar()) != '#') {
		if(ch == space)
			space_count++;
		else if(ch == new_line)
			new_line_count++;
		else other_symbols_count++;
		last_char = ch;
	}
	if(last_char == new_line)
		new_line_count--;
	printf("spaces: %d, lines: %d, other symbols: %d\n", 
			space_count, new_line_count, other_symbols_count);
}
