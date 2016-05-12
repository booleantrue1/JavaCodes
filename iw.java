import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,m=0,n=0,a=0,i=0;
String s;
n=Integer.parseInt(b.readLine());
int d[];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d=new int[n];
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
p=0;
m=n-1;
a=(int)Math.abs(d[0]-d[n-1]);
for(i=0;i<n-1;i++)
{
if((int)(Math.abs(d[i]-d[i+1]))<a)
{
a=(int)(Math.abs(d[i]-d[i+1]));
m=i;
p=i+1;
}
}
System.out.print(m+1+" "+(p+1));
}
}