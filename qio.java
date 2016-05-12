import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
StringTokenizer z=new StringTokenizer(b.readLine());
int d[]=new int[m];
int e[]=new int[n];
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
StringTokenizer y=new StringTokenizer(b.readLine());
for(i=0;i<n;i++)
e[i]=Integer.parseInt(y.nextToken());
Arrays.sort(d);
Arrays.sort(e);
if(2*d[0]<=d[m-1])
t=d[m-1];
else
t=2*d[0];
if(t<e[0])
System.out.print(t);
else
System.out.print("-1");
}
}