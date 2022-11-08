#include <unistd.h>
#include <stdio.h>
// #include <sys/wait.h>
#include <stdlib.h>

int	main(int argc, char **argv)
{
	(void)argc;
	(void)argv;
	int id;
	int n;
	int i;

	id = fork();
	if (id == 0)
		n = 1;
	else
		n = 6;
	if (id != 0)
		wait(NULL);
	for (i = n; i < n + 5; i++)
		printf("%d ", i);
	if (id != 0)
		printf("\n");
	return (0);
}
