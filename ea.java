import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int u=0,v=0,i=0,n=0,j=0,k=0,count=0,flag=0;
String s,r;
double p=0;
int d[]=new int[10];
int e[]=new int[10];
for(j=0;j<10;j++)
{
e[j]=0;
d[j]=0;
}
s=b.readLine();
StringTokenizer c1=new StringTokenizer(s);
k=Integer.parseInt(c1.nextToken());
s=String.valueOf(k);
v=s.length();
for(j=0;j<v;j++)
d[Integer.parseInt(s.substring(j,j+1))]++;
p=Math.sqrt(k);
for(i=1;i<=p;i++)
{
if((double)k/i==(k/i))
{
if(k/i==i)
{
r=String.valueOf(i);
u=r.length();
for(j=0;j<u;j++)
e[Integer.parseInt(r.substring(j,j+1))]++;
for(j=0;j<10;j++)
if(d[j]>0&&e[j]>0)
{
flag=1;
break;
}
if(flag==1)
count++;
flag=0;
}
else
{
r=String.valueOf(i);
u=r.length();
for(j=0;j<u;j++)
e[Integer.parseInt(r.substring(j,j+1))]++;
for(j=0;j<10;j++)
if(d[j]>0&&e[j]>0)
{
flag=1;
break;
}
if(flag==1)
count++;
flag=0;
for(j=0;j<10;j++)
e[j]=0;
r=String.valueOf(k/i);
u=r.length();
for(j=0;j<u;j++)
e[Integer.parseInt(r.substring(j,j+1))]++;
for(j=0;j<10;j++)
if(d[j]>0&&e[j]>0)
{
flag=1;
break;
}
if(flag==1)
count++;
flag=0;
}
}
for(j=0;j<10;j++)
e[j]=0;
}
System.out.print(count);
}
}