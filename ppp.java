import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,y=0,n=0;
String p;
p=b.readLine();
StringTokenizer c=new StringTokenizer(p);
n=Integer.parseInt(c.nextToken());
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
n--;
if((n-x)<=y)
System.out.print(n-x+1);
else
System.out.print(y+1);
}
}