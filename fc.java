import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,k=0,n=0,t=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[1001];
d[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<t;i++)
d[Integer.parseInt(c.nextToken())]++;
for(i=0;i<1001;i++)
if(d[i]>n)
n=d[i];
if(t%2==0)
{
if(n<=t/2)
System.out.print("YES");
else
System.out.print("NO");
}
else
{
if(n<=(t+1)/2)
System.out.print("YES");
else
System.out.print("NO");
}
}
}