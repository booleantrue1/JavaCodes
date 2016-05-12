import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,j=0,t=1001,i=0,n=0;
n=Integer.parseInt(b.readLine());
String s[]=new String[n];
int d[]=new int[n];
int e[]=new int[n];
int f[]=new int[n];
int g[]=new int[n];
for(i=0;i<n;i++)
{
s[i]=b.readLine();
StringTokenizer c=new StringTokenizer(s[i]);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
f[i]=Integer.parseInt(c.nextToken());
g[i]=Integer.parseInt(c.nextToken());
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(d[j]<d[i]&&e[j]<e[i]&&f[j]<f[i])
d[j]=0;
}
}
for(i=0;i<n;i++)
{
if(d[i]==0)
continue;
else
{
if(g[i]<t)
{
t=g[i];
p=i;
}
}
}
System.out.print(p+1);
}
}