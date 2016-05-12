import java.io.*;
import java.util.*;
class GOODC
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int easy=0,hard=0,easyind=-1,hardind=-1,max=1000000002,min=-1,j=0,p=0,m=0,i=0,n=0,t=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[n];
d[0]=0;
for(i=0;i<m;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
p=Integer.parseInt(z.nextToken());
t=Integer.parseInt(z.nextToken());
if(p==2)
{
d[t-1]++;
for(j=0;j<n;j++)
{
if(d[j]>=0)
{
if(d[j]>min)
{
min=d[j];
easyind=j;
}
if(d[j]<=max)
{
max=d[j];
hardind=j;
}
}
}
}
else
{
d[t-1]=-1000000005;
for(j=0;j<n;j++)
{
if(d[j]>=0)
{
if(d[j]>min)
{
min=d[j];
easyind=j;
}
if(d[j]<=max)
{
max=d[j];
hardind=j;
}
}
}
}
if(min==-1&&max==1000000002)
System.out.println("Make noise");
else
System.out.println(easyind+1+" "+(hardind+1));
easyind=-1;
hardind=-1;
max=1000000002;
min=-1;
}
}
}