import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=0,j=0,t=0;
long k=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[m];
int e[]=new int[m];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[i]=Integer.parseInt(z.nextToken());
e[i]=Integer.parseInt(z.nextToken());
}
for(i=0;i<m-1;i++)
{
for(j=i+1;j<m;j++)
{
if(e[j]>e[i])
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
for(i=0;i<m;i++)
{
k+=(long)d[i];
if(k>n)
{
k-=(long)d[i];
p+=(long)(n-k)*e[i];
break;
}
p+=(long)d[i]*e[i];
}
System.out.print(p);
}
}