import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n,i,count=0,flag=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<n;i++)
{
if(d[i]==i)
count++;
else
{
if(d[d[i]]==i)
flag=1;
}
}
if(count!=n)
System.out.print(count+flag+1);
else
System.out.print(count);
}
}