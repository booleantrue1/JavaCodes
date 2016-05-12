import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0,j=0,t=0,max=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
int e[]=new int[n];
int f[]=new int[n];
f[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Integer.parseInt(c.nextToken());
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(d[j]<d[i])
{
t=d[j];
d[j]=d[i];
d[i]=t;
t=e[j];
e[j]=e[i];
e[i]=t;
}
}
}
max=e[0];
for(i=1;i<n;i++)
{
if(e[i]<max)
k++;
if(e[i]>max)
max=e[i];
}
System.out.print(k);
}
}