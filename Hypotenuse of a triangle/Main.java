#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,hyp;
  scanf("%f %f",&a,&b);
  hyp=a*a+b*b;
  c=sqrt(hyp);
  printf("%0.2f",c);
  return 0;
}