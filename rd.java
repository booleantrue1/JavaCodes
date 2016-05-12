import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
double y=0,sum=0,x=0;
int n=Integer.parseInt(b.readLine()),i=0,k=0;
String s;
double d[]=new double[2*n];
double e[]=new double[2*n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
d[k]=Double.parseDouble(c.nextToken());
e[k]=Double.parseDouble(c.nextToken());
k++;
d[k]=Double.parseDouble(c.nextToken());
e[k]=Double.parseDouble(c.nextToken());
k++;
sum+=(Math.abs((d[k-1]-d[k-2]))*Math.abs(e[k-1]-e[k-2]));
}
Arrays.sort(d);
Arrays.sort(e);
x=d[2*n-1]-d[0];
y=e[2*n-1]-e[0];
if(x==y&&x*y==sum)
System.out.print("YES");
else
System.out.print("NO");
}
}