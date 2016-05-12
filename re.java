import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,j=0,k=0,n=0,i=0;
int d[];
String s,r;
r=b.readLine();
s=b.readLine();
StringTokenizer e=new StringTokenizer(r);
n=Integer.parseInt(e.nextToken());
k=Integer.parseInt(e.nextToken());
d=new int[n];
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(d[i]>d[j])
{
t=d[j];
d[j]=d[i];
d[i]=t;
}
}
}
t=n-k;
if(t>=0)
System.out.print(d[t]+" "+d[t]);
else
System.out.print("-1");
}
}