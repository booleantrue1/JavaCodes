import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0,j=0,p=0,m=0,x=-100000000,y=-100000000;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
int d[]=new int[1001];
d[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Integer.parseInt(z.nextToken());
k=Integer.parseInt(z.nextToken());
for(j=(int)Math.min(m,k);j<=(int)Math.max(m,k);j++)
d[j]++;
}
if(d[p]==n)
System.out.print("0");
else
{
for(i=0;i<1001;i++)
if(d[i]==n)
{
x=i;
break;
}
for(i=1000;i>=0;i--)
if(d[i]==n)
{
y=i;
break;
}
if(x<0&&y<0)
System.out.print("-1");
else
System.out.print((int)Math.min(Math.abs(x-p),Math.abs(y-p)));
}
}
}