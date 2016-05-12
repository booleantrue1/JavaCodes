import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,j=0,k=0,t=0,n=0;
String p;
int d[]=new int[12];
n=Integer.parseInt(b.readLine());
p=b.readLine();
StringTokenizer c=new StringTokenizer(p);
for(i=0;i<12;i++)
d[i]=Integer.parseInt(c.nextToken());
for(j=0;j<11;j++)
{
for(i=j+1;i<12;i++)
{
if(d[j]<d[i])
{
t=d[j];
d[j]=d[i];
d[i]=t;
}
}
}
if(n==0)
System.out.print("0");
else
{
for(i=0;i<12;i++)
k+=d[i];
if(n>k)
System.out.print("-1");
else
{
for(i=0;i<12;i++)
{
m+=d[i];
if(m>=n)
{
System.out.print(i+1);
break;
}
}
}
}
}
}