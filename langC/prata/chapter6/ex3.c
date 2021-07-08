#include <stdio.h>

void main(void)
{
	const int rows = 6;
	const char ch = 'F';
	int i, j;

	for(i = 0; i < rows; i++) {
		for(j = 0; j <= i; j++) {
			printf("%c", ch - j);
		}
		printf("\n");
	}
}
