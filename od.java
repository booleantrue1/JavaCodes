import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0,n=0,j=0,k=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
int d[]=new int[n];
if(t!=0)
{
d[0]=1;
d[1]=2;
t--;
for(j=0;j<t;j++)
{
for(i=0;i<2+j;i++)
k+=d[i];
d[2+j]=k+1;
k=0;
}
t++;
for(i=t+1;i<t+p+1;i++)
d[i]=d[i-1]+1;
for(i=0;i<n;i++)
if(d[i]!=0)
System.out.print(d[i]+" ");
for(i=0;i<n-(p+t+1);i++)
System.out.print("1 ");
}
else
{
if(n==p+1)
{
if(p!=0)
System.out.print("-1");
else
System.out.print("1");
}
else
{
System.out.print("1 1 ");
for(i=0;i<p;i++)
System.out.print(2+i+" ");
for(i=0;i<n-(p+2);i++)
System.out.print("1 ");
}
}
}
}