#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int	main(int argc, char **argv)
{
	(void)argc;
	(void)argv;
	int fd[2];
	int pid1;
	int pid2;

	if (pipe(fd) == -1)
		return (1);
	printf("fd0=%d fd1=%d\n", fd[0], fd[1]);
	pid1 = fork();
	if (pid1 < 0)
		return (1);
	if (pid1 == 0) //child1
	{
		dup2(fd[1], STDOUT_FILENO);
		// close(fd[0]);
		// close(fd[1]);
		execlp("ping", "ping", "-c", "2", "ya.ru", NULL);
	}
	pid2 = fork();
	if (pid2 < 0)
		return (1);
	if (pid2 == 0) //child2
	{
		dup2(fd[0], STDIN_FILENO);
		close(fd[0]);
		close(fd[1]);
		execlp("grep", "grep", "loss", NULL);
	}
	close(fd[0]);
	close(fd[1]);
	waitpid(pid1, NULL, 0);
	waitpid(pid2, NULL, 0);
	return (0);
}
