import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,max=-2,p=0,j=0,k=0;
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n];
int e[]=new int[n];
d[0]=0;
e[0]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Integer.parseInt(c.nextToken());
if(k==0)
d[0]=1;
else
e[0]=1;
p=d[0]-e[0];
if(p>=max)
max=p;
for(i=1;i<n;i++)
{
k=Integer.parseInt(c.nextToken());
if(k==0)
{
d[i]=d[i-1]+1;
e[i]=e[i-1];
}
else
{
e[i]=e[i-1]+1;
d[i]=d[i-1];
}
p=d[i]-e[i];
if(p>=max)
max=p;
}
for(i=1;i<n;i++)
{
for(j=i;j<n;j++)
{
p=(d[j]-d[i-1])-(e[j]-e[i-1]);
if(p>=max)
max=p;
}
}
System.out.print(e[n-1]+max);
}
}