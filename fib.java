import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
try
{
long k=0,n=0,m=0,c1=0,b1=1,a1=0,p=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Long.parseLong(c.nextToken());
n=Long.parseLong(c.nextToken());
k=Long.parseLong(c.nextToken());
if(k<=0)
{
if(k>m&&k>n)
System.out.print("-1");
if(k<=m||k<=n)
System.out.print("0");
}
else
{
if(k<=m||k<=n)
System.out.print("0");
else
{
if(m<=0&&n<=0)
{
System.out.print("-1");
System.exit(0);
}
if(m>0&&n>0)
{
while(c1<Math.pow(10,18))
{
c1=a1+b1;
a1=b1;
b1=c1;
t=a1*(long)Math.min(m,n)+b1*(long)Math.max(m,n);
p++;
if(t>=k)
{
System.out.print(p);
System.exit(0);
}
}
System.out.print("-1");
System.exit(0);
}
p+=(long)Math.ceil(((1-Math.min(m,n))/Math.max(m,n))+1);
if(n<=0)
n+=(long)Math.ceil(((1-Math.min(m,n))/Math.max(m,n))+1)*m;
if(m<=0)
m+=(long)Math.ceil(((1-Math.min(m,n))/Math.max(m,n))+1)*n;
while(c1<Math.pow(10,18))
{
c1=a1+b1;
a1=b1;
b1=c1;
t=a1*(long)Math.min(m,n)+b1*(long)Math.max(m,n);
p++;
if(t>=k)
{
System.out.print(p);
System.exit(0);
}
}
System.out.print("-1");
System.exit(0);
}
}
}
catch(Exception e){}
}
}