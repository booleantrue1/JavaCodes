import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long n=0,k=0,m=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Long.parseLong(c.nextToken());
n=Long.parseLong(c.nextToken());
if(m%2==0)
k=m/2;
else
k=m/2+1;
if(n<=k)
System.out.print(1+(n-1)*2);
else
{
n-=k;
System.out.print(2+(n-1)*2);
}
}
}