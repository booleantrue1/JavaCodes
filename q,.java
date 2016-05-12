import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0,n=0,k=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
m*=10;
for(i=0;i<10;i++)
{
m+=i;
if(m%n==0)
{
System.out.print(m);
for(i=1;i<=k-1;i++)
System.out.print("0");
System.exit(0);
}
m-=i;
}
System.out.print("-1");
}
}