/* two_func.c - the prog, used two func in one file */

#include <stdio.h>

void butler(void);

int main(void)
{
  printf("I'm call\ing butler.\n");
  butler();
  printf("Yes. Bring me tea and rewritable CDs.\n");
  return 0;
}

void butler(void)
{
  printf("Yes, sir!\n");
}
