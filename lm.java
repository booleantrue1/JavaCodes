import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,p=0,j=0,k=0,n=0,i=0,min=1000;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
n=(int)Math.abs(n-1);
m=(int)Math.abs(m-1);
k=(int)Math.abs(k-1);
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
i=Integer.parseInt(z.nextToken());
j=Integer.parseInt(z.nextToken());
p=Integer.parseInt(z.nextToken());
if(n==i&&j==m&&k==p)
System.out.print("NO");
else
System.out.print("YES");
}
}