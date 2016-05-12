import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long j=0,i=0;
String s;
j=Long.parseLong(b.readLine());
BigInteger m1=new BigInteger("2");
for(i=0;i<j;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
BigInteger m=new BigInteger(c.nextToken());
BigInteger n=new BigInteger(c.nextToken());
BigInteger k=new BigInteger(c.nextToken());
System.out.println((m.multiply(m)).subtract((m1.multiply(n))));
}
}
}