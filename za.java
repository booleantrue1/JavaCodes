import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0;
String r;
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
if(n*k>=0)
{
if(Math.sqrt(n*n+k*k)==(int)Math.sqrt(n*n+k*k))
{
System.out.print("black");
System.exit(0);
}
else
{
if((Math.ceil(Math.sqrt(n*n+k*k)))%2==1)
{
System.out.print("black");
System.exit(0);
}
else
{
System.out.print("white");
System.exit(0);
}
}
}
else
{
if(Math.sqrt(n*n+k*k)==(int)Math.sqrt(n*n+k*k))
{
System.out.print("black");
System.exit(0);
}
else
{
if((Math.ceil(Math.sqrt(n*n+k*k)))%2==1)
{
System.out.print("white");
System.exit(0);
}
else
{
System.out.print("black");
System.exit(0);
}
}
}
}
}