#include <stdio.h>

void main(void)
{
	char ch;
	int i = 0;
	char string[255];

	printf("enter any string: ");
	while(scanf("%c", &ch) == 1 && ch != '\n') {
		string[i] = ch;
		i++;
	}

	for(i; i >= 0; i--) {
		printf("%c", string[i]);
	}
	printf("\n");
}
