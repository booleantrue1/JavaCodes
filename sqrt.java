import java.io.*;
import java.util.*;
import java.math.*;
class j
{
static BigDecimal sqrt(BigDecimal n)
{
BigDecimal a=BigDecimal.ONE;
BigDecimal b=new BigDecimal(n.shiftRight(5).add(new BigDecimal("8")).toString());
while(b.compareTo(a)>=0)
{
BigDecimal mid=new BigDecimal(a.add(b).shiftRight(1).toString());
if(mid.multiply(mid).compareTo(n)>0)
b=mid.subtract(BigDecimal.ONE);
else a=mid.add(BigDecimal.ONE);
}
return a.subtract(BigDecimal.ONE);
}
public static void main(String args[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,min=1000000;
long a,l,n;
String s,aa,ll,nn;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
aa=c.nextToken();
a=Long.parseLong(aa);
ll=c.nextToken();
l=Long.parseLong(ll);
nn=c.nextToken();
BigInteger aaa=new BigInteger(aa);
BigInteger lll=new BigInteger(ll);
BigInteger nnn=new BigInteger(nn);
BigDecimal b1=new BigDecimal("2");
BigDecimal b2=new BigDecimal("5");
BigDecimal b3=new BigDecimal("7");
BigDecimal b4=new BigDecimal("12");
BigDecimal b5=new BigDecimal("4");
BigDecimal x1=aaa.add(lll);
BigDecimal y1=((aaa.multiply(b3)).add(lll.multiply(b2))).add(nnn.multiply(b1));
BigDecimal z1=nnn.multiply(b4);
BigDecimal D=(y1.pow(2)).subtract(b5.multiply(x1.multiply(z1)));
BigDecimal temp=new BigDecimal(sqrt(D).toString());
BigDecimal dr=aaa.multiply(b1);
String root1=(x1.add(temp).divide(dr)).toString();
String root2=(x1.subtract(temp).divide(dr)).toString();
System.out.print(root1+" "+root2);
}
}