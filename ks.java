import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,l=0,v=0,n=0,u=0,m=0,i=0;
String s;
for(;;)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Integer.parseInt(z.nextToken());
n=Integer.parseInt(z.nextToken());
if(m==-1&&n==-1)
System.exit(0);
else
{
u=(m<n)?m:n;
v=(m<n)?n:m;
k=(v/(u+1));
l=(v%(u+1));
if(l==0)
System.out.println(k);
else
System.out.println(k+1);
}
}
}
}