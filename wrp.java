import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,count=0,l=0,i=0,k=0,n=0,m=0,t=0;
String s;
long sum=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[m*n*k+1];
for(i=0;i<=m;i++)
for(j=0;j<=n;j++)
for(l=0;l<=k;l++)
{
if(d[i*j*l]!=0)
{
sum+=(long)d[i*j*l];
sum%=1073741824;
}
else
{
count=0;
for(t=1;t*t<=i*j*l;t++)
if(i*j*l%t==0)
{
if(i*j*l/t==t)
count++;
else
count+=2;
}
d[i*j*l]=count;
sum+=(long)d[i*j*l];
sum%=1073741824;
}
}
System.out.print(sum);
}
}