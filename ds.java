import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,i=0,m=0;
double x=0,l=101,j=0,p=0;
String s,r,t;
int d[];
int e[];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
d=new int[m];
e=new int[m];
r=b.readLine();
StringTokenizer y=new StringTokenizer(r);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(y.nextToken());
k+=d[i];
}
t=b.readLine();
StringTokenizer z=new StringTokenizer(t);
for(i=0;i<m;i++)
{
e[i]=Integer.parseInt(z.nextToken());
p=(double)e[i]/d[i];
if(p<l)
l=p;
}
x=(double)n/k;
j=(x<l)?x:l;
System.out.print(j*k);
}
}