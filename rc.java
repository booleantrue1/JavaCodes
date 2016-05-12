import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int w=0,u=0,v=0,t=0,n=0,k=0,p=0,j=0,m=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
int d[]=new int[m*n*p+1];
for(i=1;i<=m*n*p;i++)
{
for(j=1;j<=i/2;j++)
{
if(i%j==0)
u++;
}
d[i]=u+1;
u=0;
}
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)
{
for(k=1;k<=p;k++)
{
t=i*j*k;
w+=d[t];
}
}
}
System.out.print(w%1073741824);
}
}