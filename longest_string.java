import java.io.*;
import java.util.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
String s=obj.readLine();
StringTokenizer c=new StringTokenizer(s);
int b=c.countTokens();
String r=c.nextToken();
String f="a",w;
int g=r.length();
int d,q=0;
for(int i=2;i<=b;i++)
{
w=c.nextToken();
d=w.length();
if(d>g)
{
g=d;
f=w;
q=1;
}
}
if(q==0)
System.out.print(r);
else
System.out.print(f);
}}

