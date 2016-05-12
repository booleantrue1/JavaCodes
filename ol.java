import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m,n,i,u=0;
double p=0,k=0;
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
m=Integer.parseInt(z.nextToken());
n=Integer.parseInt(z.nextToken());
double d[]=new double[m];
for(i=0;i<m;i++)
d[i]=Double.parseDouble(b.readLine());
Arrays.sort(d);
for(i=0;i<n;i++)
{
p=Double.parseDouble(b.readLine());
u=Arrays.binarySearch(d,p);
if(u<0)
{
u=(-1)*u;
u-=1;
}
k+=(d[u]-p);
}
System.out.print((long)k);
}
}