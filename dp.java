#include<stdio.h>
#include<math.h>
int main()
{
long j=0,p=0,m=0,i=0,l=0,n=0,t=0,f=0,k=0;
scanf("%ld",&n);
scanf("%ld",&m);
scanf("%ld",&l);
long d[n];
d[0]=0;
for(i=0;i<m;i++)
{
scanf("%ld",&p);
scanf("%ld",&t);
for(j=p-1;j<t;j++)
d[j]=(long)abs(d[j]-1);
for(j=0;j<n;j++)
{
if(d[j]==0)
k++;
if(k==l)
{
f=1;
break;
}
}
if(f==0)
printf("AC?\n");
else
printf("%ld\n",(j+1));
f=0;
k=0;
}
return(0);
}