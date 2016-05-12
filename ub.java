import java.math.*;
import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,j=0,i=0,u=0,k=0;
double r1=0,n=0;
String r="\0",y="\0",t="\0";
n=Double.parseDouble(b.readLine());
for(i=1;i<=90;i++)
{
r1=(Math.sqrt(i*i+4*n)-i)/2;
if(r1==(int)r1)
{
x=(int)r1;
r=String.valueOf(x);
u=r.length();
for(j=0;j<u;j++)
k+=Integer.parseInt(r.substring(j,j+1));
if(k==i)
{
r=String.valueOf(x);
t=String.valueOf(i);
BigInteger f=new BigInteger(r);
BigInteger g=new BigInteger(t);
BigInteger h=f.add(g);
BigInteger m=h.multiply(f);
y=String.valueOf((long)n);
BigInteger c=new BigInteger(y);
if(m.compareTo(c)==0)
{
System.out.print(x);
System.exit(0);
}
}
}
k=0;
}
System.out.print("-1");
}
}