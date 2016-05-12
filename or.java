import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(m==0&&n!=0)
System.out.print("Impossible");
else
{
if(n-m>0)
System.out.print(n+" ");
else
System.out.print(m+" ");
if(n==0)
System.out.print(m);
else
System.out.print(m+n-1);
}
}
}