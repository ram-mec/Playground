#include<stdio.h>
void main()
{
  float r,len,a;
  scanf("%f %f",&r,&a);
  len=2*3.14*r*(a/360);
  printf("%0.2f",len);
  return 0;
}