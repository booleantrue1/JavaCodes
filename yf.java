import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
int p=0,i=0,n=0;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
BigInteger fact[]=new BigInteger[101];
fact[0]=new BigInteger("1");
BigInteger nos=new BigInteger("1");
for(i=1;i<101;i++)
{
nos=new BigInteger(String.valueOf(i));
fact[i]=fact[i-1].multiply(nos);
}
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
p=Integer.parseInt(b.readLine());
System.out.println(fact[p]);
}
}
}