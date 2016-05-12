import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l1=0,r1=0,incr=0,l=0,r=0,i=0,n=0,m=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[n];
long h[]=new long[n];
long p[]=new long[n];
int e[]=new int[m];
String g[]=new String[m];
int f[]=new int[m];
e[0]=0;
f[0]=0;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m;i++)
{
g[i]=b.readLine();
}
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
l1=Integer.parseInt(x.nextToken());
r1=Integer.parseInt(x.nextToken());
e[l1-1]++;
if(r1<m)
e[r1]--;
}
f[0]=e[0];
for(i=1;i<m;i++)
f[i]=e[i]+f[i-1];
for(i=0;i<m;i++)
{
StringTokenizer y=new StringTokenizer(g[i]);
l=Integer.parseInt(y.nextToken());
r=Integer.parseInt(y.nextToken());
incr=Integer.parseInt(y.nextToken());
h[l-1]+=(long)f[i]*incr;
if(r<n)
h[r]-=(long)f[i]*incr;
}
p[0]=h[0];
for(i=1;i<n;i++)
p[i]=p[i-1]+h[i];
for(i=0;i<n;i++)
System.out.print((p[i]+d[i])+" ");
}
}