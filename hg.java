import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,j=0,m=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(x.nextToken());
k=n;
for(i=0;i<m-1;i++)
{
for(j=i+1;j<m;j++)
{
p=n%d[i]+d[j]*(n/d[i]);
if(p>k)
k=p;
}
}
System.out.print(k);
}
}