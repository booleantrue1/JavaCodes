import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int u=0,v=0,w=0,n=0,hcf=0,m=0,x=0,p=0,k=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
k=Integer.parseInt(z.nextToken());
for(i=1;i<=m;i++)
x=Integer.parseInt(z.nextToken());
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
p=Integer.parseInt(y.nextToken());
for(i=1;i<=n;i++)
x=Integer.parseInt(y.nextToken());
if(m<n)
{
System.out.print("0/1");
System.exit(0);
}
if(m>n)
{
if(k*p>0)
System.out.print("Infinity");
else
System.out.print("-Infinity");
System.exit(0);
}
u=(int)Math.abs(k);
v=(int)Math.abs(p);
w=(u<v)?u:v;
for(i=w;i>0;i--)
if(u%i==0&&v%i==0)
break;
hcf=i;
u=u/hcf;
v=v/hcf;
if(p*k>0)
System.out.print(u+"/"+v);
else
System.out.print("-"+u+"/"+v);
}
}