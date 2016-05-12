import java.io.*;
import java.util.*;
class j
{
static int nooibn(int n)
{
int i=2,count=1,rem;
while(true)
{
if(n/i==0)
return count;
rem=n%i;
n=n/i;
if(rem==1)
count++;
}
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0,m=0;
long sum=0;
String s;
m=Integer.parseInt(b.readLine());
int d[]=new int[50];
for(i=0;i<50;i++)
d[i]=0;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
p=Integer.parseInt(z.nextToken());
//System.out.print(nooibn(p));
d[nooibn(p)-1]++;
}
for(i=0;i<50;i++)
sum+=(long)d[i]*(d[i]-1)/2;
System.out.print(sum);
}
}