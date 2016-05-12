import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,n=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
n=Integer.parseInt(b.readLine());
String d[]=new String[m];
for(i=0;i<m;i++)
d[i]=b.readLine();
for(i=0;i<m;i++)
{
StringTokenizer c=new StringTokenizer(d[i]);
j=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
if(j==n||k==n||j==7-n||k==7-n)
{
System.out.print("NO");
System.exit(0);
}
}
System.out.print("YES");
}
}