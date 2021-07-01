#include <stdio.h>

int main(void)
{
  float weight;
  float value;

  printf("Do you want to know your rhodium equiv?\n");
  printf("Let's count!\n");
  printf("Please enter your weight at the pounds.\n");

  scanf("%f", &weight);
  value = 770  * weight * 14.5833;

  printf("Your rhodium equiv is $%.4f.\n", value);
  printf("If cost of rhodium down,\n");
  printf("eat more for maintain your cost!\n");

  return 0;
}
