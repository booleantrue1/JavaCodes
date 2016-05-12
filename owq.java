import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,n;
String s;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
BigInteger b1=new BigInteger(c.nextToken());
BigInteger c1=new BigInteger(c.nextToken());
BigInteger d1=new BigInteger(c.nextToken());
BigInteger e1=c1.subtract(d1);
BigInteger f1=c1.subtract(b1);
System.out.println(e1.add(f1));
}
}
}