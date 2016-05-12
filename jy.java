import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
int l=0,m=0,k=0,t=0,p=0,p2=0,a=0,b=0,x=0,y=0,a2=0,b2=0,x2=0,y2=0,f=0,i=0;
m=Integer.parseInt(z.readLine());
String s;
s=z.readLine();
StringTokenizer c=new StringTokenizer(s);
a=Integer.parseInt(c.nextToken());
b=Integer.parseInt(c.nextToken());
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
p=(int)Math.abs((x-a)*(y-b));
a2=a;
b2=b;
x2=x;
y2=y;
for(i=0;i<m-1;i++)
{
a=a2;
b=b2;
x=x2;
y=y2;
s=z.readLine();
StringTokenizer d=new StringTokenizer(s);
a2=Integer.parseInt(d.nextToken());
b2=Integer.parseInt(d.nextToken());
x2=Integer.parseInt(d.nextToken());
y2=Integer.parseInt(d.nextToken());
if(a2>a)
l=x-a2;
else
l=x2-a;
if(b2>b)
k=y-b2;
else
k=y2-b;
p2=(int)Math.abs(l*k);
if(p2<(double)p/2)
{
f=1;
t=i+1;
}
}
if(f==1)
System.out.print(t);
else
System.out.print(m);
}
}