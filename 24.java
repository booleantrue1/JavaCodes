import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,p=0,n=0,l=0,m=0,i=0;
long t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
int e[]=new int[n];
for(i=0;i<n;i++)
e[i]=1000005;
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
k=Integer.parseInt(z.nextToken());
l=Integer.parseInt(z.nextToken());
if(l<e[k-1])
e[k-1]=l;
}
for(i=0;i<n;i++)
t+=e[i];
if(t>p)
System.out.print(p);
else
System.out.print(t);
}
}