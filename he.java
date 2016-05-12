import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,vb=0,vs=0,x=0,y=0,k=0,n=0;
double v=0,vmin=100000000,p=0,min=100000000;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
vb=Integer.parseInt(c.nextToken());
vs=Integer.parseInt(c.nextToken());
int d[]=new int[n];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
s=b.readLine();
StringTokenizer w=new StringTokenizer(s);
x=Integer.parseInt(w.nextToken());
y=Integer.parseInt(w.nextToken());
for(i=1;i<n;i++)
{
v=Math.sqrt((long)(d[i]-x)*(d[i]-x)+(long)y*y);
p=((double)d[i]/vb)+(v/vs);
if(p<min)
{
min=p;
vmin=v;
k=i;
continue;
}
if(p==min)
{
if(v<vmin)
{
min=p;
vmin=v;
k=i;
}
}
}
System.out.print(k+1);
}
}