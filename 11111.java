import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,p=0,m=0,n=0,k=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
int d[]=new int[n+1];
d[0]=0;
t=k;
for(i=1;i<=n;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;;i++)
{
if(k==p)
{
System.out.print(i);
System.exit(0);}
t=d[k];
if(d[k]==0)
{System.out.print("-1");System.exit(0);}
d[k]=0;
k=t;
}
}
}