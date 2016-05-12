import java.io.*;
import java.math.*;
import java.util.*;
class j
{
/*static BigInteger pow(BigInteger base, BigInteger exponent) 
{
BigInteger result = BigInteger.ONE;
while (exponent.signum() > 0) 
{
if (exponent.testBit(0)) result = result.multiply(base);
base = base.multiply(base);
exponent = exponent.shiftRight(1);
}
return result;
}*/
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String n,p;
n=b.readLine();
p=b.readLine();
BigInteger c=new BigInteger(n);
BigInteger d=new BigInteger(p);
System.out.print(c.modPow(d));
}
}