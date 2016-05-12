import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=0,p=0,u=0,v=0,t=0,q=0,i=0,j=0,n=0,m=0;
String s,r="\0";
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
p=Integer.parseInt(z.nextToken());
q=Integer.parseInt(z.nextToken());
int d[]=new int[n];
int e[]=new int[n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
u=Integer.parseInt(y.nextToken());
v=Integer.parseInt(y.nextToken());
d[i]=u*p+v*q;
e[i]=i+1;
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
for(i=0;i<n;i++)
{
l+=d[i];
if(l>m)
break;
r+=e[i]+" ";
if(l==m)
{
i++;
break;
}
}
System.out.print(i+"\n"+r.trim());
}
}