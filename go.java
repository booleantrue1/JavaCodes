import java.io.*;
import java.math.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n,i;
String s;
BigInteger n1=new BigInteger("2");
for(i=0;i<10;i++)
{
s=b.readLine();
BigInteger n2=new BigInteger(s);
s=b.readLine();
BigInteger n3=new BigInteger(s);
BigInteger p1=n2.add(n3);
p1=p1.divide(n1);
BigInteger p2=n2.subtract(p1);
System.out.println(p1);
System.out.println(p2);
}
}
}