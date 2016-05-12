import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,t=0,j=0,n=0,m=0;
String s,r="\0";
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(n>m)
{
System.out.print("-1");
System.exit(0);
}
else
{
if(n==1)
{
if(m==1)
{
System.out.print("a");
System.exit(0);
}
else
{
System.out.print("-1");
System.exit(0);
}
}
if(n==2)
{
for(i=1;i<=m;i++)
{
if(i%2==1)
System.out.print("a");
else
System.out.print("b");
}
}
if(n>2)
{
for(i=1;i<=n-2;i++)
r+=(char)(i+98);
r=r.trim();
if(m==n)
{
for(i=1;i<=m;i++)
System.out.print((char)(i+96));
System.exit(0);
}
if(m-n==1)
{
System.out.print("aba");
for(i=1;i<=m-3;i++)
System.out.print((char)(i+98));
System.exit(0);
}
if(m-n>=2)
{
for(i=1;i<=m-(n-2);i++)
{
if(i%2==1)
System.out.print("a");
else
System.out.print("b");
}
System.out.print(r);
}
}
}
}
}