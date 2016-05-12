import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,min=1000000000,len=0,k=0,i=0,t=0,y=0,x=0,flag=0,index=0,mod=0,count=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[9];
int e[]=new int[9];
for(i=0;i<9;i++)
{
d[i]=0;
e[i]=0;
}
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<9;i++)
{
d[i]=Integer.parseInt(c.nextToken());
if(d[i]<=min)
{
index=i;
min=d[i];
}
}
if(t<min)
{
System.out.print("-1");
System.exit(0);
}
len=t/min;
mod=t%min;
e[index]+=len;
for(j=8;j>index;j--)
{
count=mod/(d[j]-d[index]);
e[j]+=count;
e[index]-=count;
mod=mod%(d[j]-d[index]);
}
for(i=8;i>=0;i--)
for(j=0;j<e[i];j++)
System.out.print(i+1);
}
}