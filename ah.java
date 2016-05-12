import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double f=0,e=0,d=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d=Double.parseDouble(c.nextToken());
e=Double.parseDouble(c.nextToken());
f=Double.parseDouble(c.nextToken());
if(e<d/2&&e>-d/2&&f>0&&f<d)
System.out.print("1");
else
{
if(e<d/2&&e>-d/2&&f>d&&f<2*d)
System.out.print("2");
else
{
if(e<d&&e>0&&f>2*d&&f<3*d)
System.out.print("4");
else
{
if(e<0&&e>-d&&f>2*d&&f<3*d)
System.out.print("3");
else
{
if(e<d/2&&e>-d/2&&f>3*d&&f<4*d)
System.out.print("5");
else
{
if(e<0&&e>-d&&f>4*d&&f<5*d)
System.out.print("6");
else
{
if(e<d&&e>0&&f>4*d&&f<5*d)
System.out.print("7");
else
System.out.print("-1");
}
}
}
}
}
}
}
}