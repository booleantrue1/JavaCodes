import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long x=0,n=0,p=0,i=0;
String m,r;
StringTokenizer c=new StringTokenizer(b.readLine());
m=(c.nextToken());
x=Long.parseLong(m);
n=Long.parseLong(c.nextToken());
if(m.indexOf('0')<0&&m.indexOf('1')<0&&m.indexOf('2')<0&&m.indexOf('3')<0&&m.indexOf('4')<0&&m.indexOf('5')<0&&m.indexOf('6')<0&&m.indexOf('7')<0&&m.indexOf('8')<0)
{
System.out.print(m);
System.exit(0);
}
else
{
p=m.length();
for(i=p;i>0;i--)
{
if(x-x%(long)Math.pow(10,i)-1!=-1&&x-x%(long)Math.pow(10,i)-1+n>=x)
{
r=String.valueOf(x-x%(long)Math.pow(10,i)-1);
if(m.indexOf(r)<0)
System.out.print(x-x%(long)Math.pow(10,i)-1);
else
System.out.print(x);
System.exit(0);
}
}
System.out.print(x);
}
}
}