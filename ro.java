import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int v=0,l=0,n=0,k=0,p=0,j=0,m=0,t=1,i=0;
String s,r;
p=Integer.parseInt(b.readLine());
int d[];
d=new int[p];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<p;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<p;i++)
{
m=d[i];
n=d[i];
for(j=i-1;j>=0&&k==0;j--)
{
if(d[j]<=m)
{
t++;
m=d[j];
}
else
k=1;
}
for(j=i+1;j<p&&l==0;j++)
{
if(d[j]<=n)
{
t++;
n=d[j];
}
else
l=1;
}
if(t>v)
v=t;
k=0;
l=0;
t=1;
}
System.out.print(v);
}
}