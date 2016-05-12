import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int g=0,p=0,w=0,q=0,n=0,i=0,j=0,k=101,t=0;
String s;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
g=c.countTokens();
for(i=0;i<g;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=g-1;i>=0;i--)
{
if(d[i]>=j)
{
j=d[i];
p=i;
}
}
for(i=p;i>0;i--)
{
w=d[i];
d[i]=d[i-1];
d[i-1]=w;
}
for(i=0;i<g;i++)
{
if(d[i]<=k)
{
k=d[i];
q=i;
}
}
t=p+g-q-1;
System.out.print(t);
}
}
