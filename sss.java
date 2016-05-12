import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,r=0,t=0,n=0;
String p;
int d[];
int e[];
p=b.readLine();
StringTokenizer c=new StringTokenizer(p);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
r=(int)Math.sqrt(n);
d=new int[r+1];
e=new int[r+1];
for(i=0;i<=r;i++)
{
d[i]=i;
e[i]=n-i*i;
}
for(i=0;i<=r;i++)
if((m-(e[i])*(e[i]))==d[i])
t++;
System.out.print(t);
}
}