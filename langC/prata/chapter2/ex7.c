#include <stdio.h>

void one_three(void);
void two(void);

void main(void)
{
  printf("let's start:\n");
  one_three();
  printf("alright!\n");
}

void one_three(void)
{
  printf("one\n");
  two();
  printf("three\n");
}

void two(void)
{
  printf("two\n");
}
