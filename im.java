import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,m=0,k=0;
long v=0,u=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[n];
int e[]=new int[k];
e[0]=0;
String f[]=new String[k];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<k;i++)
f[i]=b.readLine();
Arrays.sort(d);
for(i=0;i<k;i++)
{
if(f[i].compareTo("#")==0)
continue;
else
{
e[m]++;
for(j=i+1;j<k;j++)
if(f[j].compareTo(f[i])==0)
{
e[m]++;
f[j]="#";
}
f[i]="#";
}
m++;
}
int g[]=new int[m];
for(i=0;i<m;i++)
g[i]=e[i];
Arrays.sort(g);
for(i=0;i<m;i++)
u+=g[m-1-i]*d[i];
for(i=0;i<m;i++)
v+=g[m-1-i]*d[n-1-i];
System.out.print(u+" "+v);
}
}