import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,f=0,g=0,n=0,m=0,p=0;
String s,u="\0",v="\0";
s=b.readLine();
n=s.length();
String t=new StringBuffer(s).reverse().toString();
u=b.readLine();
m=u.length();
v=b.readLine();
p=u.length();
if(s.indexOf(u)>=0&&s.lastIndexOf(v)>=0&&s.lastIndexOf(v)>=s.indexOf(u)+u.length())
f=1;
if(t.indexOf(u)>=0&&t.lastIndexOf(v)>=0&&t.lastIndexOf(v)>=t.indexOf(u)+u.length())
g=1;
if(f==1&&g==1)
System.out.print("both");
else
{
if(f==1)
System.out.print("forward");
else
{
if(g==1)
System.out.print("backward");
else
System.out.print("fantasy");
}
}
}
}