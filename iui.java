import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,m=0,a=0,x=0,k=1;
double t=0;
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n+1];
int e[]=new int[n+1];
d[0]=0;
e[0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
if(m==1)
{
a=Integer.parseInt(c.nextToken());
x=Integer.parseInt(c.nextToken());
d[a-1]+=x;
t+=(double)x*a;
System.out.println(t/k);
}
if(m==2)
{
a=Integer.parseInt(c.nextToken());
e[k]=a;
k++;
t+=(double)a;
System.out.println(t/k);
}
if(m==3)
{
t-=((double)e[k-1]+d[k-1]);
d[k-2]+=d[k-1];
d[k-1]=0;
k--;
e[k]=0;
System.out.println(t/k);
}
}
}
}