#include<stdio.h>
int main()
{
FILE *v,*q;
v=fopen("input.txt","r+");
long m=0,k=0,t=0,n=0,i=0,j=0,h=0,p=0;
int a[100000];
scanf("%ld",&n);
fprintf(v,"%ld",n);
fscanf(v,"%ld",&p);
fclose(v);
for(i=0;i<p;i++)
scanf("%d",&a[i]);
for(j=0;i<p-1;i++)
{
for(i=j+1;i<p;i++)
{
if(a[j]<a[i])
{
t=a[j];
a[j]=a[i];
a[i]=t;
}
}
}
for(i=0;i<p;i++)
if(a[i]<=(2*a[p-1]))
break;
m=i;
for(i=p-1;i>=0;i--)
{
if(a[0]<=(2*a[i]))
break;
h++;
}
k=h;
q=fopen("output.txt","w");
if(m>k)
fprintf(q,"%ld",k);
else
fprintf(q,"%ld",m);
fclose(q);
return(0);
}