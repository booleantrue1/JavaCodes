import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
Arrays.sort(d);
System.out.print("1");
for(i=1;i<n;i++)
System.out.print(" "+d[i-1]);
}
}