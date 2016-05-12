import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,y=0,z=0,g=0,p=0,t=0,j=0,k=0,n=0,i=0;
int d[];
double e[];
String s,r;
r=b.readLine();
StringTokenizer x=new StringTokenizer(r);
n=Integer.parseInt(x.nextToken());
k=Integer.parseInt(x.nextToken());
d=new int[n];
e=new double[n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[i]=Integer.parseInt(c.nextToken());
e[i]=Double.parseDouble(c.nextToken());
}
for(j=1;j<=k;j++)
{
for(i=0;i<n;i++)
{
if(d[i]>j)
{
p=i;
for(y=p;y<n;y++)
{
if(d[y]>j)
f++;
if(d[y]==j)
g++;
}
}
if(f!=0||g!=0)
break;
}
if(f>g)
t+=g;
else
t+=f;
for(z=p;z<n;z++)
{
if(d[z]==j)
d[z]=0;
}
f=0;
g=0;
}
System.out.print(t);
}
}
