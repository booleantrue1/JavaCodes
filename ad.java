import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double i=0,j=0,x=0,t=0,k=0,n=0,m=0,p=0;
int l=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Double.parseDouble(c.nextToken());
n=Double.parseDouble(c.nextToken());
if(m==1)
System.out.print("1");
else
{
for(i=0;;i++)
{
p=Math.pow(n,i);
if(p>=m)
{
k=i-1;
break;
}
}
t=((long)m/(long)(Math.pow(n,k)))*((long)(Math.pow(n,k)));
for(i=1;i<=m;i++)
{
for(j=0;j<=k;j++)
{
x+=(long)(i/(Math.pow(n,j)));
if(x>=m)
{
l=1;
System.out.print((long)i);
break;
}
}
x=0;
if(l==1)
break;
}
}
}
}