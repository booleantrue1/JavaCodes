import java.io.*;
import java.math.*;
import java.util.*;
class j
{
BigDecimal sqrt(BigInteger n) 
{
BigDecimal a=BigDecimal.ONE;
BigDecimal b=new BigDecimal(n.shiftRight(5).add(new BigInteger("8")).toString());
while(b.compareTo(a)>=0) 
{
BigDecimal mid = new BigDecimal(a.add(b).shiftRight(1).toString());
if(mid.multiply(mid).compareTo(n)>0) 
b=mid.subtract(BigDecimal.ONE);
else 
a=mid.add(BigDecimal.ONE);
}
return a.subtract(BigDecimal.ONE);
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j,n=0,t,i;
BigInteger three=new BigInteger("3");
BigInteger five=new BigInteger("5");
BigInteger num=new BigInteger("69");
j obj=new j();
BigDecimal ans1=obj.sqrt(num);
BigInteger ans2=(three.add(num)).divide(five);
System.out.print(ans2);
}
}