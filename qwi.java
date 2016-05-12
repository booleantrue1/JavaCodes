import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n,i;
n=Integer.parseInt(b.readLine());
BigInteger A=new BigInteger("252");
BigInteger B=new BigInteger("525");
BigInteger C=new BigInteger("0");
for(i=0;i<n;i++)
{
BigInteger num=new BigInteger(b.readLine());
if((num.mod(A)).compareTo(C)==0)
System.out.print("Yes ");
else
System.out.print("No ");
if((num.mod(B)).compareTo(C)==0)
System.out.println("Yes");
else
System.out.println("No");
}
}
}