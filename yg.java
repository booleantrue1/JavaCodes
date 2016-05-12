import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double p=0,k=0,j=0,t=0;
String s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Double.parseDouble(c.nextToken());
p=Double.parseDouble(c.nextToken());
j=Double.parseDouble(c.nextToken());
t=Double.parseDouble(c.nextToken());
if(p-k==j-p&&j-p==t-j)
{
System.out.print((int)(t+t-j));
System.exit(0);
}
if(p/k==j/p&&j/p==t/j)
{
if((t*(t/j))==(int)(t*(t/j)))
System.out.print((int)(t*(t/j)));
else
System.out.print("42");
System.exit(0);
}
System.out.print("42");
}
}