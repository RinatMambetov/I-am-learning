#include <stdio.h>

void main(void)
{
  unsigned int x;
  printf("\7");
  scanf("%d", &x);

  printf("dec %d, oct %o, hex %x\n", x, x, x);
  printf("with pref: dec %d, oct %#o, hex %#x, heX %#X\n", x, x, x, x);
  printf("\7");
}
