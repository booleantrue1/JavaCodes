import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,m=0,u=0,t=0,k=0,j=0;
String r,s;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
u=2*t/(m+p);
d=(p-m)/(u-5);
a=m-2*d;
System.out.println(u);
for(j=0;j<u;j++)
System.out.print(a+j*d+" ");
System.out.print("\n");
}
}
}