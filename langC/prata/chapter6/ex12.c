#include <stdio.h>

void main(void)
{
	const int seq_length = 16;
	int arr[seq_length];
	int i;
	int item = 1;
	arr[0] = 1;

	for(i = 1; i < seq_length; i++) {
		item *= 2;
		arr[i] = item;
	}
	
	i = 0;
	do {
		printf("%d ", arr[i]);
		i++;
	} while(i < seq_length);
	
	printf("\n");
}
