import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,m=0,n=0,r=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(n>=m)
{
System.out.print("-1");
System.exit(0);
}
if(m%n==0)
{
p=m/n-1;
r=n;
}
else
{
p=m/n;
r=m%n;
}
System.out.print(r-1+p);
}
}