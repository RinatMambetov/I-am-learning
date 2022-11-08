#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/errno.h>
#include <string.h>

int	main(int argc, char **argv, char **envp)
{
	(void)argc;
	(void)argv;

	while (*envp)
		printf("%s\n", *envp++);
	execve("for_execve", NULL, NULL);
	printf("errno = %d\n", errno);
	printf("strerror(errno) = %s\n", strerror(errno));
	perror("my perror");
	return (0);
}
