import java.io.*;
import java.util.*;
import java.math.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,p=0;
String r,s,t;
m=Integer.parseInt(b.readLine());
for(p=0;p<m;p++)
{
BigInteger c=new BigInteger("0");
r=b.readLine();
StringTokenizer z=new StringTokenizer(r);
s=z.nextToken();
BigInteger d=new BigInteger(s);
BigInteger e=new BigInteger("1");
t=z.nextToken();
BigInteger f=new BigInteger(t);
BigInteger l=f.subtract(e);
BigInteger g=d.mod(l);
if(g.compareTo(c)==0)
{
BigInteger h=d.divide(l);
BigInteger i=h.subtract(e);
BigInteger j=i.add(d);
System.out.println(j);
}
else
{
BigInteger h=d.divide(l);
BigInteger j=h.add(d);
System.out.println(j);
}
}
}
}