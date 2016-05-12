#include<stdio.h>
int main()
{
long j=0,m=0,k=0,i=0,n=0;
scanf("%ld",&m);
double d[m];
for(i=0;i<m;i++)
scanf("%f",&d[i]);
for(i=0;i<m;i++)
{
k=i;
for(j=i+1;j<m;j++)
if(d[j]<d[i])
k=j;
printf("%ld ",k-i-1);
}
return(0);
}