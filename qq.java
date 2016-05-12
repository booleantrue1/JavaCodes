import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d[];
int e[];
int i=0,j=0,n=0,p=0,k=0,w=0,t=0,u=0,z=0;
String s;
String r[];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
r=new String[n];
d=new int[n];
e=new int[n];
for(i=0;i<n;i++)
r[i]=b.readLine();
for(i=0;i<n;i++)
{
StringTokenizer f=new StringTokenizer(r[i]);
d[i]=Integer.parseInt(f.nextToken());
e[i]=Integer.parseInt(f.nextToken());
}
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(d[j]<d[i])
{
w=d[j];
d[j]=d[i];
d[i]=w;
w=e[j];
e[j]=e[i];
e[i]=w;
}
if((d[j]==d[i])&&(e[j]>e[i]))
{
w=d[j];
d[j]=d[i];
d[i]=w;
w=e[j];
e[j]=e[i];
e[i]=w;
}
}
}
t=d[k-1];
u=e[k-1];
for(i=0;i<n;i++)
{
if(d[i]==t&&e[i]==u)
z++;
}
System.out.print(z);
}
}