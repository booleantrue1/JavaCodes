import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d=0,e=0,f=0,g=0,p=0,q=0,r=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p=Integer.parseInt(c.nextToken());
q=Integer.parseInt(c.nextToken());
r=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
u=Integer.parseInt(c.nextToken());
v=Integer.parseInt(c.nextToken());
w=Integer.parseInt(c.nextToken());
x=Integer.parseInt(c.nextToken());
y=q*r;
z=t*u;
w=w*p;
x=x*p;
d=y/w;
e=z/p;
f=v/x;
g=(d<e)?((d<f)?d:f):((e<f)?e:f);
System.out.print(g);
}
}