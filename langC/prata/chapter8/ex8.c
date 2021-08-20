#include <stdio.h>
#include <stdlib.h>

int		main(void)
{
	char operation;
	float num1;
	float num2;
	float result;

	printf(	"choose operation:\n"
			"a. addition		s. subtraction\n"
			"m. multiplication	d. division\n"
			"e. exit\n");
	operation = getchar();
	while (	operation == 'a' || operation == 's' ||
			operation == 'm' || operation == 'd' || operation == 'e')
	{
	if (operation == 'e')
	{
		printf("good luck");
		return (0);
	}
		printf("enter first number\n");
	scanf("%f", &num1);
	printf("enter second number\n");
	scanf("%f", &num2);
	if (operation == 'a')
		result = num1 + num2;
	else if (operation == 's')
		result = num1 - num2;
	else if (operation == 'm')
		result = num1 * num2;
	else if (operation == 'd')
		result = num1 / num2;
	printf("%.2f\n", result);
	//	fflush(stdin);
//		free(operation);
		printf("choose operation: a or s or m or d or e\n");
		operation = getchar();
	}
	return (0);
}
