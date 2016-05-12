import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,m=0,n=0,u=0,v=0,j=0,i=0;
double l=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n+2];
d[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Integer.parseInt(z.nextToken());;
if(m==1)
{
u=Integer.parseInt(z.nextToken());
v=Integer.parseInt(z.nextToken());
for(j=0;j<u;j++)
d[j]+=v;
l+=(u*v);
if(p<u-1)
p=u-1;
}
if(m==2)
{
d[p+1]=Integer.parseInt(z.nextToken());
p++;
l+=d[p];
}
if(m==3)
{
l-=d[p];
d[p]=0;
p--;
}
System.out.println(l/(p+1));
}
}
}