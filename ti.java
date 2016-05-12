import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,m=0,i=0,k=0,n=0;
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
k+=d[i];
}
for(i=1;i<=5;i++)
{
if((k+i)%(n+1)!=1)
p++;
}
System.out.print(p);
}
}