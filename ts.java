#include<stdio.h>
int Prime[1100000];
int pos[50100010];
#define prime(i) ((Prime[i>>5])&(1<<(i&(31))))
#define assign(j) (Prime[j>>5]|=(1<<(j&(31))))
#define LIMIT 10001000
#define SLIMIT 3170
int i,j,m,n,t,x,k,l,h;
void sieve()
{
pos[0]=0;
assign(1);
pos[1]=2;
pos[2]=3;
for(k=2,l=3,i=5; i<=SLIMIT; k++,i=3*k-(k&1)-1)
if(prime(k)==0)
{
pos[l++]=i;
for(j=i*i,h=((j+2)/3); j<=LIMIT; h+=(k&1)?(h&1?((k<<2)-3):((k<<1)-1)):(h&1?((k<<1)-1):((k<<2)-1)),j=3*h-(h&1)-1)
assign(h);
}
i=3*k-(k&1)-1;
for(; i<=LIMIT; k++,i=3*k-(k&1)-1)
if(prime(k)==0)
pos[l++] = i;
}
int main()
{
sieve();
int low,high,m1,mid1,mid2,i1,m2,t1,flag1=0,flag2=0;
scanf("%d",&t1);
for(i1=0;i1<t1;i1++)
{
   scanf("%d",&m1);
   low=0,high=664585;
   printf("%d\n",pos[664585]);
   while(low<high)
   {
      mid1=(low+high)/2;
      if(pos[mid1]==m1)
      {
         flag1++;
         break;
      }
      if(m1<pos[mid1])
         high=mid1-1;
      else
         low=mid1+1;
   }
   if(flag1==0)
   mid1=low-1;
   printf("%d ",flag1);
   low=0,high=664585;
   m2=m1/2;
   while(low<high)
   {
      mid2=(low+high)/2;
      if(pos[mid2]==m2)
      {
         flag2++;
         break;
      }
      if(m2<pos[mid2])
         high=mid2-1;
      else
         low=mid2+1;
   }
   if(flag2==0)
   mid2=low;
   else
   mid2++;
   printf("%d %d ",mid1,mid2);
   if(m1==3)
   printf("2\n");
   else
   printf("%d\n",mid1-mid2+1);
flag1=0;
flag2=0;
}
return 0;
}
