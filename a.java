import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,j=0,l=0;
long k=0;
int g[];
long h[];
String d;
n=Integer.parseInt(b.readLine());
k=n;
d=b.readLine();
StringTokenizer c=new StringTokenizer(d);
g=new int[n];
h=new long[n];
h[0]=0;
l=c.countTokens();
for(i=0;i<l;i++)
g[i]=Integer.parseInt(c.nextToken());
if(l>1)
{
for(i=0;i<l-1;i++)
{
if(g[i]==g[i+1])
h[j]++;
else
{
if(h[j]>0)
j++;
}
}
if(g[l-1]==g[l-2])
{
for(i=0;i<=j;i++)
k+=(h[i]*(h[i]+1)/2);
System.out.print(k);
}
else
{
for(i=0;i<j;i++)
k+=(h[i]*(h[i]+1)/2);
System.out.print(k);
}
}
else
System.out.print("1");
}
}