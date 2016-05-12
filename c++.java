#include<stdio.h>
#include<math.h>
int main()
{
long p=0,j=0,n=0,f=0,i=0;
scanf("%ld",&n);
double m=0;
__int64 d[100005];
for(i=0;i<n;i++)
scanf("%l64d",&d[i]);
for(i=0;i<n;i++)
{
m=sqrt(d[i]);
if(d[i]==1||d[i]==2||d[i]==3)
printf("NO\n");
else
{
if(m==(long)m)
{
p=(long)m;
for(j=2;j<=sqrt(p);j++)
{
if(p%j==0)
{
f=1;
break;
}
}
if(f==0)
printf("YES\n");
else
printf("NO\n");
}
else
printf("NO\n");
f=0;
}
}
return(0);
}