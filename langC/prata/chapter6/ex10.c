#include <stdio.h>

void main(void)
{
	const int arr_length = 8;
	int arr[arr_length];
	int i;

	for(i = 0; i < arr_length; i++) {
		printf("enter int num: ");
		scanf("%d", &arr[i]);
	}

	for(i = arr_length - 1; i >= 0; i--) {
		printf("%d ", arr[i]);
	}

	printf("\n");
}
