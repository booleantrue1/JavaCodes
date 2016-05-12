import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,m=0,u=0,j=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
int d[]=new int[m];
long h[]=new long[n];
int e[]=new int[m];
int f[]=new int[m];
int g[]=new int[m];
for(i=0;i<n;i++)
scanf;
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
e[i]=Integer.parseInt(y.nextToken());
f[i]=Integer.parseInt(y.nextToken());
g[i]=Integer.parseInt(y.nextToken());
}
for(i=0;i<p;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
t=Integer.parseInt(z.nextToken());
u=Integer.parseInt(z.nextToken());
for(j=t-1;j<u;j++)
d[j]++;
}
for(i=0;i<m;i++)
for(j=e[i]-1;j<f[i];j++)
h[j]+=(long)d[i]*g[i];
for(i=0;i<n;i++)
System.out.print(h[i]+" ");
}
}