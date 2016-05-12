import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0,j=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
int d[]=new int[p];
int e[]=new int[p];
int f[]=new int[p];
int g[]=new int[p];
d[0]=0;
for(i=0;i<p;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
e[i]=Integer.parseInt(z.nextToken());
f[i]=Integer.parseInt(z.nextToken())+e[i]-1;
}
for(i=0;i<p;i++)
{
for(j=0;j<p;j++)
{
if(j==i)
continue;
if(e[j]>=e[i]&&e[j]<=f[i]&&f[j]<=f[i]&&f[j]>=e[i])
d[j]=1;
if(e[i]>=e[j]&&e[i]<=f[j]&&f[i]<=f[j]&&f[i]>=e[j])
d[i]=1;
}
}
for(i=0;i<p;i++)
{
if(d[i]==1)
{
g[k]=i+1;
k++;
}
}
System.out.println(k);
for(i=0;i<k;i++)
System.out.print(g[i]+" ");
}
}