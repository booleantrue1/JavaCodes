import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0,n=0,i=0,p=0,t=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m-1;i++)
{
for(j=i+1;j<m;j++)
if(d[j]>d[i])
{
t=d[i];
d[i]=d[j];
d[j]=t;
}
}
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
t=(-1)*(Integer.parseInt(y.nextToken()))+Integer.parseInt(y.nextToken())+1;
if(t>k)
k=t;
}
for(i=0;i<k;i++)
p+=d[i];
System.out.print(p);
}
}