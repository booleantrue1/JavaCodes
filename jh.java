import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,c=0,m=0,i=0;
String s;
s=b.readLine();
StringTokenizer c1=new StringTokenizer(s);
n=Integer.parseInt(c1.nextToken());
m=Integer.parseInt(c1.nextToken());
c=Integer.parseInt(c1.nextToken());
int d[]=new int[n];
int e[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
e[0]=Integer.parseInt(y.nextToken());
for(i=1;i<m;i++)
e[i]=e[i-1]+Integer.parseInt(y.nextToken());
for(i=0;i<m;i++)
{
if(i-n+m-1<0)
System.out.print((d[i]+e[i])%c+" ");
else
System.out.print((d[i]+e[i]-e[i-n+m-1])%c+" ");
}
for(i=m;i<n;i++)
{
if(m-1-n+i<0)
System.out.print((d[i]+e[m-1])%c+" ");
else
System.out.print((d[i]+e[m-1]-e[m-1-n+i])%c+" ");
}
}
}
