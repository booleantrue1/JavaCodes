import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,p=0,q=0,r=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
q=m*p;
r=n*p;
t=(q-r)/n;
if((q-r)%n==0)
System.out.print(t);
else
System.out.print(t+1);
}
}