import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,n=0,i=0;
String s;
StringTokenizer c=new StringTokenizer(b.readLine());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[k+1];
d[0]=0;
s=b.readLine();
StringTokenizer q=new StringTokenizer(s);
for(i=0;i<n;i++)
d[Integer.parseInt(q.nextToken())]++;
while(d[k]!=n)
{
for(i=k-1;i>=0;i--)
{
if(d[i]!=0)
{
d[i]--;
d[i+1]++;
}
}
m++;
}
System.out.print(m);
}
}