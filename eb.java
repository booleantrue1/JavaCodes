import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p1=0,p2=0,p3=0,k=0,p4=0,m=0,n=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p1=Integer.parseInt(c.nextToken());
p2=Integer.parseInt(c.nextToken());
p3=Integer.parseInt(c.nextToken());
p4=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
for(i=m;i<=n;i++)
if(p1>i&&p2>i&&p3>i&&p4>i)
k++;
System.out.print(k);
}
}