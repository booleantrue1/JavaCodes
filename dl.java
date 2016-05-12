import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,h=101,n=0,m=0;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[0]=Integer.parseInt(z.nextToken());
n=d[0];
for(j=1;j<m;j++)
{
d[j]=Integer.parseInt(z.nextToken());
if(d[j]<n)
{
h=n;
n=d[j];
}
if(d[j]>n&&d[j]<h)
h=d[j];
}
if(h==101)
System.out.print("NO");
else
System.out.print(h);
}
}