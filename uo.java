import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int x=0,y=0,b=0,c=0,d=0,j=0,m=0,v=0,w=0,n=0,k=0,a=0,i=0;
String s,g,r,t;
int e[]=new int[9];
s=obj.readLine();
StringTokenizer u=new StringTokenizer(s);
m=Integer.parseInt(u.nextToken());
n=Integer.parseInt(u.nextToken());
r=obj.readLine();
StringTokenizer p=new StringTokenizer(r);
v=Integer.parseInt(p.nextToken());
w=Integer.parseInt(p.nextToken());
t=obj.readLine();
StringTokenizer q=new StringTokenizer(t);
x=Integer.parseInt(q.nextToken());
y=Integer.parseInt(q.nextToken());
for(i=0;i<9;i++)
e[i]=1;
for(j=1;j<10;j++)
{
if(m-j<10&&m-j>0&&m-j!=j)
{
a=j;
b=m-j;
e[j-1]=0;
e[m-j-1]=0;
if(v-a!=j&&v-a!=m-j&&v-a>0&&v-a<10)
{
c=v-a;
e[v-a-1]=0;
if(w-b!=j&&w-b!=m-j&&w-b!=v-a&&w-b>0&&w-b<10)
{
d=w-b;
e[w-b-1]=0;
if(n==c+d&&x==a+d&&y==b+c)
{
k=1;
break;
}
else
for(i=0;i<9;i++)
e[i]=1;
}
else
for(i=0;i<9;i++)
e[i]=1;
}
else
for(i=0;i<9;i++)
e[i]=1;
}
else
for(i=0;i<9;i++)
e[i]=1;
}
if(k==1)
System.out.print(a+" "+b+"\n"+c+" "+d);
else
System.out.print("-1");
}
}