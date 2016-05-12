import java.io.*;
import java.util.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long double t=1,h=0,u=0,f=0,m=0,n=0,i=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Double.parseDouble(c.nextToken());
n=Double.parseDouble(c.nextToken());
p=Double.parseDouble(c.nextToken());
h=Double.parseDouble(c.nextToken());
for(i=0;i<p;i++)
{
t=t*m+n;
System.out.println(t);
}
if(h>=t)
{
f=1;
System.out.print("0");
}
else
{
while(h<t)
{
h=h*m+n;
u++;
}
}
if(f==0)
System.out.print(u);
}
}