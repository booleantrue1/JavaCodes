import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,x1=0,x2=0,t=0,y1=0,y2=0,x=0,y=0;
String r,s;
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
t=Integer.parseInt(c.nextToken());
x1=Integer.parseInt(c.nextToken());
y1=Integer.parseInt(c.nextToken());
x2=Integer.parseInt(c.nextToken());
y2=Integer.parseInt(c.nextToken());
s=b.readLine();
if(x2-x1>=0&&y2-y1>=0)
{
x=x2-x1;
y=y2-y1;
for(i=0;i<t;i++)
{
if(s.charAt(i)=='E')
x--;
if(s.charAt(i)=='N')
y--;
if(x<=0&&y<=0)
{
System.out.print(i+1);
System.exit(0);
}
}
}
if(x2-x1>=0&&y2-y1<0)
{
x=x2-x1;
y=y1-y2;
for(i=0;i<t;i++)
{
if(s.charAt(i)=='E')
x--;
if(s.charAt(i)=='S')
y--;
if(x<=0&&y<=0)
{
System.out.print(i+1);
System.exit(0);
}
}
}
if(x2-x1<0&&y2-y1>=0)
{
x=x1-x2;
y=y2-y1;
for(i=0;i<t;i++)
{
if(s.charAt(i)=='W')
x--;
if(s.charAt(i)=='N')
y--;
if(x<=0&&y<=0)
{
System.out.print(i+1);
System.exit(0);
}
}
}
if(x2-x1<0&&y2-y1<0)
{
x=x1-x2;
y=y1-y2;
for(i=0;i<t;i++)
{
if(s.charAt(i)=='W')
x--;
if(s.charAt(i)=='S')
y--;
if(x<=0&&y<=0)
{
System.out.print(i+1);
System.exit(0);
}
}
}
System.out.print("-1");
}
}