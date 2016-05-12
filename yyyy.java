import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,n=0,i=0,m=0,g=0;
long l=0,k=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
long d[]=new long[n];
long e[]=new long[m];
int f[]=new int[n];
e[0]=0;
for(i=0;i<n;i++)
f[i]=-1;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Long.parseLong(z.nextToken());
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
t=Integer.parseInt(x.nextToken());
if(t==1)
{
g=Integer.parseInt(x.nextToken());
p=Long.parseLong(x.nextToken());
d[g-1]=p;
e[0]=0;
f[g-1]=0;
}
if(t==2)
{
l=Long.parseLong(x.nextToken());
e[0]=l;
}
if(t==3)
{
e[0]=0;
g=Integer.parseInt(x.nextToken());
System.out.println(d[g-1]);
}
for(i=1;i<m;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
t=Integer.parseInt(y.nextToken());
if(t==1)
{
g=Integer.parseInt(y.nextToken());
p=Long.parseLong(y.nextToken());
d[g-1]=p;
e[i]=e[i-1];
f[g-1]=i;
}
if(t==2)
{
l=Long.parseLong(y.nextToken());
e[i]=e[i-1]+l;
}
if(t==3)
{
e[i]=e[i-1];
g=Integer.parseInt(y.nextToken());
if(f[g-1]!=-1)
System.out.println(d[g-1]+e[i]-e[f[g-1]]);
else
System.out.println(d[g-1]+e[i]);
}
}
}
}