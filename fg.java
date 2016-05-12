import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,t=0,j=0,i=0;
double p=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m;i++)
{
if(d[i]<0)
continue;
else
break;
}
if(i==m&&n>m)
{
if((n-m)%2==0)
for(i=0;i<m;i++)
p+=Math.abs(d[i]);
else
{
for(i=0;i<m;i++)
p+=Math.abs(d[i]);
p=p+2*d[m-1];
}
System.out.print((long)p);
}
else
{
for(i=0;i<m;i++)
{
if(n>0)
{
if(d[i]<0)
{
p+=(-d[i]);
n--;
}
else
{
if(n%2==0)
p+=d[i];
else
p+=(-d[i]);
n=0;
}
}
else
p+=d[i];
}
System.out.print((long)p);
}
}
}