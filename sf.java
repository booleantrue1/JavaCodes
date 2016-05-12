import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,p=0,i=0;
String r,s="\0",t="\0",u="\0";
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
s=c.nextToken();
t=c.nextToken();
m=s.length();
n=t.length();
if(m<n)
System.out.print(t);
if(m==n)
{
if(s.compareTo(t)<0)
System.out.print(t);
else
System.out.print("1"+t);
}
if(m>n)
{
if(s.compareTo("100000")==0)
System.out.print(100000+Integer.parseInt(t));
else
{
s=String.valueOf(Integer.parseInt(s)+1);
while(true)
{
p=s.length();
for(i=0;i<p;i++)
if(s.charAt(i)=='4'||s.charAt(i)=='7')
u+=s.charAt(i);
u=u.trim();
if(u.compareTo(t)==0)
{
System.out.print(s);
break;
}
else
{
u="\0";
s=String.valueOf(Integer.parseInt(s)+1);
}
}
}
}
}
}