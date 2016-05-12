import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,n=0,i=0;
long x=0,y=0,p=0,t=0;
String s;
StringTokenizer c=new StringTokenizer(b.readLine());
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
StringTokenizer z=new StringTokenizer(b.readLine());
x=Long.parseLong(z.nextToken());
y=Long.parseLong(z.nextToken());
k=Integer.parseInt(b.readLine());
int d[]=new int[k];
int e[]=new int[k];
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer q=new StringTokenizer(s);
d[i]=Integer.parseInt(q.nextToken());
e[i]=Integer.parseInt(q.nextToken());
}
for(i=0;i<k;i++)
{
if(d[i]>0&&e[i]>0)
{
p=(long)Math.min((double)(m-x)/d[i],(double)(n-y)/e[i]);
t+=p;
x=x+p*d[i];
y=y+p*e[i];
}
if(d[i]<0&&e[i]>0)
{
p=(long)Math.min((double)(x-1)/Math.abs(d[i]),(double)(n-y)/e[i]);
t+=p;
x=x+p*d[i];
y=y+p*e[i];
}
if(d[i]>0&&e[i]<0)
{
p=(long)Math.min((double)(m-x)/d[i],(double)(y-1)/Math.abs(e[i]));
t+=p;
x=x+p*d[i];
y=y+p*e[i];
}
if(d[i]<0&&e[i]<0)
{
p=(long)Math.min((double)(x-1)/Math.abs(d[i]),(double)(y-1)/Math.abs(e[i]));
t+=p;
x=x+p*d[i];
y=y+p*e[i];
}
if(d[i]==0&&e[i]>0)
{
p=(long)((double)(n-y)/e[i]);
t+=p;
y=y+p*e[i];
}
if(d[i]==0&&e[i]<0)
{
p=(long)((double)(y-1)/Math.abs(e[i]));
t+=p;
y=y+p*e[i];
}
if(d[i]>0&&e[i]==0)
{
p=(long)((double)(m-x)/d[i]);
t+=p;
x=x+p*d[i];
}
if(d[i]<0&&e[i]==0)
{
p=(long)((double)(x-1)/Math.abs(d[i]));
t+=p;
x=x+p*d[i];
}
}
System.out.print(t);
}
}