import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=0,r=0,j,index=0,val=0,i=0,n=0,m=0,query=0,test;
String s;
test=Integer.parseInt(b.readLine());
for(j=0;j<test;j++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[n+1];
int e[]=new int[n+1];
for(i=0;i<n+1;i++)
{
d[i]=0;
e[i]=0;
}
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
l=Integer.parseInt(x.nextToken());
r=Integer.parseInt(x.nextToken());
val=Integer.parseInt(x.nextToken());
d[l]+=val;
d[r+1]-=val;
}
e[0]=d[0];
for(i=1;i<n+1;i++)
e[i]=d[i]+e[i-1];
query=Integer.parseInt(b.readLine());
for(i=0;i<query;i++)
{
index=Integer.parseInt(b.readLine());
System.out.println(e[index]);
}
}
}
}