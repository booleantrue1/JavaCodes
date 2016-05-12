import java.io.*;
import java.util.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d=0,e=0,r=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d=Integer.parseInt(c.nextToken());
e=Integer.parseInt(c.nextToken());
r=d/2*e;
if(d%2==0)
System.out.print(r);
else
System.out.print(r+e/2);
}
}