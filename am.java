import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,k=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
m=n;
for(i=1;i<=(n-k-1);i++)
System.out.print(i+" ");
for(i=0;i<=k;i++)
{
System.out.print(m+" ");
m--;
}
}
}