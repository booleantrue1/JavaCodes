#include<stdio.h>
int main()
{
float l=0,p=0,u=0,v=0,t=0,q=0,n=0,m=0;
long i=0,j=0;
float z[2];
scanf("%f",&z[0]);
scanf("%f",&z[1]);
n=z[0];
m=z[1];
scanf("%f",&z[0]);
scanf("%f",&z[1]);
p=z[0];
q=z[1];
float d[100005];
float e[100005];
for(i=0;i<n;i++)
{
scanf("%f",&z[0]);
scanf("%f",&z[1]);
u=z[0];
v=z[1];
d[i]=u*p+v*q;
e[i]=i+1;
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(d[j]<d[i])
{
t=d[j];
d[j]=d[i];
d[i]=t;
t=e[j];
e[j]=e[i];
e[i]=t;
}
}
}
for(i=0;i<n;i++)
{
l+=d[i];
if(l>m)
break;
if(l==m)
{
i++;
break;
}
}
printf("%ld\n",i);
for(j=0;j<i;j++)
printf("%ld ",(long)e[j]);
return(0);
}