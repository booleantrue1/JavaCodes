import java.io.*;
import java.util.*;
class x
{
public static void main(String aa[])throws IOException
{
BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
int a,b,r,m=0,n=0;
float y,z;
String s;
s=k.readLine();
StringTokenizer c=new StringTokenizer(s);
a=Integer.parseInt(c.nextToken());
b=Integer.parseInt(c.nextToken());
r=Integer.parseInt(c.nextToken());
if((2*r)>a||(2*r)>b)
System.out.print("Second");
else
{
y=a/2f;
z=b/2f;
if(r<=y&&r<=z)
System.out.print("First");
else
{
m=a/(2*r);
n=b/(2*r);
if(m%2==0||n%2==0)
System.out.print("Second");
else
System.out.print("First");
}
}
}
}