import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,i=0;
long p=0;
String s;
m=Integer.parseInt(b.readLine());
n=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=1;i<n;i++)
p+=(m-(Integer.parseInt(c.nextToken())));
System.out.print(p);
}
}