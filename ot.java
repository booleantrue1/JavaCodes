import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,n=0,i=0,j=0;
double k=0,t=0,p=0;
String s;
double d[];
n=Integer.parseInt(b.readLine());
d=new double[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[0]=Double.parseDouble(c.nextToken());
for(i=1;i<n;i++)
{
d[i]=Double.parseDouble(c.nextToken());
if(d[j]>d[i])
{
k=d[j]-d[i];
if(k>t)
{
t=k;
}
}
else
{
x=1;
j=i;
p+=t;
k=0;
t=0;
}
}
if(x==1)
System.out.print((long)(t+p));
else
System.out.print((long)t);
}
}