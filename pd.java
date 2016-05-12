#include<stdio.h>
int main()
{
long i=0,k=0,m=0,n=0;
char s[1000002];
scanf("%s",s);
n=strlen(s);
printf("%ld\n",n);
long e[n];
for(i=0;i<n;i++)
{
if(s[i]=='r')
printf("%ld\n",i+1);
else
{
e[m]=i+1;
m++;
}
}
for(i=m-1;i>=0;i--)
printf("%ld\n",e[i]);
return(0);
}