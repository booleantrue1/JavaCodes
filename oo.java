import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,q=0,j=0,k=0,n=0,p=0;
int d[];
String s[];
String r;
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
s=new String[n];
d=new int[n];
d[0]=0;
for(i=0;i<n;i++)
s[i]=b.readLine();
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
q=Integer.parseInt(s[j].substring(i,i+1));
if(q>p)
p=q;
}
for(j=0;j<n;j++)
{
q=Integer.parseInt(s[j].substring(i,i+1));
if(p==q)
d[j]=1;
}
p=0;
}
for(i=0;i<n;i++)
{
if(d[i]==1)
k++;
}
System.out.print(k);
}
}