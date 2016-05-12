import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,m=0,t=0;
String s[];
String g,h;
n=Integer.parseInt(b.readLine());
s=new String[n];
for(i=0;i<n;i++)
s[i]=b.readLine();
for(i=0;i<n;i++)
{
StringTokenizer c=new StringTokenizer(s[i]);
g=c.nextToken();
h=c.nextToken();
t=t-(Integer.parseInt(g))+(Integer.parseInt(h));
if(t>m)
m=t;
}
System.out.print(m);
}
}