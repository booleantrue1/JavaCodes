import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,k=0,n=0,i=0;
int d[];
String s,r;
n=Integer.parseInt(b.readLine());
d=new int[n+1];
d[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=1;i<=n;i++)
{
k=Integer.parseInt(c.nextToken());
if(k<=n)
d[k]=1;
}
for(i=1;i<n+1;i++)
if(d[i]==0)
f++;
System.out.print(f);
}
}