import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,j=0,t=0,n=0;
String p;
int d[];
int e[]=new int[1001];
e[0]=0;
n=Integer.parseInt(b.readLine());
d=new int[n];
p=b.readLine();
StringTokenizer c=new StringTokenizer(p);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(j=1;j<=1000;j++)
{
for(i=0;i<n;i++)
{
if(d[i]==j)
e[j]++;
}
}
for(i=0;i<=1000;i++)
if(e[i]>=t)
t=e[i];
for(i=1;i<=1000;i++)
if(e[i]!=0)
m++;
System.out.print(t+" "+m);
}
}