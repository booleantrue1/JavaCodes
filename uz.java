import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(b.readLine()),i=0,u=0,t=0,j=0,v=0;
long k=0;
String s="\0",r="\0";
int d[];
for(i=0;i<n;i++)
{
u=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d=new int[u];
for(v=0;v<u;v++)
d[v]=Integer.parseInt(c.nextToken());
for(v=0;v<u-1;v++)
{
for(j=v+1;j<u;j++)
{
if(d[j]<d[v])
{
t=d[v];
d[v]=d[j];
d[j]=t;
k++;
}
}
}
System.out.println(k);
k=0;
}
}
}