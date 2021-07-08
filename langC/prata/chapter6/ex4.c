#include <stdio.h>

void main(void)
{
	const int rows = 10;
	char ch;
	int i, j, k, l;
	
	printf("enter any uppercase letter: ");
	scanf("%c", &ch);
	for(i = 0; i < rows; i++) {
		for(j = 0; j < -i + (rows - 1); j++) {		//spaces before
			printf(" ");
		}
		for(k = 0; k < i + 1; k++) {				//letters by alphabet
			printf("%c", ch + (k - rows + 1));
		}
		for(l = i; l > 0; l--) {					//letters reverse alphabet
			printf("%c", ch + (l - rows));
		}
		for(j = 0; j < -i + (rows - 1); j++) {		//spaces after
			printf(" ");
		}
		printf("\n");
	}
}
