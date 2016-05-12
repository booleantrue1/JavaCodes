import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,j=0,k=0,n=0,l=0;
long u=0,v=0;
String s;
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
m=Integer.parseInt(y.nextToken());
n=Integer.parseInt(y.nextToken());
int d[][]=new int[1000][1000];
int e[][]=new int[1000][1000];
int f[]=new int[1000];
int g[]=new int[1000];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
k=Integer.parseInt(z.nextToken());
l=Integer.parseInt(z.nextToken());
d[l-1][k-1]++;
f[l-1]++;
}
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
k=Integer.parseInt(x.nextToken());
l=Integer.parseInt(x.nextToken());
e[l-1][k-1]++;
g[l-1]++;
}
for(i=0;i<1000;i++)
{
u+=(long)Math.min(g[i],f[i]);
for(j=0;j<1000;j++)
v+=(long)Math.min(d[i][j],e[i][j]);
}
System.out.print(u+" "+v);
}
}