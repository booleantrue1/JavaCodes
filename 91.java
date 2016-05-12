import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
double t=0,x=10000000;
String s;
n=Integer.parseInt(b.readLine());
int a[]=new int[n];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
a[0]=Integer.parseInt(z.nextToken());
for(i=1;i<n;i++)
{
a[i]=Integer.parseInt(z.nextToken());
t=Math.max(a[i],a[i-1]);
if(t<x)
x=t;
}
System.out.print((int)(Math.min((Math.min(a[0],a[n-1])),x)));
}
}