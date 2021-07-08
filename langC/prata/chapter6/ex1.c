#include <stdio.h>
#define AMOUNT 26

void main(void)
{
	char arr[AMOUNT];
	int i = 0;

	while (i < AMOUNT) {
		arr[i] = i + 97;
		i++;
	}

	for (i = 0; i < AMOUNT; i++) {
		printf("%c ", arr[i]);
	}
}

