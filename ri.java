import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,v=0,n=0,i=0;
String s,r;
int d[];
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
d=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m-1;i++)
{
if(d[i]>=d[i+1])
{
v=(d[i]-d[i+1])/n+1;
k+=(d[i]-d[i+1])/n+1;
d[i+1]+=v*n;
}
else
continue;
}
System.out.print(k);
}
}