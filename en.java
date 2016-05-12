import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x1=0,x2=1,y1=0,y2=0,x=0,y=0,n=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
if(x>=Math.min(x1,x2)&&x<=Math.max(x1,x2)&&y>=Math.min(y1,y2)&&y<=Math.max(y1,y2))
{
System.out.print("0");
System.exit(0);
}
else
{
for(i=0;;i++)
{
if(i%4==0)
{
x1=x2;
y1=y2;
y2=(-1)*y2+1;
n++;
}
if(i%4==1)
{
x1=x2;
y1=y2;
x2=(-1)*x2;
n++;
}
if(i%4==2)
{
x1=x2;
y1=y2;
y2=(-1)*y2;
n++;
}
if(i%4==3)
{
x1=x2;
y1=y2;
x2=(-1)*x2+1;
n++;
}
if(x>=Math.min(x1,x2)&&x<=Math.max(x1,x2)&&y>=Math.min(y1,y2)&&y<=Math.max(y1,y2))
{
System.out.print(n);
System.exit(0);
}
}
}
}
}