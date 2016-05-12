import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p1=0,x=0,t1=0,min=100000000,min1=100000000,i=0,t=0,u=0,v=0,p=0,m=0,l=0,k=0;
String s;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
int e[]=new int[m];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
d[i]=Integer.parseInt(y.nextToken());
e[i]=Integer.parseInt(y.nextToken());
l+=e[i];
if(d[i]==1)
p++;
}
int f[]=new int[p+1];
int g[]=new int[p+1];
int h[]=new int[m-p+1];
int j[]=new int[m-p+1];
for(i=0;i<m;i++)
{
if(d[i]==1)
{
f[k]=d[i];
g[k]=e[i];
k++;
}
if(d[i]==2)
{
h[t]=d[i];
j[t]=e[i];
t++;
}
}
f[p]=0;
g[p]=0;
h[m-p]=0;
j[m-p]=0;
for(i=0;i<p;i++)
{
for(k=i+1;k<p+1;k++)
{
if(g[k]>g[i])
{
t=g[k];
g[k]=g[i];
g[i]=t;
}
}
}
for(i=0;i<m-p;i++)
{
for(k=i+1;k<m-p+1;k++)
{
if(j[k]>j[i])
{
t=j[k];
j[k]=j[i];
j[i]=t;
}
}
}
p1=0;
t1=0;
u=0;
v=0;
for(i=0;i<p+1;i++)
{
p1+=f[i];
u+=g[i];
for(k=0;k<m-p+1;k++)
{
t1+=h[k];
v+=j[k];
if(l-v-u<=p1+t1)
{x=1;break;}
}
if(p1+t1<min&&p1+t1!=0&&x==1)
min=p1+t1;
t1=0;
v=0;
x=0;
}
p1=0;
t1=0;
u=0;
v=0;
x=0;
for(i=p;i>=0;i--)
{
p1+=f[i];
u+=g[i];
for(k=m-p;k>=0;k--)
{
t1+=h[k];
v+=j[k];
if(l-v-u<=p1+t1)
{x=1;break;}
}
if(p1+t1<min1&&p1+t1!=0&&x==1)
min1=p1+t1;
t1=0;
v=0;
x=0;
}
System.out.print((long)Math.min(min,min1));
}
}