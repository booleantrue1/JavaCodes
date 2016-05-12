import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int g,u,h;
int n,i;
int l[];
String d[];
n=Integer.parseInt(b.readLine());
d=new String[n];
l=new int[n];
for(i=0;i<n;i++)
l[i]=0;
for(i=0;i<n;i++)
d[i]=b.readLine();
for(i=0;i<n;i++)
{
StringTokenizer c=new StringTokenizer(d[i]);
g=Integer.parseInt(c.nextToken());
h=Integer.parseInt(c.nextToken());
while(g>0&&h>0)
{
if(g>h)
{
u=g/h;
g=g%h;
l[i]+=u;
}
else
{
u=h/g;
h=h%g;
l[i]+=u;
}
}
}
for(i=0;i<n;i++)
System.out.println(l[i]);
}
}