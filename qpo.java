import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
int d;
while(true)
{
String s=b.nextLine();
if(s.equals("0 0"))
System.exit(0);
StringTokenizer c=new StringTokenizer(s);
BigInteger n=new BigInteger(c.nextToken());
d=Integer.parseInt(c.nextToken());
System.out.println(n.pow(d));
}
}
}