import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int X=0,Y=0,n=0,i=0;
double p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
X=Integer.parseInt(c.nextToken());
Y=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(Y==0)
{
System.out.print("0");
System.exit(0);
}
if(X==0)
{
System.out.print("No solution");
System.exit(0);
}
p=(double)Y/X;
for(i=-1001;i<1002;i++)
if(Math.pow(i,n)==p)
{
System.out.print(i);
System.exit(0);
}
System.out.print("No solution");
System.exit(0);
}
}