import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,v=0,g=0,u=0,i=0,n=0,f=0,r=0;
String s[];
n=Integer.parseInt(b.readLine());
s=new String[n];
s[0]=b.readLine();
StringTokenizer c=new StringTokenizer(s[0]);
g=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
f=g;
r=m;
for(i=1;i<n;i++)
{
s[i]=b.readLine();
StringTokenizer d=new StringTokenizer(s[i]);
u=Integer.parseInt(d.nextToken());
v=Integer.parseInt(d.nextToken());
if(u<g)
{
g=u;
k=0;
}
if(v>m)
{
m=v;
k=0;
}
if(u<=g&&v>=m)
k=i;
}
if(k!=0)
System.out.print(k+1);
else
{
if(g==f&&m==r)
System.out.print(k+1);
else
System.out.print("-1");
}
}
}