#include <unistd.h>
#include <stdio.h>

int	main(int argc, char **argv)
{
	(void)argc;
	(void)argv;
	int id1;
	int id2;

	id2 = -2;
	id1 = fork();
	if (id1 != 0)
	{
		id2 = fork();
	}
	printf("id1=%d id2=%d\n", id1, id2);
	return (0);
}
