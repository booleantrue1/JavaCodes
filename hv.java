import java.io.*;
import java.util.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
double k=0;
n=Integer.parseInt(b.readLine());
String r="\0";
for(i=0;i<n;i++)
{
r=b.readLine();
k=Double.parseDouble(r);
if(k<16)
{
if(k==1||k==2||k==3)
System.out.println("0");
if(k==4||k==5)
System.out.println("3");
if(k==6)
System.out.println("8");
if(k==7)
System.out.println("14");
if(k==8)
System.out.println("14");
if(k==9)
System.out.println("14");
if(k==10)
System.out.println("23");
if(k==11)
System.out.println("33");
if(k==12)
System.out.println("33");
if(k==13)
System.out.println("45");
if(k==14)
System.out.println("45");
if(k==15)
System.out.println("45");
}
else
{
BigInteger c=new BigInteger(r);
BigInteger d=new BigInteger("3");
BigInteger e=new BigInteger("5");
BigInteger f=new BigInteger("15");
BigInteger g=c.divide(d);
BigInteger h=c.divide(e);
BigInteger j=c.divide(f);
BigInteger l=new BigInteger("2");
BigInteger m=new BigInteger("-1");
BigInteger o=(g.multiply((d.multiply(l)).add((g.add(m)).multiply(d)))).divide(l);
BigInteger p=(h.multiply((e.multiply(l)).add((h.add(m)).multiply(e)))).divide(l);
BigInteger q=(j.multiply((f.multiply(l)).add((j.add(m)).multiply(f)))).divide(l);
BigInteger s=c.mod(d);
BigInteger t=c.mod(e);
BigInteger u=new BigInteger("0");
BigInteger v=(o.add(p)).subtract(q);
if(s.compareTo(u)!=0&&t.compareTo(u)!=0)
System.out.println(v);
else
System.out.println(v.subtract(c));
}
}
}
}