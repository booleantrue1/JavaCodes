import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
int m=0,i=0,n=0;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
BigInteger fact[]=new BigInteger[101];
fact[0]=new BigInteger("1");
BigInteger nos=new BigInteger("1");
BigInteger N=new BigInteger("10000007");
for(i=1;i<101;i++)
{
nos=new BigInteger(String.valueOf(i));
fact[i]=fact[i-1].multiply(nos);
}
StringTokenizer c=new StringTokenizer(b.readLine());
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
if(n<m)
{
System.out.println("-1");
return ;
}
System.out.println(((fact[n-1].divide(fact[n-m])).divide(fact[m-1])).mod(N));
}
}
