#include <stdio.h>

void main(void)
{
	float hight;
	char name[20];
	
	printf("enter your hight in sm:\n");
	scanf("%f", &hight);
	printf("enter your name:\n");
	scanf("%s", name);

	printf("%s, your hight is %.3f meters.\n", name, hight / 100);
}

