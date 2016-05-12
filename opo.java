import java.io.*;
import java.util.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,j=0;
String s=b.readLine();
n=s.length();
BigInteger p=new BigInteger("1");
BigInteger q=new BigInteger("1");
BigInteger t=new BigInteger("0");
BigInteger m=new BigInteger("2");
BigInteger MOD=new BigInteger("1000000007");
for(i=n-1;i>=0;i--)
{
if((Integer.parseInt(s.substring(i,i+1)))==1)
{
for(j=0;j<n-1-i;j++)
p=p.multiply(m);
t=t.add(p);
p=q;
}
}
p=q;
for(j=0;j<n-1;j++)
p=p.multiply(m);
t=t.multiply(p);
System.out.print(t.mod(MOD));
}
}