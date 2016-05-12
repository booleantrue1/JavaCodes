import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,k=0,f=0,i=0,t=0;
String s,r;
int d[];
r=b.readLine();
StringTokenizer z=new StringTokenizer(r);
n=Integer.parseInt(z.nextToken());
k=Integer.parseInt(z.nextToken());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=k-1;i<n;i++)
if(d[i]!=d[k-1])
{
f=1;
break;
}
if(f==1)
System.out.print("-1");
else
{
for(i=k-2;i>=0;i--)
{
if(d[i]==d[k-1])
t++;
else
break;
}
System.out.print(k-1-t);
}
}
}


