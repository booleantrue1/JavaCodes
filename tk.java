import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,i=0,p=0,tr=-1,tl=-1,n=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
int d[]=new int[n];
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
Arrays.sort(d);
if(n%2==0)
p=n/2-1;
else
p=n/2;
if(d[p]==k)
{
System.out.print("0");
System.exit(0);
}
else
{
for(i=p;i>=0;i--)
if(d[i]==k)
{
tl=i;
break;
}
for(i=p;i<n;i++)
if(d[i]==k)
{
tr=i;
break;
}
if(tr>=0&&tl>=0)
{
if(n%2==1)
{
System.out.print((int)Math.min(2*(p-tl)-1,2*(tr-p)));
}
else
{
System.out.print((int)Math.min(2*(p-tl),2*(tr-p)-1));
}
}
else
{
if(tl>=0)
{
if(n%2==1)
System.out.print(2*(p-tl)-1);
else
System.out.print(2*(p-tl));
}
else
{
if(tr>=0)
{
if(n%2==1)
System.out.print(2*(tr-p));
else
System.out.print(2*(tr-p)-1);
}
else
{
if(k<d[0])
{
if(n%2==0)
{
p++;
System.out.print(2*p);
}
else
System.out.print(2*p+1);
}
if(k>d[n-1])
{
if(n%2==0)
{
p++;
System.out.print(2*(n-p)+1);
}
else
System.out.print(2*(n-p));
}
if(k>d[0]&&k<d[n-1])
{
x=Arrays.binarySearch(d,k);
x=(-1)*x-1;
if(n%2==0)
p++;
if(x==p)
{
System.out.print("1");
System.exit(0);
}
if(x<p)
{
if(n%2==0)
System.out.print(2*(p-x));
else
System.out.print(2*(p-x)+1);
}
if(x>p)
{
if(n%2==0)
System.out.print(2*(x-p)+1);
else
System.out.print(2*(x-p));
}
}
}
}
}
}
}
}