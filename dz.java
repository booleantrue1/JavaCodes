import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double l=0,d=0,v=0,g=0,r=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
l=Double.parseDouble(c.nextToken());
d=Double.parseDouble(c.nextToken());
v=Double.parseDouble(c.nextToken());
g=Double.parseDouble(c.nextToken());
r=Double.parseDouble(c.nextToken());
if(((d/v)%(g+r))<g&&((d/v)%(g+r))>0)
System.out.print(l/v);
else
{
t=(g+r)-((d/v)%(g+r));
System.out.print(d/v+t+(l-d)/v);
}
}
}