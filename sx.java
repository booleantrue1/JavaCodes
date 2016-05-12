import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,p=0,n=0,m=0,l=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
p=Integer.parseInt(z.nextToken());
int d[]=new int[n+1];
d[0]=0;
for(i=0;i<p;i++)
d[Integer.parseInt(z.nextToken())]=1;
for(i=1;i<=n;i++)
{
if(d[i]==0)
m++;
else
m=0;
if(m==k)
{
d[i]=1;
m=0;
}
}
for(i=0;i<=n;i++)
if(d[i]==1)
l++;
System.out.print(l);
}
}