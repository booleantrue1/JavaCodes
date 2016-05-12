import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i1=0,y=1,i=0,n=0,j=0,p=0;
double m=0;
long t=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
m=Math.sqrt(n);
double e[]=new double[10];
for(i=0;i<10;i++)
e[i]=Math.pow(4,i+1);
for(i=0;;i++)
if(Math.pow(2,i)==m)
break;
p=i;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
k+=d[i];
}
k+=p*d[n-1];
Arrays.sort(d);
for(i=n-2;i>=0;i--)
{
if(Arrays.binarySearch(e,n-i-1)>=0)
y++;
if(y==p)
break;
t+=(p-y)*d[i];
}
System.out.print(k+t);
}
}