#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int	main(int argc, char **argv)
{
	(void)argc;
	(void)argv;
	int arr[] = { 1, 2, 3, 4, 1, 2, 7, 7 }; //sum 27
	int arrsize;
	int start;
	int end;
	int id;
	int sum;
	int fd[2];
	int sumfromchild;
	int totalsum;

	sum = 0;
	arrsize = sizeof(arr) / sizeof(int);
	pipe(fd);
	id = fork();
	if (id == 0)
	{
		start = 0;
		end = arrsize / 2;
	}
	else
	{
		start = arrsize / 2;
		end = arrsize;
	}
	while (start < end)
		sum += arr[start++];
	if (id == 0)
	{
		close(fd[0]);
		write(fd[1], &sum, sizeof(int));
		close(fd[1]);
	}
	else
	{
		close(fd[1]);
		read(fd[0], &sumfromchild, sizeof(int));
		close(fd[0]);
		totalsum = sum + sumfromchild;
		printf("totalsum=%d\n", totalsum);
	}
	return (0);
}
