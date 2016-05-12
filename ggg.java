import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int i=0,x=0,y=0,t=0,n=0;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
x=d[0];
y=d[0];
for(i=0;i<n;i++)
{
if(d[i]>x)
{
x=d[i];
t++;
}
if(d[i]<y)
{
y=d[i];
t++;
}
}
System.out.print(t);
}
}