import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,m=0,p=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
System.out.println(m+n-1);
for(i=1;i<=m;i++)
System.out.println("1 "+i);
for(i=2;i<=n;i++)
System.out.println(i+" 1");
}
}