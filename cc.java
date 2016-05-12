import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,n=0,i=0;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
if(n==1||n==2)
System.out.print("-1");
else
{
for(i=0;i<n;i++)
{
if(d[0]!=d[i])
{
f=1;
break;
}
}
if(f==0)
System.out.print("-1");
else
{
for(i=0;i<n-1;i++)
{
if(d[i]!=d[i+1])
break;
}
System.out.print(i+1+" "+(i+2));
}
}
}
}






