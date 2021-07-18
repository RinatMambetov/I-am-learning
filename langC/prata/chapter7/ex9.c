#include <stdio.h>

_Bool	is_prime(int);

void	main(void)
{
	int	num;
	int	i;

	printf("enter any pos int num > 1:\n");
	scanf("%d", &num);
	i = 2;
	while (i <= num)
	{
		if (is_prime(i))
			printf("%d ", i);
		i++;
	}
	printf("\n");
}

_Bool	is_prime(int num)
{
	int	i;

	i = 2;
	if (num > 1)
	{
		while (i < num)
		{
			if (num % i == 0)
				return 0;
			i++;
		}
		return 1;
	}
	else return 0;
}
