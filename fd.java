import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,m=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
int d[]=new int[m];
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m-1;i++)
for(j=i+1;j<m;j++)
if(Math.abs(d[j]-d[i])<=n)
k++;
System.out.print(2*k);
}
}