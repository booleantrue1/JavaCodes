import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,j=0,t=0,i=0;
String s,r;
long n=0;
p=Integer.parseInt(b.readLine());
int d[];
d=new int[p];
int e[]=new int[5];
long g[]=new long[5];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<p;i++)
d[i]=Integer.parseInt(c.nextToken());
r=b.readLine();
StringTokenizer z=new StringTokenizer(r);
for(i=0;i<5;i++)
e[i]=Integer.parseInt(z.nextToken());
for(j=0;j<4;j++)
{
for(i=j+1;i<5;i++)
{
if(e[j]<e[i])
{
t=e[j];
e[j]=e[i];
e[i]=t;
}
}
}
for(i=0;i<p;i++)
{
n+=d[i];
for(j=0;j<5;j++)
{
for(;n>=e[j];)
{
g[j]+=n/e[j];
n=n%e[j];
}
}
}
for(i=4;i>=0;i--)
System.out.print(g[i]+" ");
System.out.print("\n"+n);
}
}