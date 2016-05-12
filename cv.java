import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,m=0,p=0,u=0,v=0;
double t=0,x=1000000;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(p>=n)
{
System.out.print(m+"/"+n);
System.exit(0);
}
else
{
if(m<n)
{
if(p>10000)
for(j=p-1000;j<=p;j++)
{
for(i=0;i<=j;i++)
{
t=Math.abs((double)m/n-(double)i/j);
if(t<x)
{
x=t;
u=i;
v=j;
}
}
}
else
for(j=1;j<=p;j++)
{
for(i=0;i<=j;i++)
{
t=Math.abs((double)m/n-(double)i/j);
if(t<x)
{
x=t;
u=i;
v=j;
}
}
}
System.out.print(u+"/"+v);
System.exit(0);
}
else
{
if(p>1000)
for(j=p-1000;j<=p;j++)
{
for(i=j;Math.ceil((double)i/j)<=Math.ceil((double)m/n)+2;i++)
{
t=Math.abs((double)m/n-(double)i/j);
if(t<x)
{
x=t;
u=i;
v=j;
}
}
}
else
for(j=1;j<=p;j++)
{
for(i=j;Math.ceil((double)i/j)<=Math.ceil((double)m/n)+2;i++)
{
t=Math.abs((double)m/n-(double)i/j);
if(t<x)
{
x=t;
u=i;
v=j;
}
}
}
System.out.print(u+"/"+v);
System.exit(0);
}
}
}
}