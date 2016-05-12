import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,k=0,n=0,j=0,i=0;
double r2=0,x=0,m=0,r1=0;
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Double.parseDouble(z.nextToken());
n=Integer.parseInt(z.nextToken());
if(m==1)
{
System.out.print("0");
System.exit(0);
}
else
{
k=n-1;
x+=n;
if(x>=m)
{
System.out.print("1");
System.exit(0);
}
else
{
if(((3-2*n)*(3-2*n)-(8*(m-n)))<0)
{
System.out.print("-1");
System.exit(0);
}
else
{
r2=(((2*n-3)-Math.sqrt((3-2*n)*(3-2*n)-(8*(m-n))))/2);
if(r2<=0)
{if(r2<=n-1){System.out.print(1);
System.exit(0);}
else
{
System.out.print("-1");
System.exit(0);}}
else
{r1=(((2*n-3)+Math.sqrt((3-2*n)*(3-2*n)-(8*(m-n))))/2);
r2=Math.ceil(r2);
if(r2<n-1&&r2<=r1){System.out.print((long)r2+1);
System.exit(0);}
else
{
System.out.print("-1");
System.exit(0);}}
}
}
}
}
}