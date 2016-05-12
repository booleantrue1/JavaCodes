import java.io.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String k;
int i=0,p=0,n=0;
long l=0,t=3;
k=b.readLine();
l=Long.parseLong(k);
n=k.length();
for(i=0;i<n;i++)
p+=(Integer.parseInt(k.substring(i,i+1)));
while(true)
{
if(l%t!=0)
break;
else
t=t*3;
}
BigInteger b1=new BigInteger(k);
BigInteger b5=new BigInteger(String.valueOf(t));
BigInteger b2=new BigInteger("3");
BigInteger b3=b1.divide(b2);
BigInteger b4=new BigInteger("1");
if(p%3!=0)
System.out.print(b3.add(b4));
else
{
System.out.print((b1.divide(b5)).add(b4));
}
}
}