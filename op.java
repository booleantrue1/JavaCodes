import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0,k3=0,p=0,j=0,x=0,k1=0,p1=0,max=0,smax=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(m==1)
{
for(i=0;i<n;i++)
x=Integer.parseInt(b.readLine());
System.out.print("1 1");
System.exit(0);
}
int d[][]=new int[n][m];
int e[]=new int[m+1];
int f[]=new int[m+1];
e[0]=0;
f[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(j=0;j<m;j++)
d[i][j]=Integer.parseInt(z.nextToken());
}
for(i=0;i<n;i++)
e[d[i][0]]++;
if(e[1]<=e[2])
{
max=e[2];
smax=e[1];
k=2;
p=1;
}
for(i=3;i<m+1;i++)
{
if(e[i]>max)
{
smax=max;
max=e[i];
p=k;
k=i;
}
if(e[i]<max&&e[i]>smax)
{
smax=e[i];
p=i;
}
}
if(max>n/2)
{
System.out.print(k+" 1");
System.exit(0);
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(d[i][j]==k)
{
k1++;
break;
}
if(d[i][j]==p)
{
p1++;
break;
}
}
}
k3=(k1>p1)?k:p;
System.out.print(k3+" 2");
}
}