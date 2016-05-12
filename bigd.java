import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
int j=0,i=0;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int test;
test=Integer.parseInt(b.readLine());
for(j=0;j<test;j++)
{
String temp=b.readLine();
StringTokenizer c=new StringTokenizer(temp);
String x=c.nextToken();
double m_in=Double.parseDouble(c.nextToken());
String m=String.valueOf(m_in);
String n=c.nextToken();
BigInteger one=new BigInteger("1");
BigInteger xx=new BigInteger(x);
BigInteger mm=new BigInteger(m);
BigInteger nn=new BigInteger(n);
if(x.compareTo("1")==0)
System.out.println(mm.add(one).mod(nn));
else
{
BigInteger z=xx.pow(m_in+1);
BigInteger zz=z.subtract(one);
BigInteger zzz=zz.divide(xx.subtract(one));
System.out.println(zzz.mod(nn));
}
}
}
}