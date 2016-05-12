import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0,n=0,p=0,i=0;
double t=0,q=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
m=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
p=Integer.parseInt(z.nextToken());
if(p<n/2)
{
for(j=0;j<n;j++)
{
if(p==d[j])
{
t+=j+1;
q+=n-j;
break;
}
}
}
else
{
for(j=n-1;j>=0;j--)
{
if(p==d[j])
{
t+=j+1;
q+=n-j;
break;
}
}
}
}
System.out.print((long)t+" "+(long)q);
}
}