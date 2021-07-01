#include <stdio.h>
#include <string.h>
#define DENSITY 62.4
#define PRAISE "good name!"

void main(void)
{
	float weight, volume;
	int size, letters;
	char name[40];
	double d = 4.123;

	printf("What is your name?\n");
	scanf("%s", name);
	printf("%s, what is your weight in pounds?\n", name);
	scanf("%f", &weight);
	size = sizeof(name);
	letters = strlen(name);
	volume = weight / DENSITY;
	printf("%s, your volume is %.2f cube foots.\n", name, volume);
	printf("Your name consists of %d simbols,\n", letters);
	printf("and we have %d bytes for keep it.\n", size);
	printf("PRAISE is 'good name!'\nstrlen is %ld, sizeof is %ld\n", strlen(PRAISE), sizeof(PRAISE));
	printf("%s\n", PRAISE);
}
