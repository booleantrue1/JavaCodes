import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
try
{
int k=0,n=0,m=0,i=0,j=0,s1=0,r1=0;
String s,r;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
BigInteger d[]=new BigInteger[m];
BigInteger e[]=new BigInteger[m];
BigInteger f1=new BigInteger("0");
BigInteger f2=new BigInteger("0");
BigInteger f3=new BigInteger("1000000000");
e[0]=new BigInteger("1");
if(m>1)
e[1]=new BigInteger("1");
for(i=2;i<m;i++)
e[i]=e[i-1].add(e[i-2]);
s=b.readLine();
StringTokenizer z1=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=new BigInteger(z1.nextToken());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z2=new StringTokenizer(s);
r=z2.nextToken();
if(r.equals("1"))
{
r=z2.nextToken();
s=z2.nextToken();
d[Integer.parseInt(r)-1]=new BigInteger(s);
}
else
{
r1=Integer.parseInt(z2.nextToken());
s1=Integer.parseInt(z2.nextToken());
for(j=r1-1;j<s1;j++)
{
f1=f1.add(d[j].multiply(e[j-r1+1]));
}
System.out.println(f1.mod(f3));
f1=f2;
}
}
}
catch(Exception e){}
}
}