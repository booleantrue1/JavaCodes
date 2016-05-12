import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
int p=0,i=0,n=0;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
BigInteger fact[]=new BigInteger[201];
fact[0]=new BigInteger("1");
BigInteger nos=new BigInteger("1");
BigInteger N=new BigInteger("761238923");
for(i=1;i<201;i++)
{
nos=new BigInteger(String.valueOf(i));
fact[i]=fact[i-1].multiply(nos);
}
while(true)
{
p=Integer.parseInt(b.readLine());
if(p==0)
return ;
System.out.println(((fact[2*p].divide(fact[p])).divide(fact[p+1])).mod(N));
}
}
}
