import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,t=0,j=0,n=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[n];
s=b.readLine();
StringTokenizer e=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(e.nextToken());
for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(d[j]-d[i]>0&&d[j]-d[i]>t)
t=d[j]-d[i];
System.out.print(t+k);
}
}