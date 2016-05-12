import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,p=0,m=0,n=0,j=0,i=0;
double x=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
int d[]=new int[n];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(d[i]<d[j])
{
t=d[j];
d[j]=d[i];
d[i]=t;
}
}
}
for(i=0;i<n;i++)
x+=Math.abs(d[i]-(i+1));
System.out.print((long)x);
}
}