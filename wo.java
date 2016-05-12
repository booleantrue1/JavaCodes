import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0,x=0,t=0,a=0,l=0,m=0,b=0,d=0,e=0;
String s;
s=obj.readLine();
StringTokenizer c=new StringTokenizer(s);
x=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
a=Integer.parseInt(c.nextToken());
b=Integer.parseInt(c.nextToken());
d=Integer.parseInt(c.nextToken());
e=Integer.parseInt(c.nextToken());
if(x==0)
System.out.print("YES");
else
{
for(i=0;i<t;i++)
{
for(j=0;j<t;j++)
{
if(x==((a-i*d)+(b-j*e)))
{
k=1;
break;
}
}
if(k==1)
break;
}
for(i=0;i<t;i++)
{
if(x==(a-i*d))
{
l=1;
break;
}
}
for(i=0;i<t;i++)
{
if(x==(b-i*e))
{
m=1;
break;
}
}
if(k==1||l==1||m==1)
System.out.print("YES");
else
System.out.print("NO");
}
}
}