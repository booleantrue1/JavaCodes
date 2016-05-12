import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,a=0,k=0,t=0,i=0;
n=Integer.parseInt(b.readLine());
String s[];
String r="\0",l="\0";
s=new String[n];
s[0]=b.readLine();
StringTokenizer c=new StringTokenizer(s[0]);
r=c.nextToken();
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
t=100*m-50*k;
t+=Integer.parseInt(c.nextToken());
t+=Integer.parseInt(c.nextToken());
t+=Integer.parseInt(c.nextToken());
t+=Integer.parseInt(c.nextToken());
t+=Integer.parseInt(c.nextToken());
for(i=1;i<n;i++)
{
s[i]=b.readLine();
StringTokenizer d=new StringTokenizer(s[i]);
l=d.nextToken();
m=Integer.parseInt(d.nextToken());
k=Integer.parseInt(d.nextToken());
a=100*m-50*k;
a+=Integer.parseInt(d.nextToken());
a+=Integer.parseInt(d.nextToken());
a+=Integer.parseInt(d.nextToken());
a+=Integer.parseInt(d.nextToken());
a+=Integer.parseInt(d.nextToken());
if(a>t)
{
t=a;
r=l;
}
}
System.out.print(r);
}
}