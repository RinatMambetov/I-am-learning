#include <stdio.h>

void main(void)
{
	int count = 1;
	long long sum = 0;
	int num;
	printf("enter int num : ");
	scanf("%d", &num);
	while (num > 0) {
		while (count <= num) {
			sum += count * count;
			count++;
		}
	printf("the sum of sqrt from 1 to %d is %lld\n", num, sum);
	printf("more? (<=0 for exit) ");
	scanf("%d", &num);
	}
	printf("that's all\n");
}
