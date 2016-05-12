import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,t=0,i=0,m=0,j=0,n=0;
String s,q;
int d[];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
d=new int[m];
q=b.readLine();
StringTokenizer z=new StringTokenizer(q);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(j=0;j<m-1;j++)
{
for(i=j+1;i<m;i++)
{
if(d[j]>d[i])
{
f=d[i];
d[i]=d[j];
d[j]=f;
}
}
}
for(i=0;i<n&&d[i]<0;i++)
t+=(int)Math.abs(d[i]);
System.out.print(t);
}
}