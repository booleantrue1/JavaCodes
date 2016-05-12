import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d=0,p=0,n=0,m=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(p==0)
System.out.print(m);
else
{
if(p==1)
System.out.print(n);
else
{
for(i=2;i<=p;i++)
{
d=m+n;
m=n;
n=d;
}
System.out.print(d);
}
}
}
}




