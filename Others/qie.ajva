import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,c1=0,c2=0,c3=0,c4=0,flag1=0,flag2=0,sum1=0,sum2=0,sum3=0,m=0;
String s;
StringTokenizer x=new StringTokenizer(b.readLine());
c1=Integer.parseInt(x.nextToken());
c2=Integer.parseInt(x.nextToken());
c3=Integer.parseInt(x.nextToken());
c4=Integer.parseInt(x.nextToken());
StringTokenizer c=new StringTokenizer(b.readLine());
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[n];
int e[]=new int[m];
StringTokenizer z=new StringTokenizer(b.readLine());
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
StringTokenizer y=new StringTokenizer(b.readLine());
for(i=0;i<m;i++)
e[i]=Integer.parseInt(y.nextToken());
for(i=0;i<n;i++)
sum1+=(int)Math.min(c1*d[i],c2);
sum1=(int)Math.min(sum1,c3);
for(i=0;i<m;i++)
sum2+=(int)Math.min(c1*e[i],c2);
sum2=(int)Math.min(sum2,c3);
System.out.print((int)(Math.min((sum1+sum2),c4)));
}
}