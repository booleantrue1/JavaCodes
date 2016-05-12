import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0,i=0,p=0,t=0,k=0,n=0,r=0;
String s;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(z.nextToken());
t+=d[i];
}
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
n=(p>k)?k:p;
r=(p>k)?p:k;
for(i=n-1;i<r-1;i++)
j+=d[i];
if(j<t-j)
System.out.print(j);
else
System.out.print(t-j);
}
}