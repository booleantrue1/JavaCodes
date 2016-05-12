import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,j=0,n=0,k=0,l=0,m=0,u=0,v=0,i=0;
String s[];
n=Integer.parseInt(b.readLine());
s=new String[n];
for(i=0;i<n;i++)
{
s[i]=b.readLine();
StringTokenizer c=new StringTokenizer(s[i]);
k=Integer.parseInt(c.nextToken());
l=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
if(k==1)
{
j+=l;
t+=m;
}
else
{
u+=l;
v+=m;
}
}
if(j>=t)
System.out.println("LIVE");
else
System.out.println("DEAD");
if(u>=v)
System.out.println("LIVE");
else
System.out.println("DEAD");
}
}