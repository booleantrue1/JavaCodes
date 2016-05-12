import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,j=0,n=0,i=0;
String s,r;
n=Integer.parseInt(b.readLine());
int d[];
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
d=new int[n];
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(d[j]>d[i])
{
t=d[j];
d[j]=d[i];
d[i]=t;
}
}
}
t=d[0];
if(t!=1)
System.out.print("1");
else
{
for(i=0;i<n;i++)
{
if(d[i]==t+i)
continue;
else
break;
}
System.out.print(t+i);
}
}
}