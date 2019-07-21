#include<stdio.h>
int main()
{
  int d;
  float pi=3.14,area,r;
  scanf("%d",&d);
  r=(float)d/2;
 area=pi*r*r;
  printf("%0.2f",area);
  return 0;
}