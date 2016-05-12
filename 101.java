import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,n=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p=c.countTokens();
long t=0;
for(i=0;i<p;i++)
{
n=Integer.parseInt(c.nextToken());
t+=n*i;
}
System.out.print(t);
}
}