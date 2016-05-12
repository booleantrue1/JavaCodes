import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,i=0,m=0,j=0,max=0,d=0,p=0;
double t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
for(i=0;i<=4000;i++)
{
for(j=0;j<=4000;j++)
{
t=((double)(n-m*i-k*j))/p;
if(t==(int)t&&t>=0)
d=(int)t+i+j;
if(d>max)
max=d;
}
}
System.out.print(max);
}
}