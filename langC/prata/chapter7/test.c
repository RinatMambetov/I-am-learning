#include <stdio.h>
#include <math.h>
#include <time.h>

void main(void)
{
	clock_t tic = clock();
	test: printf("hello\n");
	printf("%.2lf\n", sqrt(9.0));
	clock_t toc = clock();
	printf("Elapsed: %f seconds\n", (double)(toc - tic) / CLOCKS_PER_SEC);
}
