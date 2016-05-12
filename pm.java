import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,t=0,j=0,n=0,m=0;
long l=0,p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[m*n];
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(j=0;j<n;j++)
{
d[n*i+j]=Integer.parseInt(z.nextToken());
p+=d[n*i+j];
}
}
for(i=0;i<m*n;i++)
{
for(j=0;j<m*n;j++)
{
if((d[j]-d[i])%k!=0)
{
System.out.print("-1");
System.exit(0);
}
}
}
Arrays.sort(d);
if(m*n%2==1)
{
t=d[(m*n-1)/2];
for(i=0;i<m*n;i++)
l+=(long)Math.abs(d[i]-t);
}
else
{
t=d[m*n/2-1];
for(i=0;i<m*n;i++)
l+=(long)Math.abs(d[i]-t);
}
System.out.print(l/k);
}
}