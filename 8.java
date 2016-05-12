import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=0,t=0,k=0,f=0,u=0,v=0,p=0,n=0,j=0,m=0,i=0;
String s,r,e="\0",g="\0";
char z[]={'c','k','g'};
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
for(i=0;i<n*m;i++)
g+=(z[i%3]);
System.out.println(g);
for(i=0;i<k;i++)
{
r=b.readLine();
StringTokenizer y=new StringTokenizer(r);
u=Integer.parseInt(y.nextToken());
v=Integer.parseInt(y.nextToken());
g=(g.substring(0,m*(u-1)+v))+"w"+(g.substring(m*(u-1)+v));
System.out.println(g);
}
System.out.println(g);
for(i=0;i<t;i++)
{
r=b.readLine();
StringTokenizer q=new StringTokenizer(r);
l=Integer.parseInt(q.nextToken());
p=Integer.parseInt(q.nextToken());
if(g.charAt(m*(l-1)+p)=='w')
e+=("Waste\n");
if(g.charAt(m*(l-1)+p)=='c')
e+=("Carrots\n");
if(g.charAt(m*(l-1)+p)=='k')
e+=("Kiwis\n");
if(g.charAt(m*(l-1)+p)=='g')
e+=("Grapes\n");
}
System.out.print(e.trim());
}
}