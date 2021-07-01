#include <stdio.h>

void main(void)
{
  int i = 2147483647;
  unsigned int j = 4294967295;
  printf("overflow int: %d %d %d\n", i, i + 1, i + 2);
  printf("overflow unsigned int: %u %u %u\n", j, j + 1, j + 2);

  float toobig = 3.4e38 * 100.0f;
  printf("overflow float: %e\n", toobig);

  float a, b;
  b = 2.0e20 + 1.0;
  a = b - 2.0e20;
  printf("rounding error: %f\n", a);
}
