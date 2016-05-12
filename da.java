import java.io.*;
import java.math.*;
import java.util.*;
class da
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,p=0;
p=Integer.parseInt(b.readLine());
for(i=0;i<p;i++)
{
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
String n=c.nextToken();
String k=c.nextToken();
String m=c.nextToken();
int ans=0;
BigInteger num1=new BigInteger(n);
BigInteger num2=new BigInteger(k);
BigInteger num3=new BigInteger(m);
BigInteger tmp=num1.multiply(num2);
while(tmp.compareTo(num3)<=0)
{
tmp=tmp.multiply(num2);
ans++;
}
System.out.println(ans);
}
}
}