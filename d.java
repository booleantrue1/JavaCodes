import java.io.*;
import java.util.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,p=0,g=0,i=0,l=0;
int d[]=new int[2];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[0]=Integer.parseInt(c.nextToken());
d[1]=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
while(n!=0)
{
p=d[m%2];
g=(p<n)?p:n;
for(i=1;i<=g;i++)
{
if(p%i==0&&n%i==0)
l=i;
}
n=n-l;
m++;
}
System.out.print(Math.abs(m%2-1));
}
}