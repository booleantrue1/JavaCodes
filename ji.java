import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,m=0,k=0;
long d[];
long t=1000000002;
String s;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
d=new long[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(j=0;j<m;j++)
d[j]=Long.parseLong(z.nextToken());
Arrays.sort(d);
for(j=0;j<=m-k;j++)
{
if(d[j+k-1]-d[j]<t)
t=d[j+k-1]-d[j];
}
System.out.print(t);
t=1000000002;
}
}
}