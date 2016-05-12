import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,i=0,index=1,t=0,m=0,n=0,flag=0;
String s;
long count=0;
t=Integer.parseInt(b.readLine());
int d[]=new int[t];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<t;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=1;i<t;i++)
if(d[i]!=d[i-1])
{
flag=1;
break;
}
if(flag==0)
{
System.out.print(d[0]+d[0]-1);
System.exit(0);
}
Arrays.sort(d);
for(i=1;i<t;i++)
{
if(i==1)
count+=d[i];
else
{
count+=(long)(d[i]-d[index]);
if(d[i]>d[index])
index=i;
}
}
if(d[0]>d[t-1]-d[1])
System.out.print(count+d[0]-d[t-1]+d[1]);
else
System.out.print(count);
}
}