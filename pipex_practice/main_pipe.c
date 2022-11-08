#include <unistd.h>
#include <stdio.h>
// #include <sys/wait.h>
#include <stdlib.h>
#define SIZE 6

int	main(int argc, char **argv)
{
	(void)argc;
	(void)argv;
	char *msg;
	int	id[2];
	int	id2[2];
	char buf[SIZE];

	msg = "hello";
	pipe(id);
	pipe(id2);
	printf("id0=%d id1=%d\n", id[0], id[1]);
	printf("id0=%d id1=%d\n", id2[0], id2[1]);
	write(id[1], msg, SIZE);
	read(id[0], buf, SIZE);
	printf("%s\n", buf);
	return (0);
}
