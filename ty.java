import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int v=0,w=0,j=0,t=0,x=0,g=0,y=0,z=0,i=0,m=0;
double p=0;
int d[];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
z=Integer.parseInt(c.nextToken());
d=new int[x];
d[0]=0;
for(i=1;i<=x;i++)
{
p=(double)x/i;
m=(int)p;
if(p==m)
{
p=(double)y/m;
v=(int)p;
if(p==v)
{
p=(double)z/v;
w=(int)p;
if(p==w)
{
if(w==i)
{
d[j]=m+v+w;
j++;
}
}
}
}
}
g=d[0];
for(i=0;i<j;i++)
if(d[i]<g)
g=d[i];
System.out.print(4*g);
}
}

