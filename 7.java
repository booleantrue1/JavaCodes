#include<stdio.h>
int main()
{
int n,i,k;
long p=0;
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&k);
if(k>0)p+=k;
}
printf("%ld",p);
return(0);
}
