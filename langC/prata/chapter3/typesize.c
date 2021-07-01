#include <stdio.h>

void main(void)
{
  printf("Type int has %lu bytes.\n", sizeof(int));
  printf("Type char has %lu bytes.\n", sizeof(char));
  printf("Type long has %lu bytes.\n", sizeof(long));
  printf("Type double has %lu bytes.\n", sizeof(double));
}
