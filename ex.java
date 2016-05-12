import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,k=0,p=0,n=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
String s;
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
t+=n;
if(Math.abs(t-k)<=500)
System.out.print("A");
else
{
t-=n;
k+=p;
System.out.print("G");
}
}
}
}