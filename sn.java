import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,k=0,t=0;
String s,r="\0";
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
if(k==1)
{
if(n%2==1)
System.out.println("0");
else
System.out.println("1");
continue;
}
if(n==2)
{
System.out.println(k);
continue;
}
if(n==3)
{
System.out.println(k*(k-1));
continue;
}
BigInteger m=new BigInteger(String.valueOf(k));
BigInteger v=new BigInteger("1");
for(j=0;j<n-2;j++)
v=v.multiply(m);
BigInteger p=v.multiply(m);
BigInteger u=new BigInteger(String.valueOf(k-1));
BigInteger q=v.multiply(u);
BigInteger l=q.add(p);
BigInteger kl=new BigInteger("2");
BigInteger lk=l.divide(kl);
BigInteger x=new BigInteger("1000000007");
BigInteger w=lk.mod(x);
System.out.println(w);
}
}
}