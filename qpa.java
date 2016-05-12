import java.io.*;
import java.util.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
int i,n,t;
BigInteger ans[]=new BigInteger[505];
ans[0]=new BigInteger("1");
BigInteger d=new BigInteger("2");
BigInteger e=new BigInteger("1298074214633706835075030044377087");
for(t=1;t<501;t++)
ans[t]=(ans[t-1].add(d.pow(t))).mod(e);
t=b.nextInt();
for(i=0;i<t;i++)
{
n=b.nextInt();
System.out.println(ans[n]);
}
}
}