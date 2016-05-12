import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,w=0,q=0,n=0,i=0,j=0,t=0;
String r,s;
int d[];
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
p=Integer.parseInt(c.nextToken());
w=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d=new int[p];
for(i=0;i<p;i++)
d[i]=Integer.parseInt(z.nextToken());
for(j=0;j<p-1;j++)
{
for(i=j+1;i<p;i++)
{
if(d[j]<d[i])
{
q=d[j];
d[j]=d[i];
d[i]=q;
}
}
}
for(i=0;i<p;i++)
{
if(w<=n)
break;
else
{
n+=d[i]-1;
t++;
}
}
if(i==p&&w>n)
System.out.print("-1");
else
System.out.print(t);
}
}