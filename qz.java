import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
String s;
n=Integer.parseInt(b.readLine());
int a[]=new int[n];
int d[]=new int[n];
s=b.readLine();
for(i=0;i<n;i++)
a[i]=Integer.parseInt(s.substring(i,i+1));
Arrays.sort(a);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(s.substring(i+n,i+n+1));
Arrays.sort(d);
if(a[0]>d[0])
{
for(i=0;i<n;i++)
{
if(a[i]<=d[i])
{
System.out.print("NO");
System.exit(0);
}
}
}
if(a[0]<d[0])
{
for(i=0;i<n;i++)
{
if(a[i]>=d[i])
{
System.out.print("NO");
System.exit(0);
}
}
}
if(a[0]==d[0])
{
System.out.print("NO");
System.exit(0);
}
System.out.print("YES");
}
}