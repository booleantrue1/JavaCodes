import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int u=0,v=0,w=0,x=0,y=0,z=0;
float m=0,n=0;
String r,s,t;
r=b.readLine();
s=b.readLine();
t=b.readLine();
StringTokenizer c=new StringTokenizer(r);
u=Integer.parseInt(c.nextToken());
v=Integer.parseInt(c.nextToken());
StringTokenizer d=new StringTokenizer(s);
w=Integer.parseInt(d.nextToken());
x=Integer.parseInt(d.nextToken());
StringTokenizer e=new StringTokenizer(t);
y=Integer.parseInt(e.nextToken());
z=Integer.parseInt(e.nextToken());
if(u!=w&&y!=w)
{
m=(x-v)/(w-u);
n=(z-x)/(y-w);
if(m==n)
System.out.print("TOWARDS");
else
{
if(w>u&&x>=v)
{
if(z>x)
System.out.print("LEFT");
else
System.out.print("RIGHT");
}
if(w<u&&x>=v)
{
if(z>x)
System.out.print("RIGHT");
else
System.out.print("LEFT");
}
if(w<u&&x<v)
{
if(z>x)
System.out.print("RIGHT");
else
System.out.print("LEFT");
}
if(w>u&&x<v)
{
if(z>x)
System.out.print("LEFT");
else
System.out.print("RIGHT");
}
}
}
else
{
if(u==w&&x>v)
{
if(y>w)
System.out.print("RIGHT");
if(y<w)
System.out.print("LEFT");
if(y==w)
System.out.print("TOWARDS");
}
if(u==w&&x<v)
{
if(y>w)
System.out.print("LEFT");
if(y<w)
System.out.print("RIGHT");
if(y==w)
System.out.print("TOWARDS");
}
if(x==v&&u>w)
{
if(x>z)
System.out.print("LEFT");
if(x<z)
System.out.print("RIGHT");
if(x==z)
System.out.print("TOWARDS");
}
if(x==v&&u<w)
{
if(x>z)
System.out.print("RIGHT");
if(x<z)
System.out.print("LEFT");
if(x==z)
System.out.print("TOWARDS");
}
}
}
}
