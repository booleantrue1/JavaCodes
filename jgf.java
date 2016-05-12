import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
BigInteger m1=new BigInteger("3");
BigInteger m2=new BigInteger("5");
BigInteger m3=new BigInteger("2");
BigInteger m4=new BigInteger("1");
BigInteger m5=new BigInteger("0");
String s;
int i=0,n1=0;
n1=Integer.parseInt(b.readLine());
for(i=0;i<n1;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
BigInteger m=new BigInteger(c.nextToken());
BigInteger n=new BigInteger(c.nextToken());
BigInteger k=new BigInteger(c.nextToken());
if(k.compareTo(m5)!=0)
{
BigInteger terms=(m3.multiply(k)).divide(m.add(n));
System.out.println(terms);
BigInteger d=((n.subtract(m)).divide(terms.subtract(m2)));
BigInteger a=(m.subtract(m3.multiply(d)));
BigInteger j=new BigInteger("0");
while(j.compareTo(terms)<0)
{
System.out.print(a.add(j.multiply(d))+" ");
j=j.add(m4);
}
System.out.print("\n");
}
else
{
System.out.print(m1.multiply(m)+" "+m3.multiply(m)+" "+m4.multiply(m)+" 0 ");
System.out.print(m4.multiply(n)+" "+m3.multiply(n)+" "+m1.multiply(n));
System.out.println();
}
}
}
}