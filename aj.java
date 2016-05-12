import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,i=0;
long t=0,k=-1000000005;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
int e[]=new int[m];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[i]=Integer.parseInt(z.nextToken());
e[i]=Integer.parseInt(z.nextToken());
if(e[i]>n)
t=d[i]-e[i]+n;
else
t=d[i];
if(t>k)
k=t;
}
System.out.print(k);
}
}