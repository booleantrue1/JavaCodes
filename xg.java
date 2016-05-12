import java.io.*;
import java.util.*;
class j
{
static int gcd(int x,int y)
{
if(y==0)
return x;
return (gcd(y,x%y));
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int leftn=0,leftd=0,fractn=0,fractd=0,k=0,m=0,n=0,p=0;
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Integer.parseInt(z.nextToken());
n=Integer.parseInt(z.nextToken());
k=Integer.parseInt(z.nextToken());
p=Integer.parseInt(z.nextToken());
if(m*p<=k*n)
{
leftn=k*n*m-m*m*p;
leftd=k;
fractn=leftn;
fractd=k*m*n;
System.out.print(fractn/gcd(fractn,fractd)+"/"+fractd/gcd(fractn,fractd));
}
else
{
leftn=p*n*m-n*n*k;
leftd=p;
fractn=leftn;
fractd=p*m*n;
System.out.print(fractn/gcd(fractn,fractd)+"/"+fractd/gcd(fractn,fractd));
}
}
}