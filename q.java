import java.io.*;
import java.util.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double d,e,f;
int m=0,n=0;
long t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d=Double.parseDouble(c.nextToken());
e=Double.parseDouble(c.nextToken());
f=Double.parseDouble(c.nextToken());
m=(int)(d/f);
n=(int)(e/f);
if((d-m*f)!=0)
m++;
if((e-n*f)!=0)
n++;
t=((long)m)*n;
System.out.print(t);
}
}