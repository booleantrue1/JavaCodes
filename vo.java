import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l1=0,l2=0,v=0,u=0,p2=0,p1=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
String s;
int d[]=new int[m*(m+1)/2];
int f[]=new int[m*(m+1)/2];
int e[]=new int[m];
e[0]=0;
for(i=0;i<m*(m-1)/2-1;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
f[i]=Integer.parseInt(c.nextToken());
e[d[i]-1]++;
e[f[i]-1]++;
}
for(i=0;i<m;i++)
if(e[i]==m-2)
{
u=i+1;
break;
}
for(i=m-1;i>=0;i--)
if(e[i]==m-2)
{
v=i+1;
break;
}
for(i=0;i<m*(m+1)/2;i++)
{
if(d[i]==u)
p1++;
if(f[i]==u)
l1++;
if(d[i]==v)
p2++;
if(f[i]==v)
l2++;
}
if(p1>p2)
{
System.out.print(u+" "+v);
System.exit(0);
}
if(p1<p2)
{
System.out.print(v+" "+u);
System.exit(0);
}
if(p1==p2)
{
if(l2>=l1)
{
System.out.print(u+" "+v);
System.exit(0);
}
System.out.print(u+" "+v);
System.exit(0);
}
}
}