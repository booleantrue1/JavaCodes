import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,n=0,m=0;
double t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(m==1)
{
if(p<=n)
System.out.print("YES");
else
System.out.print("NO");
}
if(m==2)
{
if(2*p<=n)
System.out.print("YES");
else
System.out.print("NO");
}
if(m>2)
{
if(m==6)
{
if((float)n/3>=p)
System.out.print("YES");
else
System.out.print("NO");
}
else
{
t=(3.1415926535897932384626433832795)/m;
t=Math.sin(t);
t=t*2*(n-p);
if(t>2*p)
System.out.print("YES");
else
System.out.print("NO");
}
}
}
}