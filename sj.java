import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,g=0,h=0,j=0,i=0,p=0,t=0,k=0,n=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
i=(m<n)?((m<p)?m:p):((n<p)?n:p);
h=(m>n)?((m>p)?m:p):((n>p)?n:p);
if(i==m&&h==n)
g=p;
if(i==n&&h==m)
g=p;
if(i==m&&h==p)
g=n;
if(i==p&&h==m)
g=n;
if(i==n&&h==p)
g=m;
if(i==p&&h==n)
g=m;
t=k/i;
j=k%i;
for(;j%g!=0&&j%h!=0;)
{
j+=i;
t--;
}
if(j%g==0&&g!=h)
t+=j/g;
if(j%h==0)
t+=j/h;
System.out.print(t);
}
}