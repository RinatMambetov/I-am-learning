#include <stdio.h>

void billyGoodGuy(void);
void billyTheBest(void);

void main(void)
{
  billyGoodGuy();
  billyGoodGuy();    
  billyGoodGuy();
  billyTheBest();
}

void billyGoodGuy(void)
{
  printf("Billy - good guy!\n");
}

void billyTheBest(void)
{
  printf("Billy - the best!\n");
}
