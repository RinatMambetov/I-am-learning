#include <unistd.h>
#include <stdio.h>
// #include <sys/wait.h>
#include <stdlib.h>

int	main(int argc, char **argv)
{
	(void)argc;
	(void)argv;
	int id;

	id = fork(); //0 for child, id of child for parent
	if (id == 0) //child
		sleep(1);
	printf("current id %d, parent id %d\n", getpid(), getppid());

	int res = wait(NULL); //id of child
	if (res == -1)
		printf("%d no child to wait for\n", id);
	else
		printf("%d %d finished execusion\n",id ,res);
	return (0);
}
