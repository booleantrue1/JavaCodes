import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int count=0,i=0,n=0,k=0;
long p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[n];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(z.nextToken());
if(d[i]<0)
count++;
p+=(long)d[i];
}
if(d[0]>=0)
{
if(k%2==0)
System.out.print(p);
else
System.out.print(p-2*d[0]);
System.exit(0);
}
if(d[n-1]<0)
{
if(k>=n)
{
if((k-n)%2==0)
System.out.print((-1)*p);
else
System.out.print((-1)*p+2*d[n-1]);
System.exit(0);
}
else
{
p=0;
for(i=0;i<k;i++)
p+=(long)d[i];
p=(-1)*p;
for(i=k;i<n;i++)
p+=(long)d[i];
System.out.print(p);
System.exit(0);
}
}
p=0;
if(k>count)
{
for(i=0;i<count;i++)
p+=(long)d[i];
p=(-1)*p;
for(i=count;i<n;i++)
p+=(long)d[i];
if((k-count)%2==0)
System.out.print(p);
else
System.out.print(p-2*(long)Math.min(d[count],Math.abs(d[count-1])));
}
else
{
for(i=0;i<k;i++)
p+=(long)d[i];
p=(-1)*p;
for(i=k;i<n;i++)
p+=(long)d[i];
System.out.print(p);
}
}
}