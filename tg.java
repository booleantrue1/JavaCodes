import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,n=0,p=0,k=0;
long count=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n+1];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=1;i<=n;i++)
{
k=Integer.parseInt(c.nextToken());
d[k]=i;
}
m=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
p=Integer.parseInt(z.nextToken());
count+=d[p];
}
System.out.print(count+" "+((long)m*(n+1)-count));
}
}