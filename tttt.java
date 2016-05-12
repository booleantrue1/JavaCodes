import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,i=0,m=0,f=0;
long l=0,p=0,u=0,v=0,w=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
long d[]=new long[n+1];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
if(n==1)
{
m=Integer.parseInt(z.nextToken());
System.exit(0);
}
for(i=1;i<=n;i++)
{
w=Long.parseLong(z.nextToken());
l=p-(n-i)*w*(i-k-1);
if(l<m)
{
System.out.println(i);
k++;
}
else
p+=w*(i-k-1);
}
}
}